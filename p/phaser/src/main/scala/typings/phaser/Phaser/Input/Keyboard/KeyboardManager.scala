package typings.phaser.Phaser.Input.Keyboard

import typings.phaser.Phaser.Input.InputManager
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Keyboard Manager is a helper class that belongs to the global Input Manager.
  * 
  * Its role is to listen for native DOM Keyboard Events and then store them for further processing by the Keyboard Plugin.
  * 
  * You do not need to create this class directly, the Input Manager will create an instance of it automatically if keyboard
  * input has been enabled in the Game Config.
  */
@js.native
trait KeyboardManager extends js.Object {
  /**
    * An array of Key Code values that will automatically have `preventDefault` called on them,
    * as long as the `KeyboardManager.preventDefault` boolean is set to `true`.
    * 
    * By default the array is empty.
    * 
    * The key must be non-modified when pressed in order to be captured.
    * 
    * A non-modified key is one that doesn't have a modifier key held down with it. The modifier keys are
    * shift, control, alt and the meta key (Command on a Mac, the Windows Key on Windows).
    * Therefore, if the user presses shift + r, it won't prevent this combination, because of the modifier.
    * However, if the user presses just the r key on its own, it will have its event prevented.
    * 
    * If you wish to stop capturing the keys, for example switching out to a DOM based element, then
    * you can toggle the `KeyboardManager.preventDefault` boolean at run-time.
    * 
    * If you need more specific control, you can create Key objects and set the flag on each of those instead.
    * 
    * This array can be populated via the Game Config by setting the `input.keyboard.capture` array, or you
    * can call the `addCapture` method. See also `removeCapture` and `clearCaptures`.
    */
  var captures: js.Array[integer] = js.native
  /**
    * A boolean that controls if the Keyboard Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean = js.native
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager = js.native
  /**
    * The Key Down Event handler.
    * This function is sent the native DOM KeyEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onKeyDown: js.Function = js.native
  /**
    * The Key Up Event handler.
    * This function is sent the native DOM KeyEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onKeyUp: js.Function = js.native
  /**
    * A flag that controls if the non-modified keys, matching those stored in the `captures` array,
    * have `preventDefault` called on them or not.
    * 
    * A non-modified key is one that doesn't have a modifier key held down with it. The modifier keys are
    * shift, control, alt and the meta key (Command on a Mac, the Windows Key on Windows).
    * Therefore, if the user presses shift + r, it won't prevent this combination, because of the modifier.
    * However, if the user presses just the r key on its own, it will have its event prevented.
    * 
    * If you wish to stop capturing the keys, for example switching out to a DOM based element, then
    * you can toggle this property at run-time.
    */
  var preventDefault: Boolean = js.native
  /**
    * The Keyboard Event target, as defined in the Game Config.
    * Typically the window in which the game is rendering, but can be any interactive DOM element.
    */
  var target: js.Any = js.native
  /**
    * By default when a key is pressed Phaser will not stop the event from propagating up to the browser.
    * There are some keys this can be annoying for, like the arrow keys or space bar, which make the browser window scroll.
    * 
    * This `addCapture` method enables consuming keyboard event for specific keys so it doesn't bubble up to the the browser
    * and cause the default browser behavior.
    * 
    * Please note that keyboard captures are global. This means that if you call this method from within a Scene, to say prevent
    * the SPACE BAR from triggering a page scroll, then it will prevent it for any Scene in your game, not just the calling one.
    * 
    * You can pass in a single key code value, or an array of key codes, or a string:
    * 
    * ```javascript
    * this.input.keyboard.addCapture(62);
    * ```
    * 
    * An array of key codes:
    * 
    * ```javascript
    * this.input.keyboard.addCapture([ 62, 63, 64 ]);
    * ```
    * 
    * Or a string:
    * 
    * ```javascript
    * this.input.keyboard.addCapture('W,S,A,D');
    * ```
    * 
    * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
    * 
    * You can also provide an array mixing both strings and key code integers.
    * 
    * If there are active captures after calling this method, the `preventDefault` property is set to `true`.
    * @param keycode The Key Codes to enable capture for, preventing them reaching the browser.
    */
  def addCapture(keycode: String): Unit = js.native
  def addCapture(keycode: js.Array[_ | integer]): Unit = js.native
  def addCapture(keycode: integer): Unit = js.native
  /**
    * Removes all keyboard captures and sets the `preventDefault` property to `false`.
    */
  def clearCaptures(): Unit = js.native
  /**
    * Destroys this Keyboard Manager instance.
    */
  def destroy(): Unit = js.native
  /**
    * Removes an existing key capture.
    * 
    * Please note that keyboard captures are global. This means that if you call this method from within a Scene, to remove
    * the capture of a key, then it will remove it for any Scene in your game, not just the calling one.
    * 
    * You can pass in a single key code value, or an array of key codes, or a string:
    * 
    * ```javascript
    * this.input.keyboard.removeCapture(62);
    * ```
    * 
    * An array of key codes:
    * 
    * ```javascript
    * this.input.keyboard.removeCapture([ 62, 63, 64 ]);
    * ```
    * 
    * Or a string:
    * 
    * ```javascript
    * this.input.keyboard.removeCapture('W,S,A,D');
    * ```
    * 
    * To use non-alpha numeric keys, use a string, such as 'UP', 'SPACE' or 'LEFT'.
    * 
    * You can also provide an array mixing both strings and key code integers.
    * 
    * If there are no captures left after calling this method, the `preventDefault` property is set to `false`.
    * @param keycode The Key Codes to disable capture for, allowing them reaching the browser again.
    */
  def removeCapture(keycode: String): Unit = js.native
  def removeCapture(keycode: js.Array[_ | integer]): Unit = js.native
  def removeCapture(keycode: integer): Unit = js.native
  /**
    * Starts the Keyboard Event listeners running.
    * This is called automatically and does not need to be manually invoked.
    */
  def startListeners(): Unit = js.native
  /**
    * Stops the Key Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): Unit = js.native
}

