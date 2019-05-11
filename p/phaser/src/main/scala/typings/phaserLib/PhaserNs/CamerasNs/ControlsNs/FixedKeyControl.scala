package typings
package phaserLib.PhaserNs.CamerasNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Fixed Key Camera Control.
  * 
  * This allows you to control the movement and zoom of a camera using the defined keys.
  * 
  * ```javascript
  * var camControl = new FixedKeyControl({
  *     camera: this.cameras.main,
  *     left: cursors.left,
  *     right: cursors.right,
  *     speed: float OR { x: 0, y: 0 }
  * });
  * ```
  * 
  * Movement is precise and has no 'smoothing' applied to it.
  * 
  * You must call the `update` method of this controller every frame.
  */
@JSGlobal("Phaser.Cameras.Controls.FixedKeyControl")
@js.native
class FixedKeyControl protected () extends js.Object {
  /**
    * 
    * @param config The Fixed Key Control configuration object.
    */
  def this(config: phaserLib.PhaserNs.TypesNs.CamerasNs.ControlsNs.FixedKeyControlConfig) = this()
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
    * The Key to be pressed that will move the Camera left.
    */
  var left: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = js.native
  /**
    * The horizontal speed the camera will move.
    */
  var speedX: scala.Double = js.native
  /**
    * The vertical speed the camera will move.
    */
  var speedY: scala.Double = js.native
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
  def setCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): FixedKeyControl = js.native
  /**
    * Starts the Key Control running, providing it has been linked to a camera.
    */
  def start(): FixedKeyControl = js.native
  /**
    * Stops this Key Control from running. Call `start` to start it again.
    */
  def stop(): FixedKeyControl = js.native
  /**
    * Applies the results of pressing the control keys to the Camera.
    * 
    * You must call this every step, it is not called automatically.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: scala.Double): scala.Unit = js.native
}

