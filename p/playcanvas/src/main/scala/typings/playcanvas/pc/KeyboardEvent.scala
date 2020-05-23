package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new KeyboardEvent.
  * @example
  * var onKeyDown = function (e) {
  if (e.key === pc.KEY_SPACE) {
  // space key pressed
  }
  e.event.preventDefault(); // Use original browser event to prevent browser action.
  };
  app.keyboard.on("keydown", onKeyDown, this);
  * @property key - The keyCode of the key that has changed. See the pc.KEY_* constants.
  * @property element - The element that fired the keyboard event.
  * @property event - The original browser event which was fired.
  * @param keyboard - The keyboard object which is firing the event.
  * @param event - The original browser event that was fired.
  */
trait KeyboardEvent extends js.Object {
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
}

