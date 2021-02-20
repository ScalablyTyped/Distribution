package typings.ol

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("ol/events/Event", JSImport.Default)
  @js.native
  class default protected () extends BaseEvent {
    def this(`type`: String) = this()
  }
  
  @JSImport("ol/events/Event", "preventDefault")
  @js.native
  def preventDefault(evt: BaseEvent): Unit = js.native
  @JSImport("ol/events/Event", "preventDefault")
  @js.native
  def preventDefault(evt: Event): Unit = js.native
  
  @JSImport("ol/events/Event", "stopPropagation")
  @js.native
  def stopPropagation(evt: BaseEvent): Unit = js.native
  @JSImport("ol/events/Event", "stopPropagation")
  @js.native
  def stopPropagation(evt: Event): Unit = js.native
  
  @js.native
  trait BaseEvent extends StObject {
    
    /**
      * Stop event propagation.
      */
    def preventDefault(): Unit = js.native
    
    /**
      * Stop event propagation.
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * The event target.
      */
    var target: js.Any = js.native
    
    /**
      * The event type.
      */
    var `type`: String = js.native
  }
  object BaseEvent {
    
    @scala.inline
    def apply(preventDefault: () => Unit, stopPropagation: () => Unit, target: js.Any, `type`: String): BaseEvent = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent]
    }
    
    @scala.inline
    implicit class BaseEventMutableBuilder[Self <: BaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
