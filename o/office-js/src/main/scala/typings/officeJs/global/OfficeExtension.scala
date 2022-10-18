package typings.officeJs.global

import typings.officeJs.Office.IPromiseConstructor
import typings.officeJs.OfficeExtension.DebugInfo
import typings.officeJs.OfficeExtension.EmbeddedOptions
import typings.officeJs.OfficeExtension.EventInfo
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
/////////////////////// End Exchange APIs //////////////////////
////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//////////////// Begin OfficeExtension runtime /////////////////
////////////////////////////////////////////////////////////////
object OfficeExtension {
  
  /**
    * An abstract proxy object that represents an object in an Office document.
    * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the
    * proxy object state with the document by calling `context.sync()`.
    */
  @JSGlobal("OfficeExtension.ClientObject")
  @js.native
  open class ClientObject ()
    extends StObject
       with typings.officeJs.OfficeExtension.ClientObject {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: typings.officeJs.OfficeExtension.ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * An abstract RequestContext object that facilitates requests to the Office application.
    * The `Excel.run` and `Word.run` methods provide a request context.
    */
  @JSGlobal("OfficeExtension.ClientRequestContext")
  @js.native
  open class ClientRequestContext ()
    extends StObject
       with typings.officeJs.OfficeExtension.ClientRequestContext {
    def this(url: String) = this()
  }
  
  /** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
  @JSGlobal("OfficeExtension.ClientResult")
  @js.native
  open class ClientResult[T] ()
    extends StObject
       with typings.officeJs.OfficeExtension.ClientResult[T] {
    
    /** The value of the result that is retrieved from the document after `context.sync()` is invoked. */
    /* CompleteClass */
    var value: T = js.native
  }
  
  @JSGlobal("OfficeExtension.EmbeddedSession")
  @js.native
  open class EmbeddedSession protected ()
    extends StObject
       with typings.officeJs.OfficeExtension.EmbeddedSession {
    def this(url: String) = this()
    def this(url: String, options: EmbeddedOptions) = this()
    
    /* CompleteClass */
    override def init(): js.Promise[Any] = js.native
  }
  
  /** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
  @JSGlobal("OfficeExtension.Error")
  @js.native
  open class Error ()
    extends StObject
       with typings.officeJs.OfficeExtension.Error {
    
    /** Error code string, such as "InvalidArgument". */
    /* CompleteClass */
    var code: String = js.native
    
    /** Debug info (useful for detailed logging of the error, i.e., via `JSON.stringify(...)`). */
    /* CompleteClass */
    var debugInfo: DebugInfo = js.native
    
    /** Inner error, if applicable. */
    /* CompleteClass */
    var innerError: typings.officeJs.OfficeExtension.Error = js.native
    
    /** The error message passed through from the Office application. */
    /* CompleteClass */
    var message: String = js.native
    
    /** Error name: "OfficeExtension.Error".*/
    /* CompleteClass */
    var name: String = js.native
    
    /** Stack trace, if applicable. */
    /* CompleteClass */
    var stack: String = js.native
    
