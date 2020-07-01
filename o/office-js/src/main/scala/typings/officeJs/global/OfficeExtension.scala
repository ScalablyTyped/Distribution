package typings.officeJs.global

import org.scalablytyped.runtime.TopLevel
import typings.officeJs.Office.IPromiseConstructor
import typings.officeJs.OfficeExtension.DebugInfo
import typings.officeJs.OfficeExtension.EmbeddedOptions
import typings.officeJs.OfficeExtension.EventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    extends typings.officeJs.OfficeExtension.ClientObject {
    /** The request context associated with the object */
    /* CompleteClass */
    override var context: typings.officeJs.OfficeExtension.ClientRequestContext = js.native
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
      * isNullObject property.
      */
    /* CompleteClass */
    override var isNullObject: Boolean = js.native
  }
  
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
    extends typings.officeJs.OfficeExtension.ClientResult[T] {
    /** The value of the result that is retrieved from the document after `context.sync()` is invoked. */
    /* CompleteClass */
    override var value: T = js.native
  }
  
  @js.native
  class EmbeddedSession protected ()
    extends typings.officeJs.OfficeExtension.EmbeddedSession {
    def this(url: String) = this()
    def this(url: String, options: EmbeddedOptions) = this()
    /* CompleteClass */
    override def init(): js.Promise[_] = js.native
  }
  
  /** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
  @js.native
  class Error ()
    extends typings.officeJs.OfficeExtension.Error {
    /** Error code string, such as "InvalidArgument". */
    /* CompleteClass */
    override var code: String = js.native
    /** Debug info (useful for detailed logging of the error, i.e., via `JSON.stringify(...)`). */
    /* CompleteClass */
    override var debugInfo: DebugInfo = js.native
    /** Inner error, if applicable. */
    /* CompleteClass */
    override var innerError: typings.officeJs.OfficeExtension.Error = js.native
    /** The error message passed through from the host Office application. */
    /* CompleteClass */
    override var message: String = js.native
    /** Error name: "OfficeExtension.Error".*/
    /* CompleteClass */
    override var name: String = js.native
    /** Stack trace, if applicable. */
    /* CompleteClass */
    override var stack: String = js.native
    /**
      * Trace messages (if any) that were added via a `context.trace()` invocation before calling `context.sync()`. 
      * If there was an error, this contains all trace messages that were executed before the error occurred. 
      * These messages can help you monitor the program execution sequence and detect the case of the error.
      */
    /* CompleteClass */
    override var traceMessages: js.Array[String] = js.native
  }
  
  @js.native
  class ErrorCodes ()
    extends typings.officeJs.OfficeExtension.ErrorCodes
  
  @js.native
  class EventHandlerResult[T] protected ()
    extends typings.officeJs.OfficeExtension.EventHandlerResult[T] {
    def this(
      context: typings.officeJs.OfficeExtension.ClientRequestContext,
      handlers: typings.officeJs.OfficeExtension.EventHandlers[T],
      handler: js.Function1[/* args */ T, js.Promise[_]]
    ) = this()
    /** The request context associated with the object */
    /* CompleteClass */
    override var context: typings.officeJs.OfficeExtension.ClientRequestContext = js.native
    /* CompleteClass */
    override def remove(): Unit = js.native
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
    /**
      * Adds a function to be called when the event is triggered.
      * @param handler A promise-based function that takes in any relevant event arguments.
      */
    /* CompleteClass */
    override def add(handler: js.Function1[T, js.Promise[_]]): typings.officeJs.OfficeExtension.EventHandlerResult[T] = js.native
    /**
      * Removes the specified function from the event handler list so that it will not be called on subsequent events. 
      * 
      * **Note**: The same {@link OfficeExtension.ClientRequestContext | RequestContext} object that the handler was added in must be used when removing the handler. 
      * More information can be found in {@link https://docs.microsoft.com/office/dev/add-ins/develop/common-coding-issues#removing-event-handlers | Coding guidance for common issues and unexpected platform behaviors}. 
      * 
      * @param handler A reference to a function previously provided to the `add` method as an event handler. 
      */
    /* CompleteClass */
    override def remove(handler: js.Function1[T, js.Promise[_]]): Unit = js.native
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
  
  /** Collection of tracked objects, contained within a request context. See "context.trackedObjects" for more information. */
  @js.native
  class TrackedObjects ()
    extends typings.officeJs.OfficeExtension.TrackedObjects
  
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
  
  /**
    * A Promise object that represents a deferred interaction with the host Office application. 
    * The publicly-consumable OfficeExtension.Promise is available starting in ExcelApi 1.2 and WordApi 1.2. 
    * Promises can be chained via ".then", and errors can be caught via ".catch". 
    * Remember to always use a ".catch" on the outer promise, and to return intermediary promises so as not to break the promise chain. 
    * When a browser-provided native Promise implementation is available, OfficeExtension.Promise will switch to use the native Promise instead.
    */
  @js.native
  object Promise extends TopLevel[IPromiseConstructor]
  
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

