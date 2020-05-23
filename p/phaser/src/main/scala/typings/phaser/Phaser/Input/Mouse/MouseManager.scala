package typings.phaser.Phaser.Input.Mouse

import typings.phaser.Phaser.Input.InputManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Mouse Manager is a helper class that belongs to the Input Manager.
  * 
  * Its role is to listen for native DOM Mouse Events and then pass them onto the Input Manager for further processing.
  * 
  * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
  */
trait MouseManager extends js.Object {
  /**
    * If true the DOM mouse events will have event.preventDefault applied to them, if false they will propagate fully.
    */
  var capture: Boolean
  /**
    * A boolean that controls if the Mouse Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean
  /**
    * If the mouse has been pointer locked successfully this will be set to true.
    */
  var locked: Boolean
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager
  /**
    * The Mouse Down Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseDown: js.Function
  /**
    * The Mouse Down Event handler specifically for events on the Window.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseDownWindow: js.Function
  /**
    * The Mouse Move Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseMove: js.Function
  /**
    * The Mouse Out Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseOut: js.Function
  /**
    * The Mouse Over Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseOver: js.Function
  /**
    * The Mouse Up Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseUp: js.Function
  /**
    * The Mouse Up Event handler specifically for events on the Window.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseUpWindow: js.Function
  /**
    * The Mouse Wheel Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseWheel: js.Function
  /**
    * Internal pointerLockChange handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var pointerLockChange: js.Function
  /**
    * The Mouse target, as defined in the Game Config.
    * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
    */
  var target: js.Any
  /**
    * Destroys this Mouse Manager instance.
    */
  def destroy(): Unit
  /**
    * Attempts to disable the context menu from appearing if you right-click on the browser.
    * 
    * Works by listening for the `contextmenu` event and prevent defaulting it.
    * 
    * Use this if you need to enable right-button mouse support in your game, and the browser
    * menu keeps getting in the way.
    */
  def disableContextMenu(): this.type
  /**
    * If the browser supports pointer lock, this will request that the pointer lock is released. If
    * the browser successfully enters a locked state, a 'POINTER_LOCK_CHANGE_EVENT' will be
    * dispatched - from the game's input manager - with an `isPointerLocked` property.
    */
  def releasePointerLock(): Unit
  /**
    * If the browser supports it, you can request that the pointer be locked to the browser window.
    * 
    * This is classically known as 'FPS controls', where the pointer can't leave the browser until
    * the user presses an exit key.
    * 
    * If the browser successfully enters a locked state, a `POINTER_LOCK_CHANGE_EVENT` will be dispatched,
    * from the games Input Manager, with an `isPointerLocked` property.
    * 
    * It is important to note that pointer lock can only be enabled after an 'engagement gesture',
    * see: https://w3c.github.io/pointerlock/#dfn-engagement-gesture.
    */
  def requestPointerLock(): Unit
  /**
    * Starts the Mouse Event listeners running.
    * This is called automatically and does not need to be manually invoked.
    */
  def startListeners(): Unit
  /**
    * Stops the Mouse Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): Unit
}

object MouseManager {
  @scala.inline
  def apply(
    capture: Boolean,
    destroy: () => Unit,
    disableContextMenu: () => MouseManager,
    enabled: Boolean,
    locked: Boolean,
    manager: InputManager,
    onMouseDown: js.Function,
    onMouseDownWindow: js.Function,
    onMouseMove: js.Function,
    onMouseOut: js.Function,
    onMouseOver: js.Function,
    onMouseUp: js.Function,
    onMouseUpWindow: js.Function,
    onMouseWheel: js.Function,
    pointerLockChange: js.Function,
    releasePointerLock: () => Unit,
    requestPointerLock: () => Unit,
    startListeners: () => Unit,
    stopListeners: () => Unit,
    target: js.Any
  ): MouseManager = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableContextMenu = js.Any.fromFunction0(disableContextMenu), enabled = enabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseDownWindow = onMouseDownWindow.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onMouseUpWindow = onMouseUpWindow.asInstanceOf[js.Any], onMouseWheel = onMouseWheel.asInstanceOf[js.Any], pointerLockChange = pointerLockChange.asInstanceOf[js.Any], releasePointerLock = js.Any.fromFunction0(releasePointerLock), requestPointerLock = js.Any.fromFunction0(requestPointerLock), startListeners = js.Any.fromFunction0(startListeners), stopListeners = js.Any.fromFunction0(stopListeners), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseManager]
  }
}

