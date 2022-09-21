package typings.openfin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @js.native
  sealed trait ApplicationError extends StObject
  @JSImport("openfin/_v2/fdc3/errors", "ApplicationError")
  @js.native
  object ApplicationError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ApplicationError & String] = js.native
    
    /**
      * Indicates that an application could not be started from an OpenFin manifest.
      */
    @js.native
    sealed trait LaunchError
      extends StObject
         with ApplicationError
    /* "ApplicationError:LaunchError" */ val LaunchError: typings.openfin.errorsMod.ApplicationError.LaunchError & String = js.native
    
    /**
      * Indicates that a timeout was reached before the application was started.
      */
    @js.native
    sealed trait LaunchTimeout
      extends StObject
         with ApplicationError
    /* "ApplicationError:LaunchTimeout" */ val LaunchTimeout: typings.openfin.errorsMod.ApplicationError.LaunchTimeout & String = js.native
    
    /**
      * Indicates that an application of the provided name could not be found, either running or in the application directory.
      */
    @js.native
    sealed trait NotFound
      extends StObject
         with ApplicationError
    /* "ApplicationError:NotFound" */ val NotFound: typings.openfin.errorsMod.ApplicationError.NotFound & String = js.native
  }
  
  @js.native
  sealed trait ChannelError extends StObject
  @JSImport("openfin/_v2/fdc3/errors", "ChannelError")
  @js.native
  object ChannelError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChannelError & String] = js.native
    
    /**
      * Indicates that a channel of a provided ID does not exist.
      */
    @js.native
    sealed trait ChannelWithIdDoesNotExist
      extends StObject
         with ChannelError
    /* "ChannelError:ChannelWithIdDoesNotExist" */ val ChannelWithIdDoesNotExist: typings.openfin.errorsMod.ChannelError.ChannelWithIdDoesNotExist & String = js.native
  }
  
  @js.native
  sealed trait ConnectionError extends StObject
  @JSImport("openfin/_v2/fdc3/errors", "ConnectionError")
  @js.native
  object ConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ConnectionError & String] = js.native
    
    /**
      * Indicates that no window with a provided OpenFin Identity is registered with the FDC3 service.
      */
    @js.native
    sealed trait WindowWithIdentityNotFound
      extends StObject
         with ConnectionError
    /* "ConnectionError:WindowWithIdentityNotFound" */ val WindowWithIdentityNotFound: typings.openfin.errorsMod.ConnectionError.WindowWithIdentityNotFound & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/errors", "FDC3Error")
  @js.native
  open class FDC3Error protected ()
    extends StObject
       with Error {
    def this(code: String, message: String) = this()
    
    /**
      * A string from one of [[ApplicationError]], [[ChannelError]], [[ConnectionError]], [[ResolveError]] or [[SendContextError]].
      *
      * Future versions of the service may add additional error codes. Applications should allow for the possibility of
      * error codes that do not exist in the above enumerations.
      */
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait ResolveError extends StObject
  @JSImport("openfin/_v2/fdc3/errors", "ResolveError")
  @js.native
  object ResolveError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResolveError & String] = js.native
    
    /**
      * Indicates that a provided application does not handle the provided intent and context.
      */
    @js.native
    sealed trait AppDoesNotHandleIntent
      extends StObject
         with ResolveError
    /* "ResolveError:AppDoesNotHandleIntent" */ val AppDoesNotHandleIntent: typings.openfin.errorsMod.ResolveError.AppDoesNotHandleIntent & String = js.native
    
    /**
      * Indicates that no application could be found to handle the provided intent and context.
      */
    @js.native
    sealed trait NoAppsFound
      extends StObject
         with ResolveError
    /* "ResolveError:NoAppsFound" */ val NoAppsFound: typings.openfin.errorsMod.ResolveError.NoAppsFound & String = js.native
    
    /**
      * Indicates that intent resolution has been cancelled because the user dismissed the intent resolver UI.
      */
    @js.native
    sealed trait ResolverClosedOrCancelled
      extends StObject
         with ResolveError
    /* "ResolveError:ResolverClosedOrCancelled" */ val ResolverClosedOrCancelled: typings.openfin.errorsMod.ResolveError.ResolverClosedOrCancelled & String = js.native
  }
  
  @js.native
  sealed trait SendContextError extends StObject
  @JSImport("openfin/_v2/fdc3/errors", "SendContextError")
  @js.native
  object SendContextError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SendContextError & String] = js.native
    
    /**
      * Indicates that all handlers for the given context threw an error when invoked.
      */
    @js.native
    sealed trait HandlerError
      extends StObject
         with SendContextError
    /* "SendContextError:HandlerError" */ val HandlerError: typings.openfin.errorsMod.SendContextError.HandlerError & String = js.native
    
    /**
      * Indicates that all handers for the given context failed to completed before a timeout was reached
      */
    @js.native
    sealed trait HandlerTimeout
      extends StObject
         with SendContextError
    /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typings.openfin.errorsMod.SendContextError.HandlerTimeout & String = js.native
    
    /**
      * Indicates that the target application has no windows that have a relevant handler for the given context.
      */
    @js.native
    sealed trait NoHandler
      extends StObject
         with SendContextError
    /* "SendContextError:NoHandler" */ val NoHandler: typings.openfin.errorsMod.SendContextError.NoHandler & String = js.native
  }
}
