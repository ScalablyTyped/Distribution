package typings.phaser.Phaser.Cameras.Controls

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
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
trait FixedKeyControl extends js.Object {
  /**
    * A flag controlling if the Controls will update the Camera or not.
    */
  var active: Boolean
  /**
    * The Camera that this Control will update.
    */
  var camera: Camera
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: Key
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: Key
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: Key
  /**
    * The horizontal speed the camera will move.
    */
  var speedX: Double
  /**
    * The vertical speed the camera will move.
    */
  var speedY: Double
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: Key
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: Key
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: Key
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: Double
  /**
    * Destroys this Key Control.
    */
  def destroy(): Unit
  /**
    * Binds this Key Control to a camera.
    * @param camera The camera to bind this Key Control to.
    */
  def setCamera(camera: Camera): this.type
  /**
    * Starts the Key Control running, providing it has been linked to a camera.
    */
  def start(): this.type
  /**
    * Stops this Key Control from running. Call `start` to start it again.
    */
  def stop(): this.type
  /**
    * Applies the results of pressing the control keys to the Camera.
    * 
    * You must call this every step, it is not called automatically.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: Double): Unit
}

object FixedKeyControl {
  @scala.inline
  def apply(
    active: Boolean,
    camera: Camera,
    destroy: () => Unit,
    down: Key,
    left: Key,
    right: Key,
    setCamera: Camera => FixedKeyControl,
    speedX: Double,
    speedY: Double,
    start: () => FixedKeyControl,
    stop: () => FixedKeyControl,
    up: Key,
    update: Double => Unit,
    zoomIn: Key,
    zoomOut: Key,
    zoomSpeed: Double
  ): FixedKeyControl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setCamera = js.Any.fromFunction1(setCamera), speedX = speedX.asInstanceOf[js.Any], speedY = speedY.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), up = up.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedKeyControl]
  }
}

