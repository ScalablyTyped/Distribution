package typings.phaser.Phaser.Input.Touch

import typings.phaser.Phaser.Input.InputManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Touch Manager is a helper class that belongs to the Input Manager.
  * 
  * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
  * 
  * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
  */
trait TouchManager extends js.Object {
  /**
    * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
    */
  var capture: Boolean
  /**
    * A boolean that controls if the Touch Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager
  /**
    * The Touch Cancel event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancel: js.Function
  /**
    * The Touch Cancel event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancelWindow: js.Function
  /**
    * The Touch End event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchEnd: js.Function
  /**
    * The Touch End event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchEndWindow: js.Function
  /**
    * The Touch Move event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchMove: js.Function
  /**
    * The Touch Out event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchOut: js.Function
  /**
    * The Touch Over event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchOver: js.Function
  /**
    * The Touch Start event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchStart: js.Function
  /**
    * The Touch Start event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchStartWindow: js.Function
  /**
    * The Touch Event target, as defined in the Game Config.
    * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
    */
  var target: js.Any
  /**
    * Destroys this Touch Manager instance.
    */
  def destroy(): Unit
  /**
    * Attempts to disable the context menu from appearing if you touch-hold on the browser.
    * 
    * Works by listening for the `contextmenu` event and prevent defaulting it.
    * 
    * Use this if you need to disable the OS context menu on mobile.
    */
  def disableContextMenu(): this.type
  /**
    * Starts the Touch Event listeners running as long as an input target is set.
    * 
    * This method is called automatically if Touch Input is enabled in the game config,
    * which it is by default. However, you can call it manually should you need to
    * delay input capturing until later in the game.
    */
  def startListeners(): Unit
  /**
    * Stops the Touch Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): Unit
}

object TouchManager {
  @scala.inline
  def apply(
    capture: Boolean,
    destroy: () => Unit,
    disableContextMenu: () => TouchManager,
    enabled: Boolean,
    manager: InputManager,
    onTouchCancel: js.Function,
    onTouchCancelWindow: js.Function,
    onTouchEnd: js.Function,
    onTouchEndWindow: js.Function,
    onTouchMove: js.Function,
    onTouchOut: js.Function,
    onTouchOver: js.Function,
    onTouchStart: js.Function,
    onTouchStartWindow: js.Function,
    startListeners: () => Unit,
    stopListeners: () => Unit,
    target: js.Any
  ): TouchManager = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableContextMenu = js.Any.fromFunction0(disableContextMenu), enabled = enabled.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchCancelWindow = onTouchCancelWindow.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchEndWindow = onTouchEndWindow.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchOut = onTouchOut.asInstanceOf[js.Any], onTouchOver = onTouchOver.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTouchStartWindow = onTouchStartWindow.asInstanceOf[js.Any], startListeners = js.Any.fromFunction0(startListeners), stopListeners = js.Any.fromFunction0(stopListeners), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchManager]
  }
}

