package typings.playcanvas.mod

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
@JSImport("playcanvas", "Keyboard")
@js.native
class Keyboard ()
  extends typings.playcanvas.pc.Keyboard {
  def this(element: Element) = this()
  def this(element: Window_) = this()
  def this(element: Element, options: AnonPreventDefault) = this()
  def this(element: Window_, options: AnonPreventDefault) = this()
}

