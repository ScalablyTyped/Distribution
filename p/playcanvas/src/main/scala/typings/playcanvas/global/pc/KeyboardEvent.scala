package typings.playcanvas.global.pc

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
@JSGlobal("pc.KeyboardEvent")
@js.native
class KeyboardEvent protected ()
  extends typings.playcanvas.pc.KeyboardEvent {
  def this(keyboard: typings.playcanvas.pc.Keyboard, event: typings.playcanvas.pc.KeyboardEvent) = this()
  /**
    * The element that fired the keyboard event.
    */
  /* CompleteClass */
  override var element: Element = js.native
  /**
    * The original browser event which was fired.
    */
  /* CompleteClass */
  override var event: typings.playcanvas.pc.KeyboardEvent = js.native
  /**
    * The keyCode of the key that has changed. See the pc.KEY_* constants.
    */
  /* CompleteClass */
  override var key: Double = js.native
}

