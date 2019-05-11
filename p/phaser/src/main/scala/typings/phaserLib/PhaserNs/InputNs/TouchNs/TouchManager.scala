package typings
package phaserLib.PhaserNs.InputNs.TouchNs

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
@JSGlobal("Phaser.Input.Touch.TouchManager")
@js.native
class TouchManager protected () extends js.Object {
  /**
    * 
    * @param inputManager A reference to the Input Manager.
    */
  def this(inputManager: phaserLib.PhaserNs.InputNs.InputManager) = this()
  /**
    * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
    */
  var capture: scala.Boolean = js.native
  /**
    * A boolean that controls if the Touch Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: scala.Boolean = js.native
  /**
    * A reference to the Input Manager.
    */
  var manager: phaserLib.PhaserNs.InputNs.InputManager = js.native
  /**
    * The Touch Cancel event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancel: js.Function = js.native
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
  def destroy(): scala.Unit = js.native
  /**
    * Starts the Touch Event listeners running as long as an input target is set.
    * 
    * This method is called automatically if Touch Input is enabled in the game config,
    * which it is by default. However, you can call it manually should you need to
    * delay input capturing until later in the game.
    */
  def startListeners(): scala.Unit = js.native
  /**
    * Stops the Touch Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): scala.Unit = js.native
}

