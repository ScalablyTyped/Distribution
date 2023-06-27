package typings.observableWebworkers

import typings.observableWebworkers.observableWebworkersStrings.error
import typings.observableWebworkers.observableWebworkersStrings.message
import typings.observableWebworkers.observableWebworkersStrings.messageerror
import typings.std.AddEventListenerOptions
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.MessageEvent
import typings.std.StructuredSerializeOptions
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Worker & {  port :any | undefined} */
  @js.native
  trait Workerportanyundefined extends StObject {
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      *
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      *
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      *
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      *
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      *
      * If an AbortSignal is passed for options's signal, then the event listener will be removed when signal is aborted.
      *
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
      */
    /* standard dom */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, callback: Null, options: AddEventListenerOptions): Unit = js.native
    /* standard dom */
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    /* standard dom */
    @JSName("addEventListener")
    def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
      */
    /* standard dom */
    def dispatchEvent(event: Event): Boolean = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event) */
    /* standard dom */
    var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]) | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event) */
    /* standard dom */
    var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event) */
    /* standard dom */
    var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
    
    var port: js.UndefOr[Any] = js.native
    
    /* standard dom */
    def postMessage(message: Any): Unit = js.native
    def postMessage(message: Any, options: StructuredSerializeOptions): Unit = js.native
    /**
      * Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
      */
    /* standard dom */
    def postMessage(message: Any, transfer: js.Array[Transferable]): Unit = js.native
    
    /**
      * Removes the event listener in target's event listener list with the same type, callback, and options.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
      */
    /* standard dom */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    /* standard dom */
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    /* standard dom */
    @JSName("removeEventListener")
    def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
      options: EventListenerOptions
    ): Unit = js.native
    
    /**
      * Aborts worker's associated global environment.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/terminate)
      */
    /* standard dom */
    def terminate(): Unit = js.native
  }
}
