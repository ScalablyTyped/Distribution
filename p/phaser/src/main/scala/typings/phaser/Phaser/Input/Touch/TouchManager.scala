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
@js.native
trait TouchManager extends js.Object {
  /**
    * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
    */
  var capture: Boolean = js.native
  /**
    * A boolean that controls if the Touch Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean = js.native
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager = js.native
  /**
    * The Touch Cancel event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancel: js.Function = js.native
  /**
    * The Touch Cancel event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancelWindow: js.Function = js.native
  /**
    * The Touch End event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchEnd: js.Function = js.native
  /**
    * The Touch End event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchEndWindow: js.Function = js.native
  /**
    * The Touch Move event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchMove: js.Function = js.native
  /**
    * The Touch Out event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchOut: js.Function = js.native
  /**
    * The Touch Over event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchOver: js.Function = js.native
  /**
    * The Touch Start event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchStart: js.Function = js.native
  /**
    * The Touch Start event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchStartWindow: js.Function = js.native
  /**
    * The Touch Event target, as defined in the Game Config.
    * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
    */
  var target: js.Any = js.native
  /**
    * Destroys this Touch Manager instance.
    */
  def destroy(): Unit = js.native
  /**
    * Attempts to disable the context menu from appearing if you touch-hold on the browser.
    * 
    * Works by listening for the `contextmenu` event and prevent defaulting it.
    * 
    * Use this if you need to disable the OS context menu on mobile.
    */
  def disableContextMenu(): this.type = js.native
  /**
    * Starts the Touch Event listeners running as long as an input target is set.
    * 
    * This method is called automatically if Touch Input is enabled in the game config,
    * which it is by default. However, you can call it manually should you need to
    * delay input capturing until later in the game.
    */
  def startListeners(): Unit = js.native
  /**
    * Stops the Touch Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): Unit = js.native
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
  @scala.inline
  implicit class TouchManagerOps[Self <: TouchManager] (val x: Self) extends AnyVal {
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
    def setDisableContextMenu(value: () => TouchManager): Self = this.set("disableContextMenu", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setManager(value: InputManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchCancel(value: js.Function): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchCancelWindow(value: js.Function): Self = this.set("onTouchCancelWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchEnd(value: js.Function): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchEndWindow(value: js.Function): Self = this.set("onTouchEndWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchMove(value: js.Function): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchOut(value: js.Function): Self = this.set("onTouchOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchOver(value: js.Function): Self = this.set("onTouchOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchStart(value: js.Function): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchStartWindow(value: js.Function): Self = this.set("onTouchStartWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartListeners(value: () => Unit): Self = this.set("startListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setStopListeners(value: () => Unit): Self = this.set("stopListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

