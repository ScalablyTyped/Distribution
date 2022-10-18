package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiEventsControlEventsMod extends Shortcut {
  
  @JSImport("sap/ui/events/ControlEvents", JSImport.Default)
  @js.native
  val default: ControlEvents = js.native
  
  /**
    * @SINCE 1.58
    */
  trait ControlEvents extends StObject {
    
    /**
      * Binds all events for listening with the given callback function.
      */
    def bindAnyEvent(/**
      * Callback function
      */
    fnCallback: js.Function): Unit
    
    /**
      * List of DOM events that a UIArea automatically takes care of.
      *
      * A control/element doesn't have to bind listeners for these events. It instead can implement an `onevent(oEvent)`
      * method for any of the following events that it wants to be notified about:
      *
      * click, dblclick, contextmenu, focusin, focusout, keydown, keypress, keyup, mousedown, mouseout, mouseover,
      * mouseup, select, selectstart, dragstart, dragenter, dragover, dragleave, dragend, drop, paste, cut, input,
      * touchstart, touchend, touchmove, touchcancel, tap, swipe, swipeleft, swiperight, scrollstart, scrollstop
      *
      * The mouse events and touch events are supported simultaneously on both desktop and mobile browsers. Do
      * NOT create both onmouse* and ontouch* functions to avoid one event being handled twice on the same control.
      */
    var events: Unit
    
    /**
      * Unbinds all events for listening with the given callback function.
      */
    def unbindAnyEvent(/**
      * Callback function
      */
    fnCallback: js.Function): Unit
  }
  object ControlEvents {
    
    inline def apply(bindAnyEvent: js.Function => Unit, events: Unit, unbindAnyEvent: js.Function => Unit): ControlEvents = {
      val __obj = js.Dynamic.literal(bindAnyEvent = js.Any.fromFunction1(bindAnyEvent), events = events.asInstanceOf[js.Any], unbindAnyEvent = js.Any.fromFunction1(unbindAnyEvent))
      __obj.asInstanceOf[ControlEvents]
    }
    
    extension [Self <: ControlEvents](x: Self) {
      
      inline def setBindAnyEvent(value: js.Function => Unit): Self = StObject.set(x, "bindAnyEvent", js.Any.fromFunction1(value))
      
      inline def setEvents(value: Unit): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setUnbindAnyEvent(value: js.Function => Unit): Self = StObject.set(x, "unbindAnyEvent", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ControlEvents
  
  /* This means you don't have to write `default`, but can instead just say `sapUiEventsControlEventsMod.foo` */
  override def _to: ControlEvents = default
}
