package typings.playcanvas.pc

import typings.playcanvas.AnonPreventDefault
import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Keyboard
  * @augments pc.EventHandler
  * @classdesc A Keyboard device bound to an Element. Allows you to detect the state of the key presses.
  * Note, Keyboard object must be attached to an Element before it can detect any key presses.
  * @description Create a new Keyboard object.
  * @param {Element|Window} [element] - Element to attach Keyboard to. Note that elements like &lt;div&gt; can't
  * accept focus by default. To use keyboard events on an element like this it must have a value of 'tabindex' e.g. tabindex="0". For more details: <a href="http://www.w3.org/WAI/GL/WCAG20/WD-WCAG20-TECHS/SCR29.html">http://www.w3.org/WAI/GL/WCAG20/WD-WCAG20-TECHS/SCR29.html</a>.
  * @param {object} [options] - Optional options object.
  * @param {boolean} [options.preventDefault] - Call preventDefault() in key event handlers. This stops the default action of the event occurring. e.g. Ctrl+T will not open a new browser tab
  * @param {boolean} [options.stopPropagation] - Call stopPropagation() in key event handlers. This stops the event bubbling up the DOM so no parent handlers will be notified of the event
  * @example
  * var keyboard = new pc.Keyboard(window); // attach keyboard listeners to the window
  */
@JSGlobal("pc.Keyboard")
@js.native
class Keyboard () extends EventHandler {
  def this(element: Element) = this()
  def this(element: Window_) = this()
  def this(element: Element, options: AnonPreventDefault) = this()
  def this(element: Window_, options: AnonPreventDefault) = this()
  /**
    * @function
    * @name pc.Keyboard#attach
    * @description Attach the keyboard event handlers to an Element.
    * @param {Element} element - The element to listen for keyboard events on.
    */
  def attach(element: Element): Unit = js.native
  /**
    * @function
    * @name pc.Keyboard#detach
    * @description Detach the keyboard event handlers from the element it is attached to.
    */
  def detach(): Unit = js.native
  /**
    * @function
    * @name pc.Keyboard#isPressed
    * @description Return true if the key is currently down.
    * @param {number} key - The keyCode of the key to test. See the pc.KEY_* constants.
    * @returns {boolean} True if the key was pressed, false if not.
    */
  def isPressed(key: Double): Boolean = js.native
  /**
    * @function
    * @name pc.Keyboard#wasPressed
    * @description Returns true if the key was pressed since the last update.
    * @param {number} key - The keyCode of the key to test. See the pc.KEY_* constants.
    * @returns {boolean} True if the key was pressed.
    */
  def wasPressed(key: Double): Boolean = js.native
  /**
    * @function
    * @name pc.Keyboard#wasReleased
    * @description Returns true if the key was released since the last update.
    * @param {number} key - The keyCode of the key to test. See the pc.KEY_* constants.
    * @returns {boolean} True if the key was pressed.
    */
  def wasReleased(key: Double): Boolean = js.native
}

