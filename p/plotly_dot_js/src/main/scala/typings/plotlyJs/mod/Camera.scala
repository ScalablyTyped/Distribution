package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends js.Object {
  
  var center: PartialPoint = js.native
  
  var eye: PartialPoint = js.native
  
  var up: PartialPoint = js.native
}
object Camera {
  
  @scala.inline
  def apply(center: PartialPoint, eye: PartialPoint, up: PartialPoint): Camera = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: PartialPoint): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEye(value: PartialPoint): Self = this.set("eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: PartialPoint): Self = this.set("up", value.asInstanceOf[js.Any])
  }
}
