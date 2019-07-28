package typings.playcanvas.pcNs

import typings.playcanvas.BrowserKeyboardEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.KeyboardEvent
  * @class The KeyboardEvent is passed into all event callbacks from the {@link pc.Keyboard}. It corresponds to a key press or release.
  * @description Create a new KeyboardEvent
  * @param {pc.Keyboard} keyboard The keyboard object which is firing the event.
  * @param {pc.KeyboardEvent} event The original browser event that was fired.
  * @property {Number} key The keyCode of the key that has changed. See the pc.KEY_* constants.
  * @property {Element} element The element that fired the keyboard event.
  * @property {KeyboardEvent} event The original browser event which was fired.
  * @example
  * var onKeyDown = function (e) {
  *     if (e.key === pc.KEY_SPACE) {
  *         // space key pressed
  *     }
  *     e.event.preventDefault(); // Use original browser event to prevent browser action.
  * };
  * app.keyboard.on("keydown", onKeyDown, this);
  */
@JSGlobal("pc.KeyboardEvent")
@js.native
class KeyboardEvent protected () extends js.Object {
  def this(keyboard: Keyboard, event: BrowserKeyboardEvent) = this()
  var element: Element = js.native
  var event: BrowserKeyboardEvent = js.native
  var key: Double = js.native
}

