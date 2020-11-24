package typings.phaser.Phaser.Types.Cameras.Scene2D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONCamera extends js.Object {
  
  /**
    * The background color of camera
    */
  var backgroundColor: String = js.native
  
  /**
    * The bounds of camera
    */
  var bounds: js.UndefOr[JSONCameraBounds] = js.native
  
  /**
    * The height size of camera
    */
  var height: Double = js.native
  
  /**
    * The name of the camera
    */
  var name: String = js.native
  
  /**
    * The rotation of camera
    */
  var rotation: Double = js.native
  
  /**
    * The round pixels st status of camera
    */
  var roundPixels: Boolean = js.native
  
  /**
    * The horizontal scroll of camera
    */
  var scrollX: Double = js.native
  
  /**
    * The vertical scroll of camera
    */
  var scrollY: Double = js.native
  
  /**
    * The width size of camera
    */
  var width: Double = js.native
  
  /**
    * The horizontal position of camera
    */
  var x: Double = js.native
  
  /**
    * The vertical position of camera
    */
  var y: Double = js.native
  
  /**
    * The zoom of camera
    */
  var zoom: Double = js.native
}
object JSONCamera {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    height: Double,
    name: String,
    rotation: Double,
    roundPixels: Boolean,
    scrollX: Double,
    scrollY: Double,
    width: Double,
    x: Double,
    y: Double,
    zoom: Double
  ): JSONCamera = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONCamera]
  }
  
  @scala.inline
  implicit class JSONCameraOps[Self <: JSONCamera] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundPixels(value: Boolean): Self = this.set("roundPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollX(value: Double): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollY(value: Double): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: JSONCameraBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
  }
}
