package typings
package phaserLib.PhaserNs.CamerasNs.ControlsNs

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
  def this(config: phaserLib.PhaserNs.TypesNs.CamerasNs.ControlsNs.SmoothedKeyControlConfig) = this()
  /**
    * The horizontal acceleration the camera will move.
    */
  var accelX: scala.Double = js.native
  /**
    * The vertical acceleration the camera will move.
    */
  var accelY: scala.Double = js.native
  /**
    * A flag controlling if the Controls will update the Camera or not.
    */
  var active: scala.Boolean = js.native
  /**
    * The Camera that this Control will update.
    */
  var camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The horizontal drag applied to the camera when it is moving.
    */
  var dragX: scala.Double = js.native
  /**
    * The vertical drag applied to the camera when it is moving.
    */
  var dragY: scala.Double = js.native
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The maximum horizontal speed the camera will move.
    */
  var maxSpeedX: scala.Double = js.native
  /**
    * The maximum vertical speed the camera will move.
    */
  var maxSpeedY: scala.Double = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: scala.Double = js.native
  /**
    * Destroys this Key Control.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Binds this Key Control to a camera.
    * @param camera The camera to bind this Key Control to.
    */
  def setCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): SmoothedKeyControl = js.native
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
  def update(delta: scala.Double): scala.Unit = js.native
}

