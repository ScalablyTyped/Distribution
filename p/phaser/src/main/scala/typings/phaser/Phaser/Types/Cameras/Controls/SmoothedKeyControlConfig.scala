package typings.phaser.Phaser.Types.Cameras.Controls

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmoothedKeyControlConfig extends js.Object {
  
  /**
    * The horizontal and vertical acceleration the camera will move.
    */
  var acceleration: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * The Camera that this Control will update.
    */
  var camera: js.UndefOr[Camera] = js.native
  
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: js.UndefOr[Key] = js.native
  
  /**
    * The horizontal and vertical drag applied to the camera when it is moving.
    */
  var drag: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: js.UndefOr[Key] = js.native
  
  /**
    * The maximum horizontal and vertical speed the camera will move.
    */
  var maxSpeed: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: js.UndefOr[Key] = js.native
  
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: js.UndefOr[Key] = js.native
  
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: js.UndefOr[Key] = js.native
  
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: js.UndefOr[Key] = js.native
  
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: js.UndefOr[Double] = js.native
}
object SmoothedKeyControlConfig {
  
  @scala.inline
  def apply(): SmoothedKeyControlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmoothedKeyControlConfig]
  }
  
  @scala.inline
  implicit class SmoothedKeyControlConfigOps[Self <: SmoothedKeyControlConfig] (val x: Self) extends AnyVal {
    
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
    def setAcceleration(value: Double | js.Object): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleration: Self = this.set("acceleration", js.undefined)
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setDown(value: Key): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setDrag(value: Double | js.Object): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setLeft(value: Key): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMaxSpeed(value: Double | js.Object): Self = this.set("maxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSpeed: Self = this.set("maxSpeed", js.undefined)
    
    @scala.inline
    def setRight(value: Key): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setUp(value: Key): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
    
    @scala.inline
    def setZoomIn(value: Key): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomIn: Self = this.set("zoomIn", js.undefined)
    
    @scala.inline
    def setZoomOut(value: Key): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOut: Self = this.set("zoomOut", js.undefined)
    
    @scala.inline
    def setZoomSpeed(value: Double): Self = this.set("zoomSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSpeed: Self = this.set("zoomSpeed", js.undefined)
  }
}
