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
@js.native
trait MouseManager extends js.Object {
  /**
    * If true the DOM mouse events will have event.preventDefault applied to them, if false they will propagate fully.
    */
  var capture: Boolean = js.native
  /**
    * A boolean that controls if the Mouse Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean = js.native
  /**
    * If the mouse has been pointer locked successfully this will be set to true.
    */
  var locked: Boolean = js.native
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager = js.native
  /**
    * The Mouse Down Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseDown: js.Function = js.native
  /**
    * The Mouse Down Event handler specifically for events on the Window.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseDownWindow: js.Function = js.native
  /**
    * The Mouse Move Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseMove: js.Function = js.native
  /**
    * The Mouse Out Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseOut: js.Function = js.native
  /**
    * The Mouse Over Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseOver: js.Function = js.native
  /**
    * The Mouse Up Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseUp: js.Function = js.native
  /**
    * The Mouse Up Event handler specifically for events on the Window.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseUpWindow: js.Function = js.native
  /**
    * The Mouse Wheel Event handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var onMouseWheel: js.Function = js.native
  /**
    * Internal pointerLockChange handler.
    * This function is sent the native DOM MouseEvent.
    * Initially empty and bound in the `startListeners` method.
    */
  var pointerLockChange: js.Function = js.native
  /**
    * The Mouse target, as defined in the Game Config.
    * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
    */
  var target: js.Any = js.native
  /**
    * Destroys this Mouse Manager instance.
    */
  def destroy(): Unit = js.native
  /**
    * Attempts to disable the context menu from appearing if you right-click on the browser.
    * 
    * Works by listening for the `contextmenu` event and prevent defaulting it.
    * 
    * Use this if you need to enable right-button mouse support in your game, and the browser
    * menu keeps getting in the way.
    */
  def disableContextMenu(): this.type = js.native
  /**
    * If the browser supports pointer lock, this will request that the pointer lock is released. If
    * the browser successfully enters a locked state, a 'POINTER_LOCK_CHANGE_EVENT' will be
    * dispatched - from the game's input manager - with an `isPointerLocked` property.
    */
  def releasePointerLock(): Unit = js.native
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
  def requestPointerLock(): Unit = js.native
  /**
    * Starts the Mouse Event listeners running.
    * This is called automatically and does not need to be manually invoked.
    */
  def startListeners(): Unit = js.native
  /**
    * Stops the Mouse Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): Unit = js.native
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
  @scala.inline
  implicit class MouseManagerOps[Self <: MouseManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableContextMenu(value: () => MouseManager): Self = this.set("disableContextMenu", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setManager(value: InputManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseDown(value: js.Function): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseDownWindow(value: js.Function): Self = this.set("onMouseDownWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseMove(value: js.Function): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseOut(value: js.Function): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseOver(value: js.Function): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseUp(value: js.Function): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseUpWindow(value: js.Function): Self = this.set("onMouseUpWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnMouseWheel(value: js.Function): Self = this.set("onMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerLockChange(value: js.Function): Self = this.set("pointerLockChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleasePointerLock(value: () => Unit): Self = this.set("releasePointerLock", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = this.set("requestPointerLock", js.Any.fromFunction0(value))
    @scala.inline
    def setStartListeners(value: () => Unit): Self = this.set("startListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setStopListeners(value: () => Unit): Self = this.set("stopListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

