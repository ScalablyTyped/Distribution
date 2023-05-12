package typings.playcanvas.mod

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
@JSImport("playcanvas", "Keyboard")
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
open class Keyboard () extends EventHandler {
  def this(element: Element) = this()
  def this(element: Window) = this()
  def this(element: Unit, options: PreventDefault) = this()
  def this(element: Element, options: PreventDefault) = this()
  def this(element: Window, options: PreventDefault) = this()
  
  var _element: Element | Window = js.native
  
  /**
    * Process the browser keydown event.
    *
    * @param {globalThis.KeyboardEvent} event - The browser keyboard event.
    * @private
    */
  /* private */ var _handleKeyDown: Any = js.native
  
  /**
    * Process the browser keypress event.
    *
    * @param {globalThis.KeyboardEvent} event - The browser keyboard event.
    * @private
    */
  /* private */ var _handleKeyPress: Any = js.native
  
  /**
    * Process the browser keyup event.
    *
    * @param {globalThis.KeyboardEvent} event - The browser keyboard event.
    * @private
    */
  /* private */ var _handleKeyUp: Any = js.native
  
  /**
    * Handle the browser visibilitychange event.
    *
    * @private
    */
  /* private */ var _handleVisibilityChange: Any = js.native
  
  /**
    * Handle the browser blur event.
    *
    * @private
    */
  /* private */ var _handleWindowBlur: Any = js.native
  
  var _keyDownHandler: Any = js.native
  
  var _keyPressHandler: Any = js.native
  
  var _keyUpHandler: Any = js.native
  
  var _visibilityChangeHandler: Any = js.native
  
  var _windowBlurHandler: Any = js.native
  
  /**
    * Fired when a key is pressed.
    *
    * @event Keyboard#keydown
    * @param {KeyboardEvent} event - The Keyboard event object. Note, this event is only valid for the current callback.
    * @example
    * const onKeyDown = function (e) {
    *     if (e.key === pc.KEY_SPACE) {
    *         // space key pressed
    *     }
    *     e.event.preventDefault(); // Use original browser event to prevent browser action.
    * };
    * app.keyboard.on("keydown", onKeyDown, this);
    */
  /**
    * Fired when a key is released.
    *
    * @event Keyboard#keyup
    * @param {KeyboardEvent} event - The Keyboard event object. Note, this event is only valid for the current callback.
    * @example
    * const onKeyUp = function (e) {
    *     if (e.key === pc.KEY_SPACE) {
    *         // space key released
    *     }
    *     e.event.preventDefault(); // Use original browser event to prevent browser action.
    * };
    * app.keyboard.on("keyup", onKeyUp, this);
    */
  /**
    * Attach the keyboard event handlers to an Element.
    *
    * @param {Element|Window} element - The element to listen for keyboard events on.
    */
  def attach(element: Element): Unit = js.native
  def attach(element: Window): Unit = js.native
  
  /**
    * Detach the keyboard event handlers from the element it is attached to.
    */
  def detach(): Unit = js.native
  
  /**
    * Return true if the key is currently down.
    *
    * @param {number} key - The keyCode of the key to test. See the KEY_* constants.
    * @returns {boolean} True if the key was pressed, false if not.
    */
  def isPressed(key: Double): Boolean = js.native
  
  var preventDefault: Boolean = js.native
  
  var stopPropagation: Boolean = js.native
  
  /**
    * Convert a key code into a key identifier.
    *
    * @param {number} keyCode - The key code.
    * @returns {string} The key identifier.
    * @private
    */
  /* private */ var toKeyIdentifier: Any = js.native
  
  /**
    * Called once per frame to update internal state.
    *
    * @ignore
    */
  def update(): Unit = js.native
  
  /**
    * Returns true if the key was pressed since the last update.
    *
    * @param {number} key - The keyCode of the key to test. See the KEY_* constants.
    * @returns {boolean} True if the key was pressed.
    */
  def wasPressed(key: Double): Boolean = js.native
  
  /**
    * Returns true if the key was released since the last update.
    *
    * @param {number} key - The keyCode of the key to test. See the KEY_* constants.
    * @returns {boolean} True if the key was pressed.
    */
  def wasReleased(key: Double): Boolean = js.native
}
