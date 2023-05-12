package typings.playcanvas.global.pc

import typings.playcanvas.anon.PreventDefault
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Keyboard device bound to an Element. Allows you to detect the state of the key presses. Note
  * that the Keyboard object must be attached to an Element before it can detect any key presses.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.Keyboard")
@js.native
/**
  * Create a new Keyboard instance.
  *
  * @param {Element|Window} [element] - Element to attach Keyboard to. Note that elements like
  * &lt;div&gt; can't accept focus by default. To use keyboard events on an element like this it
  * must have a value of 'tabindex' e.g. tabindex="0". See
  * [here](http://www.w3.org/WAI/GL/WCAG20/WD-WCAG20-TECHS/SCR29.html) for more details.
  * @param {object} [options] - Optional options object.
  * @param {boolean} [options.preventDefault] - Call preventDefault() in key event handlers.
  * This stops the default action of the event occurring. e.g. Ctrl+T will not open a new
  * browser tab.
  * @param {boolean} [options.stopPropagation] - Call stopPropagation() in key event handlers.
  * This stops the event bubbling up the DOM so no parent handlers will be notified of the
  * event.
  * @example
  * // attach keyboard listeners to the window
  * const keyboard = new pc.Keyboard(window);
  */
open class Keyboard ()
  extends typings.playcanvas.mod.Keyboard {
  def this(element: Element) = this()
  def this(element: Window) = this()
  def this(element: Unit, options: PreventDefault) = this()
  def this(element: Element, options: PreventDefault) = this()
  def this(element: Window, options: PreventDefault) = this()
}
