package typings.phaser.Phaser.Input

import typings.phaser.Phaser.Input.Mouse.MouseManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Mouse")
@js.native
object Mouse extends js.Object {
  /**
    * The Mouse Manager is a helper class that belongs to the Input Manager.
    * 
    * Its role is to listen for native DOM Mouse Events and then pass them onto the Input Manager for further processing.
    * 
    * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
    */
  @js.native
  class MouseManager protected () extends js.Object {
    /**
      * 
      * @param inputManager A reference to the Input Manager.
      */
    def this(inputManager: InputManager) = this()
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
      * The Touch Event target, as defined in the Game Config.
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
    def disableContextMenu(): MouseManager = js.native
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
  
}

