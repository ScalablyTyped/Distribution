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
@js.native
trait FixedKeyControl extends js.Object {
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
    * The Key to be pressed that will move the Camera left.
    */
  var left: Key = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: Key = js.native
  /**
    * The horizontal speed the camera will move.
    */
  var speedX: Double = js.native
  /**
    * The vertical speed the camera will move.
    */
  var speedY: Double = js.native
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
  def setCamera(camera: Camera): this.type = js.native
  /**
    * Starts the Key Control running, providing it has been linked to a camera.
    */
  def start(): this.type = js.native
  /**
    * Stops this Key Control from running. Call `start` to start it again.
    */
  def stop(): this.type = js.native
  /**
    * Applies the results of pressing the control keys to the Camera.
    * 
    * You must call this every step, it is not called automatically.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: Double): Unit = js.native
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
  @scala.inline
  implicit class FixedKeyControlOps[Self <: FixedKeyControl] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDown(value: Key): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Key): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Key): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetCamera(value: Camera => FixedKeyControl): Self = this.set("setCamera", js.Any.fromFunction1(value))
    @scala.inline
    def setSpeedX(value: Double): Self = this.set("speedX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeedY(value: Double): Self = this.set("speedY", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: () => FixedKeyControl): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => FixedKeyControl): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setUp(value: Key): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: Double => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setZoomIn(value: Key): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomOut(value: Key): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomSpeed(value: Double): Self = this.set("zoomSpeed", value.asInstanceOf[js.Any])
  }
  
}