    /**
      * Trace messages (if any) that were added via a `context.trace()` invocation before calling `context.sync()`.
      * If there was an error, this contains all trace messages that were executed before the error occurred.
      * These messages can help you monitor the program execution sequence and detect the case of the error.
      */
    /* CompleteClass */
    var traceMessages: js.Array[String] = js.native
  }
  
  @JSGlobal("OfficeExtension.ErrorCodes")
  @js.native
  open class ErrorCodes ()
    extends StObject
       with typings.officeJs.OfficeExtension.ErrorCodes
  object ErrorCodes {
    
    @JSGlobal("OfficeExtension.ErrorCodes")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.accessDenied")
    @js.native
    def accessDenied: String = js.native
    inline def accessDenied_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessDenied")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.activityLimitReached")
    @js.native
    def activityLimitReached: String = js.native
    inline def activityLimitReached_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activityLimitReached")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.apiNotFound")
    @js.native
    def apiNotFound: String = js.native
    inline def apiNotFound_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiNotFound")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.cannotRegisterEvent")
    @js.native
    def cannotRegisterEvent: String = js.native
    inline def cannotRegisterEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cannotRegisterEvent")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.connectionFailure")
    @js.native
    def connectionFailure: String = js.native
    inline def connectionFailure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionFailure")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.generalException")
    @js.native
    def generalException: String = js.native
    inline def generalException_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generalException")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.invalidArgument")
    @js.native
    def invalidArgument: String = js.native
    inline def invalidArgument_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.invalidObjectPath")
    @js.native
    def invalidObjectPath: String = js.native
    inline def invalidObjectPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidObjectPath")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.invalidRequestContext")
    @js.native
    def invalidRequestContext: String = js.native
    inline def invalidRequestContext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidRequestContext")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.propertyNotLoaded")
    @js.native
    def propertyNotLoaded: String = js.native
    inline def propertyNotLoaded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyNotLoaded")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.runMustReturnPromise")
    @js.native
    def runMustReturnPromise: String = js.native
    inline def runMustReturnPromise_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runMustReturnPromise")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.valueNotLoaded")
    @js.native
    def valueNotLoaded: String = js.native
    inline def valueNotLoaded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueNotLoaded")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("OfficeExtension.EventHandlerResult")
  @js.native
  open class EventHandlerResult[T] protected ()
    extends StObject
       with typings.officeJs.OfficeExtension.EventHandlerResult[T] {
    def this(
      context: typings.officeJs.OfficeExtension.ClientRequestContext,
      handlers: typings.officeJs.OfficeExtension.EventHandlers[T],
      handler: js.Function1[/* args */ T, js.Promise[Any]]
    ) = this()
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: typings.officeJs.OfficeExtension.ClientRequestContext = js.native
    
    /* CompleteClass */
    override def remove(): Unit = js.native
  }
  
  @JSGlobal("OfficeExtension.EventHandlers")
  @js.native
  open class EventHandlers[T] protected ()
    extends StObject
       with typings.officeJs.OfficeExtension.EventHandlers[T] {
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
    override def add(handler: js.Function1[T, js.Promise[Any]]): typings.officeJs.OfficeExtension.EventHandlerResult[T] = js.native
    
    /**
      * Removes the specified function from the event handler list so that it will not be called on subsequent events.
      *
      * **Note**: The same {@link OfficeExtension.ClientRequestContext | RequestContext} object that the handler was added in must be used when removing the handler.
      * More information can be found in {@link https://learn.microsoft.com/office/dev/add-ins/excel/excel-add-ins-events#remove-an-event-handler | Remove an event handler}.
      *
      * @param handler A reference to a function previously provided to the `add` method as an event handler.
      */
    /* CompleteClass */
    override def remove(handler: js.Function1[T, js.Promise[Any]]): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OfficeExtension.Promise")
  @js.native
  open class Promise[T] protected ()
    extends StObject
       with typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  /**
    * A Promise object that represents a deferred interaction with the Office application.
    * The publicly-consumable OfficeExtension.Promise is available starting in ExcelApi 1.2 and WordApi 1.2.
    * Promises can be chained via ".then", and errors can be caught via ".catch".
    * Remember to always use a ".catch" on the outer promise, and to return intermediary promises so as not to break the promise chain.
    * When a browser-provided native Promise implementation is available, OfficeExtension.Promise will switch to use the native Promise instead.
    */
  @JSGlobal("OfficeExtension.Promise")
  @js.native
  val Promise: IPromiseConstructor = js.native
  
  /**
    * Collection of tracked objects, contained within a request context.
    * See {@link https://learn.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects}
    * for more information.
    */
  @JSGlobal("OfficeExtension.TrackedObjects")
  @js.native
  open class TrackedObjects ()
    extends StObject
       with typings.officeJs.OfficeExtension.TrackedObjects
  
  /** Configuration */
  object config {
    
    @JSGlobal("OfficeExtension.config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether to log additional error information upon failure.
      *
      * When this property is set to true, the error object will include a `debugInfo.fullStatements` property that lists all statements in the
      * batch request, including all statements that precede and follow the point of failure.
      *
      * Setting this property to true will negatively impact performance and will log all statements in the batch request, including any statements
      * that may contain potentially-sensitive data.
      * It is recommended that you only set this property to true during debugging and that you never log the value of
      * error.debugInfo.fullStatements to an external database or analytics service.
      */
    @JSGlobal("OfficeExtension.config.extendedErrorLogging")
    @js.native
    def extendedErrorLogging: Boolean = js.native
    inline def extendedErrorLogging_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedErrorLogging")(x.asInstanceOf[js.Any])
  }
}
