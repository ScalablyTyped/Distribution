package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventUtilsMod {
  
  @JSImport("pdfjs-dist/types/web/event_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/web/event_utils", "AutomationEventBus")
  @js.native
  open class AutomationEventBus () extends EventBus {
    
    def dispatch(eventName: Any, data: Any): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/event_utils", "EventBus")
  @js.native
  open class EventBus () extends StObject {
    
    var _listeners: Any = js.native
    
    /**
      * @ignore
      */
    def _off(eventName: Any, listener: Any): Unit = js.native
    
    /**
      * @ignore
      */
    def _on(eventName: Any, listener: Any): Unit = js.native
    
    /**
      * @param {string} eventName
      * @param {Object} data
      */
    def dispatch(eventName: String, data: js.Object): Unit = js.native
    
    /**
      * @param {string} eventName
      * @param {function} listener
      * @param {Object} [options]
      */
    def off(eventName: String, listener: js.Function): Unit = js.native
    def off(eventName: String, listener: js.Function, options: js.Object): Unit = js.native
    
    /**
      * @param {string} eventName
      * @param {function} listener
      * @param {Object} [options]
      */
    def on(eventName: String, listener: js.Function): Unit = js.native
    def on(eventName: String, listener: js.Function, options: js.Object): Unit = js.native
  }
  
  object WaitOnType {
    
    @JSImport("pdfjs-dist/types/web/event_utils", "WaitOnType.EVENT")
    @js.native
    val EVENT: String = js.native
    
    @JSImport("pdfjs-dist/types/web/event_utils", "WaitOnType.TIMEOUT")
    @js.native
    val TIMEOUT: String = js.native
  }
  
  inline def waitOnEventOrTimeout(hasTargetNameDelay: WaitOnEventOrTimeoutParameters): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitOnEventOrTimeout")(hasTargetNameDelay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  trait WaitOnEventOrTimeoutParameters extends StObject {
    
    /**
      * - The delay, in milliseconds, after which the
      * timeout occurs (if the event wasn't already dispatched).
      */
    var delay: Double
    
    /**
      * - The name of the event.
      */
    var name: String
    
    /**
      * - The event target, can for example be:
      * `window`, `document`, a DOM element, or an {EventBus} instance.
      */
    var target: js.Object
  }
  object WaitOnEventOrTimeoutParameters {
    
    inline def apply(delay: Double, name: String, target: js.Object): WaitOnEventOrTimeoutParameters = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitOnEventOrTimeoutParameters]
    }
    
    extension [Self <: WaitOnEventOrTimeoutParameters](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
