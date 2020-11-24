package typings.officeJs.global

import org.scalablytyped.runtime.TopLevel
import typings.officeJs.Office.IPromiseConstructor
import typings.officeJs.OfficeExtension.EmbeddedOptions
import typings.officeJs.OfficeExtension.EventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
/////////////////////// End Exchange APIs //////////////////////
////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//////////////// Begin OfficeExtension runtime /////////////////
////////////////////////////////////////////////////////////////
@JSGlobal("OfficeExtension")
@js.native
object OfficeExtension extends js.Object {
  
  /**
    * An abstract proxy object that represents an object in an Office document. 
    * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the 
    * proxy object state with the document by calling `context.sync()`.
    */
  @js.native
  class ClientObject ()
    extends typings.officeJs.OfficeExtension.ClientObject
  
  /**
    * An abstract RequestContext object that facilitates requests to the host Office application. 
    * The `Excel.run` and `Word.run` methods provide a request context.
    */
  @js.native
  class ClientRequestContext ()
    extends typings.officeJs.OfficeExtension.ClientRequestContext {
    def this(url: String) = this()
  }
  
  /** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
  @js.native
  class ClientResult[T] ()
    extends typings.officeJs.OfficeExtension.ClientResult[T]
  
  @js.native
  class EmbeddedSession protected ()
    extends typings.officeJs.OfficeExtension.EmbeddedSession {
    def this(url: String) = this()
    def this(url: String, options: EmbeddedOptions) = this()
  }
  
  /** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
  @js.native
  class Error ()
    extends typings.officeJs.OfficeExtension.Error
  
  @js.native
  class ErrorCodes ()
    extends typings.officeJs.OfficeExtension.ErrorCodes
  /* static members */
  @js.native
  object ErrorCodes extends js.Object {
    
    var accessDenied: String = js.native
    
    var activityLimitReached: String = js.native
    
    var apiNotFound: String = js.native
    
    var cannotRegisterEvent: String = js.native
    
    var connectionFailure: String = js.native
    
    var generalException: String = js.native
    
    var invalidArgument: String = js.native
    
    var invalidObjectPath: String = js.native
    
    var invalidRequestContext: String = js.native
    
    var propertyNotLoaded: String = js.native
    
    var runMustReturnPromise: String = js.native
    
    var valueNotLoaded: String = js.native
  }
  
  @js.native
  class EventHandlerResult[T] protected ()
    extends typings.officeJs.OfficeExtension.EventHandlerResult[T] {
    def this(
      context: typings.officeJs.OfficeExtension.ClientRequestContext,
      handlers: typings.officeJs.OfficeExtension.EventHandlers[T],
      handler: js.Function1[/* args */ T, js.Promise[_]]
    ) = this()
  }
  
  @js.native
  class EventHandlers[T] protected ()
    extends typings.officeJs.OfficeExtension.EventHandlers[T] {
    def this(
      context: typings.officeJs.OfficeExtension.ClientRequestContext,
      parentObject: typings.officeJs.OfficeExtension.ClientObject,
      name: String,
      eventInfo: EventInfo[T]
    ) = this()
  }
  
  @js.native
  class Promise[T] protected ()
    extends typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  /**
    * A Promise object that represents a deferred interaction with the host Office application. 
    * The publicly-consumable OfficeExtension.Promise is available starting in ExcelApi 1.2 and WordApi 1.2. 
    * Promises can be chained via ".then", and errors can be caught via ".catch". 
    * Remember to always use a ".catch" on the outer promise, and to return intermediary promises so as not to break the promise chain. 
    * When a browser-provided native Promise implementation is available, OfficeExtension.Promise will switch to use the native Promise instead.
    */
  @js.native
  object Promise extends TopLevel[IPromiseConstructor]
  
  /** Collection of tracked objects, contained within a request context. See "context.trackedObjects" for more information. */
  @js.native
  class TrackedObjects ()
    extends typings.officeJs.OfficeExtension.TrackedObjects
  
  /** Configuration */
  @js.native
  object config extends js.Object {
    
    /**
      * Determines whether to log additional error information upon failure.
      *
      * When this property is set to true, the error object will include a "debugInfo.fullStatements" property that lists all statements in the 
      * batch request, including all statements that precede and follow the point of failure.
      *
      * Setting this property to true will negatively impact performance and will log all statements in the batch request, including any statements 
      * that may contain potentially-sensitive data.
      * It is recommended that you only set this property to true during debugging and that you never log the value of 
      * error.debugInfo.fullStatements to an external database or analytics service.
      */
    var extendedErrorLogging: Boolean = js.native
  }
}
