package typings.phaser.Phaser.Cameras.Controls

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait SmoothedKeyControl extends js.Object {
  
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
    * Destroys this Key Control.
    */
  def destroy(): Unit = js.native
  
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
    * The Key to be pressed that will move the Camera up.
    */
  var up: Key = js.native
  
  /**
    * Applies the results of pressing the control keys to the Camera.
    * 
    * You must call this every step, it is not called automatically.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: Double): Unit = js.native
  
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
}
object SmoothedKeyControl {
  
  @scala.inline
  def apply(
    accelX: Double,
    accelY: Double,
    active: Boolean,
    camera: Camera,
    destroy: () => Unit,
    down: Key,
    dragX: Double,
    dragY: Double,
    left: Key,
    maxSpeedX: Double,
    maxSpeedY: Double,
    right: Key,
    setCamera: Camera => SmoothedKeyControl,
    start: () => SmoothedKeyControl,
    stop: () => SmoothedKeyControl,
    up: Key,
    update: Double => Unit,
    zoomIn: Key,
    zoomOut: Key,
    zoomSpeed: Double
  ): SmoothedKeyControl = {
    val __obj = js.Dynamic.literal(accelX = accelX.asInstanceOf[js.Any], accelY = accelY.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), down = down.asInstanceOf[js.Any], dragX = dragX.asInstanceOf[js.Any], dragY = dragY.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxSpeedX = maxSpeedX.asInstanceOf[js.Any], maxSpeedY = maxSpeedY.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setCamera = js.Any.fromFunction1(setCamera), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), up = up.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothedKeyControl]
  }
  
  @scala.inline
  implicit class SmoothedKeyControlOps[Self <: SmoothedKeyControl] (val x: Self) extends AnyVal {
    
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
    def setAccelX(value: Double): Self = this.set("accelX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelY(value: Double): Self = this.set("accelY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDown(value: Key): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragX(value: Double): Self = this.set("dragX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragY(value: Double): Self = this.set("dragY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Key): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeedX(value: Double): Self = this.set("maxSpeedX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeedY(value: Double): Self = this.set("maxSpeedY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Key): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCamera(value: Camera => SmoothedKeyControl): Self = this.set("setCamera", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => SmoothedKeyControl): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => SmoothedKeyControl): Self = this.set("stop", js.Any.fromFunction0(value))
    
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
