package typings.phaser.PhaserNs.CamerasNs.ControlsNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.InputNs.KeyboardNs.Key
import typings.phaser.PhaserNs.TypesNs.CamerasNs.ControlsNs.SmoothedKeyControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Smoothed Key Camera Control.
  * 
  * This allows you to control the movement and zoom of a camera using the defined keys.
  * Unlike the Fixed Camera Control you can also provide physics values for acceleration, drag and maxSpeed for smoothing effects.
  * 
  * ```javascript
  * var controlConfig = {
  *     camera: this.cameras.main,
  *     left: cursors.left,
  *     right: cursors.right,
  *     up: cursors.up,
  *     down: cursors.down,
  *     zoomIn: this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.Q),
  *     zoomOut: this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.E),
  *     zoomSpeed: 0.02,
  *     acceleration: 0.06,
  *     drag: 0.0005,
  *     maxSpeed: 1.0
  * };
  * ```
  * 
  * You must call the `update` method of this controller every frame.
  */
@JSGlobal("Phaser.Cameras.Controls.SmoothedKeyControl")
@js.native
class SmoothedKeyControl protected () extends js.Object {
  /**
    * 
    * @param config The Smoothed Key Control configuration object.
    */
  def this(config: SmoothedKeyControlConfig) = this()
  /**
    * The horizontal acceleration the camera will move.
    */
  var accelX: Double = js.native
  /**
    * The vertical acceleration the camera will move.
    */
  var accelY: Double = js.native
  /**
    * A flag controlling if the Controls will update the Camera or not.
    */
  var active: Boolean = js.native
  /**
    * The Camera that this Control will update.
    */
  var camera: Camera = js.native
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: Key = js.native
  /**
    * The horizontal drag applied to the camera when it is moving.
    */
  var dragX: Double = js.native
  /**
    * The vertical drag applied to the camera when it is moving.
    */
  var dragY: Double = js.native
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: Key = js.native
  /**
    * The maximum horizontal speed the camera will move.
    */
  var maxSpeedX: Double = js.native
  /**
    * The maximum vertical speed the camera will move.
    */
  var maxSpeedY: Double = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: Key = js.native
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: Key = js.native
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: Key = js.native
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: Key = js.native
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: Double = js.native
  /**
    * Destroys this Key Control.
    */
  def destroy(): Unit = js.native
  /**
    * Binds this Key Control to a camera.
    * @param camera The camera to bind this Key Control to.
    */
  def setCamera(camera: Camera): SmoothedKeyControl = js.native
  /**
    * Starts the Key Control running, providing it has been linked to a camera.
    */
  def start(): SmoothedKeyControl = js.native
  /**
    * Stops this Key Control from running. Call `start` to start it again.
    */
  def stop(): SmoothedKeyControl = js.native
  /**
    * Applies the results of pressing the control keys to the Camera.
    * 
    * You must call this every step, it is not called automatically.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: Double): Unit = js.native
}

