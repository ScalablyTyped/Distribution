package typings.playcanvas.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Keyboard extends EventHandler {
  
  /**
    * Attach the keyboard event handlers to an Element.
    * @param element - The element to listen for keyboard events on.
    */
  def attach(element: Element): Unit = js.native
  
  /**
    * Detach the keyboard event handlers from the element it is attached to.
    */
  def detach(): Unit = js.native
  
  /**
    * Return true if the key is currently down.
    * @param key - The keyCode of the key to test. See the pc.KEY_* constants.
    * @returns True if the key was pressed, false if not.
    */
  def isPressed(key: Double): Boolean = js.native
  
  /**
    * Returns true if the key was pressed since the last update.
    * @param key - The keyCode of the key to test. See the pc.KEY_* constants.
    * @returns True if the key was pressed.
    */
  def wasPressed(key: Double): Boolean = js.native
  
  /**
    * Returns true if the key was released since the last update.
    * @param key - The keyCode of the key to test. See the pc.KEY_* constants.
    * @returns True if the key was pressed.
    */
  def wasReleased(key: Double): Boolean = js.native
}
