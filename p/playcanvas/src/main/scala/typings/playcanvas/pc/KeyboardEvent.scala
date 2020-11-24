package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait KeyboardEvent extends js.Object {
  
  /**
    * The element that fired the keyboard event.
    */
  var element: Element = js.native
  
  /**
    * The original browser event which was fired.
    */
  var event: KeyboardEvent = js.native
  
  /**
    * The keyCode of the key that has changed. See the pc.KEY_* constants.
    */
  var key: Double = js.native
}
object KeyboardEvent {
  
  @scala.inline
  def apply(element: Element, event: KeyboardEvent, key: Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
