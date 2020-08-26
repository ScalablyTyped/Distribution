package typings.playcanvas.global.pc

import typings.playcanvas.anon.PreventDefault
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Keyboard object.
  * @example
  * var keyboard = new pc.Keyboard(window); // attach keyboard listeners to the window
  * @param [element] - Element to attach Keyboard to. Note that elements like &lt;div&gt; can't
  * accept focus by default. To use keyboard events on an element like this it must have a value of 'tabindex' e.g. tabindex="0". For more details: <a href="http://www.w3.org/WAI/GL/WCAG20/WD-WCAG20-TECHS/SCR29.html">http://www.w3.org/WAI/GL/WCAG20/WD-WCAG20-TECHS/SCR29.html</a>.
  * @param [options] - Optional options object.
  * @param [options.preventDefault] - Call preventDefault() in key event handlers. This stops the default action of the event occurring. e.g. Ctrl+T will not open a new browser tab
  * @param [options.stopPropagation] - Call stopPropagation() in key event handlers. This stops the event bubbling up the DOM so no parent handlers will be notified of the event
  */
@JSGlobal("pc.Keyboard")
@js.native
class Keyboard ()
  extends typings.playcanvas.pc.Keyboard {
  def this(element: Element) = this()
  def this(element: Window) = this()
  def this(element: js.UndefOr[scala.Nothing], options: PreventDefault) = this()
  def this(element: Element, options: PreventDefault) = this()
  def this(element: Window, options: PreventDefault) = this()
}

