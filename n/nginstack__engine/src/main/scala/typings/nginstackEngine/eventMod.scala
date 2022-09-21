package typings.nginstackEngine

import typings.nginstackEngine.anon.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  inline def apply(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(`type`: String, opt_options: Cancelable): Unit = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/Event", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Event {
    def this(`type`: String) = this()
    def this(`type`: String, opt_options: Cancelable) = this()
    
    /* CompleteClass */
    var cancelable: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var cancelable_ : Any = js.native
    
    /* CompleteClass */
    var currentTarget: Any = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var defaultPrevented_ : Any = js.native
    
    /* CompleteClass */
    var immediateStopped: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var immediateStopped_ : Any = js.native
    
    /* CompleteClass */
    var listenerIndex: Double = js.native
    
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var timeStamp: Double = js.native
    
    /* private */ /* CompleteClass */
    var timeStamp_ : Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* private */ /* CompleteClass */
    var type_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/event/Event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Event extends StObject {
    
    var cancelable: Boolean
    
    /* private */ var cancelable_ : Any
    
    var currentTarget: Any
    
    var defaultPrevented: Boolean
    
    /* private */ var defaultPrevented_ : Any
    
    var immediateStopped: Boolean
    
    /* private */ var immediateStopped_ : Any
    
    var listenerIndex: Double
    
    def preventDefault(): Unit
    
    def stopImmediatePropagation(): Unit
    
    var target: Any
    
    var timeStamp: Double
    
    /* private */ var timeStamp_ : Any
    
    var `type`: String
    
    /* private */ var type_ : Any
  }
  object Event {
    
    inline def apply(
      cancelable: Boolean,
      cancelable_ : Any,
      currentTarget: Any,
      defaultPrevented: Boolean,
      defaultPrevented_ : Any,
      immediateStopped: Boolean,
      immediateStopped_ : Any,
      listenerIndex: Double,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      target: Any,
      timeStamp: Double,
      timeStamp_ : Any,
      `type`: String,
      type_ : Any
    ): Event = {
      val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any], cancelable_ = cancelable_.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], defaultPrevented_ = defaultPrevented_.asInstanceOf[js.Any], immediateStopped = immediateStopped.asInstanceOf[js.Any], immediateStopped_ = immediateStopped_.asInstanceOf[js.Any], listenerIndex = listenerIndex.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timeStamp_ = timeStamp_.asInstanceOf[js.Any], type_ = type_.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelable_(value: Any): Self = StObject.set(x, "cancelable_", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented_(value: Any): Self = StObject.set(x, "defaultPrevented_", value.asInstanceOf[js.Any])
      
      inline def setImmediateStopped(value: Boolean): Self = StObject.set(x, "immediateStopped", value.asInstanceOf[js.Any])
      
      inline def setImmediateStopped_(value: Any): Self = StObject.set(x, "immediateStopped_", value.asInstanceOf[js.Any])
      
      inline def setListenerIndex(value: Double): Self = StObject.set(x, "listenerIndex", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp_(value: Any): Self = StObject.set(x, "timeStamp_", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setType_(value: Any): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
}
