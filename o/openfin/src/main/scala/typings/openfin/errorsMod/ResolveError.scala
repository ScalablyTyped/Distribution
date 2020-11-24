package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResolveError extends js.Object
@JSImport("openfin/_v2/fdc3/errors", "ResolveError")
@js.native
object ResolveError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResolveError with String] = js.native
  
  /**
    * Indicates that a provided application does not handle the provided intent and context.
    */
  @js.native
  sealed trait AppDoesNotHandleIntent extends ResolveError
  /* "ResolveError:AppDoesNotHandleIntent" */ @js.native
  object AppDoesNotHandleIntent extends TopLevel[AppDoesNotHandleIntent with String]
  
  /**
    * Indicates that no application could be found to handle the provided intent and context.
    */
  @js.native
  sealed trait NoAppsFound extends ResolveError
  /* "ResolveError:NoAppsFound" */ @js.native
  object NoAppsFound extends TopLevel[NoAppsFound with String]
  
  /**
    * Indicates that intent resolution has been cancelled because the user dismissed the intent resolver UI.
    */
  @js.native
  sealed trait ResolverClosedOrCancelled extends ResolveError
  /* "ResolveError:ResolverClosedOrCancelled" */ @js.native
  object ResolverClosedOrCancelled extends TopLevel[ResolverClosedOrCancelled with String]
}
