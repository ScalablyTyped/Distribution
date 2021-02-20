package typings.officeJsPreview.global

import typings.officeJsPreview.Office.IPromiseConstructor
import typings.officeJsPreview.OfficeExtension.EmbeddedOptions
import typings.officeJsPreview.OfficeExtension.EventInfo
import org.scalablytyped.runtime.StObject
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
object OfficeExtension {
  
  /**
    * An abstract proxy object that represents an object in an Office document.
    * You create proxy objects from the context (or from other proxy objects), add commands to a queue to act on the object, and then synchronize the
    * proxy object state with the document by calling `context.sync()`.
    */
  @JSGlobal("OfficeExtension.ClientObject")
  @js.native
  class ClientObject ()
    extends typings.officeJsPreview.OfficeExtension.ClientObject
  
  /**
    * An abstract RequestContext object that facilitates requests to the host Office application.
    * The `Excel.run` and `Word.run` methods provide a request context.
    */
  @JSGlobal("OfficeExtension.ClientRequestContext")
  @js.native
  class ClientRequestContext ()
    extends typings.officeJsPreview.OfficeExtension.ClientRequestContext {
    def this(url: String) = this()
  }
  
  /** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
  @JSGlobal("OfficeExtension.ClientResult")
  @js.native
  class ClientResult[T] ()
    extends typings.officeJsPreview.OfficeExtension.ClientResult[T]
  
  @JSGlobal("OfficeExtension.EmbeddedSession")
  @js.native
  class EmbeddedSession protected ()
    extends typings.officeJsPreview.OfficeExtension.EmbeddedSession {
    def this(url: String) = this()
    def this(url: String, options: EmbeddedOptions) = this()
  }
  
  /** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
  @JSGlobal("OfficeExtension.Error")
  @js.native
  class Error ()
    extends typings.officeJsPreview.OfficeExtension.Error
  
  @JSGlobal("OfficeExtension.ErrorCodes")
  @js.native
  class ErrorCodes ()
    extends typings.officeJsPreview.OfficeExtension.ErrorCodes
  object ErrorCodes {
    
    @JSGlobal("OfficeExtension.ErrorCodes")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.accessDenied")
    @js.native
    def accessDenied: String = js.native
    @scala.inline
    def accessDenied_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessDenied")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.activityLimitReached")
    @js.native
    def activityLimitReached: String = js.native
    @scala.inline
    def activityLimitReached_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activityLimitReached")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.apiNotFound")
    @js.native
    def apiNotFound: String = js.native
    @scala.inline
    def apiNotFound_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiNotFound")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.cannotRegisterEvent")
    @js.native
    def cannotRegisterEvent: String = js.native
    @scala.inline
    def cannotRegisterEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cannotRegisterEvent")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.connectionFailure")
    @js.native
    def connectionFailure: String = js.native
    @scala.inline
    def connectionFailure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionFailure")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.generalException")
    @js.native
    def generalException: String = js.native
    @scala.inline
    def generalException_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generalException")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.invalidArgument")
    @js.native
    def invalidArgument: String = js.native
    @scala.inline
    def invalidArgument_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidArgument")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.invalidObjectPath")
    @js.native
    def invalidObjectPath: String = js.native
    @scala.inline
    def invalidObjectPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidObjectPath")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.invalidRequestContext")
    @js.native
    def invalidRequestContext: String = js.native
    @scala.inline
    def invalidRequestContext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidRequestContext")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.propertyNotLoaded")
    @js.native
    def propertyNotLoaded: String = js.native
    @scala.inline
    def propertyNotLoaded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyNotLoaded")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.runMustReturnPromise")
    @js.native
    def runMustReturnPromise: String = js.native
    @scala.inline
    def runMustReturnPromise_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runMustReturnPromise")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OfficeExtension.ErrorCodes.valueNotLoaded")
    @js.native
    def valueNotLoaded: String = js.native
    @scala.inline
    def valueNotLoaded_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueNotLoaded")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("OfficeExtension.EventHandlerResult")
  @js.native
  class EventHandlerResult[T] protected ()
    extends typings.officeJsPreview.OfficeExtension.EventHandlerResult[T] {
    def this(
      context: typings.officeJsPreview.OfficeExtension.ClientRequestContext,
      handlers: typings.officeJsPreview.OfficeExtension.EventHandlers[T],
      handler: js.Function1[/* args */ T, js.Promise[_]]
    ) = this()
  }
  
  @JSGlobal("OfficeExtension.EventHandlers")
  @js.native
  class EventHandlers[T] protected ()
    extends typings.officeJsPreview.OfficeExtension.EventHandlers[T] {
    def this(
      context: typings.officeJsPreview.OfficeExtension.ClientRequestContext,
      parentObject: typings.officeJsPreview.OfficeExtension.ClientObject,
      name: String,
      eventInfo: EventInfo[T]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OfficeExtension.Promise")
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
  @JSGlobal("OfficeExtension.Promise")
  @js.native
  val Promise: IPromiseConstructor = js.native
  
  /** Collection of tracked objects, contained within a request context. See "context.trackedObjects" for more information. */
  @JSGlobal("OfficeExtension.TrackedObjects")
  @js.native
  class TrackedObjects ()
    extends typings.officeJsPreview.OfficeExtension.TrackedObjects
  
  /** Configuration */
  object config {
    
    @JSGlobal("OfficeExtension.config")
    @js.native
    val ^ : js.Any = js.native
    
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
    @JSGlobal("OfficeExtension.config.extendedErrorLogging")
    @js.native
    def extendedErrorLogging: Boolean = js.native
    @scala.inline
    def extendedErrorLogging_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedErrorLogging")(x.asInstanceOf[js.Any])
  }
}
