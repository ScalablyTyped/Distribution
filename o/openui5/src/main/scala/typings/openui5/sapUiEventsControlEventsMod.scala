package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiEventsControlEventsMod extends Shortcut {
  
  @JSImport("sap/ui/events/ControlEvents", JSImport.Default)
  @js.native
  val default: ControlEvents = js.native
  
  /**
    * @since 1.58
    */
  trait ControlEvents extends StObject {
    
    /**
      * Binds all events for listening with the given callback function.
      */
    def bindAnyEvent(/**
      * Callback function
      */
    fnCallback: js.Function1[/* p1 */ Event, Unit]): Unit
    
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
    fnCallback: js.Function1[/* p1 */ Event, Unit]): Unit
  }
  object ControlEvents {
    
    inline def apply(
      bindAnyEvent: js.Function1[/* p1 */ Event, Unit] => Unit,
      events: Unit,
      unbindAnyEvent: js.Function1[/* p1 */ Event, Unit] => Unit
    ): ControlEvents = {
      val __obj = js.Dynamic.literal(bindAnyEvent = js.Any.fromFunction1(bindAnyEvent), events = events.asInstanceOf[js.Any], unbindAnyEvent = js.Any.fromFunction1(unbindAnyEvent))
      __obj.asInstanceOf[ControlEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlEvents] (val x: Self) extends AnyVal {
      
      inline def setBindAnyEvent(value: js.Function1[/* p1 */ Event, Unit] => Unit): Self = StObject.set(x, "bindAnyEvent", js.Any.fromFunction1(value))
      
      inline def setEvents(value: Unit): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setUnbindAnyEvent(value: js.Function1[/* p1 */ Event, Unit] => Unit): Self = StObject.set(x, "unbindAnyEvent", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ControlEvents
  
  /* This means you don't have to write `default`, but can instead just say `sapUiEventsControlEventsMod.foo` */
  override def _to: ControlEvents = default
}
