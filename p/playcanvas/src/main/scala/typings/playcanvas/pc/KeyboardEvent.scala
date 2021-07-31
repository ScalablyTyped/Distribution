package typings.playcanvas.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new KeyboardEvent.
  * @example
  * var onKeyDown = function (e) {
  *     if (e.key === pc.KEY_SPACE) {
  *         // space key pressed
  *     }
  *     e.event.preventDefault(); // Use original browser event to prevent browser action.
  * };
  * app.keyboard.on("keydown", onKeyDown, this);
  * @property key - The keyCode of the key that has changed. See the pc.KEY_* constants.
  * @property element - The element that fired the keyboard event.
  * @property event - The original browser event which was fired.
  * @param keyboard - The keyboard object which is firing the event.
  * @param event - The original browser event that was fired.
  */
trait KeyboardEvent extends StObject {
  
  /**
    * The element that fired the keyboard event.
    */
  var element: Element
  
  /**
    * The original browser event which was fired.
    */
  var event: KeyboardEvent
  
  /**
    * The keyCode of the key that has changed. See the pc.KEY_* constants.
    */
  var key: Double
}
object KeyboardEvent {
  
  @scala.inline
  def apply(element: Element, event: KeyboardEvent, key: Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventMutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
