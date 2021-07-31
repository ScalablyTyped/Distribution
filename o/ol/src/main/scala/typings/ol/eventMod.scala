package typings.ol

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("ol/events/Event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/events/Event", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with BaseEvent {
    def this(`type`: String) = this()
    
    /**
      * Stop event propagation.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stop event propagation.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * The event target.
      */
    /* CompleteClass */
    var target: js.Any = js.native
    
    /**
      * The event type.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  @scala.inline
  def preventDefault(evt: BaseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def preventDefault(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stopPropagation(evt: BaseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def stopPropagation(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BaseEvent extends StObject {
    
    /**
      * Stop event propagation.
      */
    def preventDefault(): Unit
    
    /**
      * Stop event propagation.
      */
    def stopPropagation(): Unit
    
    /**
      * The event target.
      */
    var target: js.Any
    
    /**
      * The event type.
      */
    var `type`: String
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
