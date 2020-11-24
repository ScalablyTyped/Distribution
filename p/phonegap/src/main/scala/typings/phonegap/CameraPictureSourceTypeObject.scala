package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraPictureSourceTypeObject extends js.Object {
  
  var CAMERA: Double = js.native
  
  var PHOTOLIBRARY: Double = js.native
  
  var SAVEDPHOTOALBUM: Double = js.native
}
object CameraPictureSourceTypeObject {
  
  @scala.inline
  def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): CameraPictureSourceTypeObject = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPictureSourceTypeObject]
  }
  
  @scala.inline
  implicit class CameraPictureSourceTypeObjectOps[Self <: CameraPictureSourceTypeObject] (val x: Self) extends AnyVal {
    
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
    def setCAMERA(value: Double): Self = this.set("CAMERA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPHOTOLIBRARY(value: Double): Self = this.set("PHOTOLIBRARY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAVEDPHOTOALBUM(value: Double): Self = this.set("SAVEDPHOTOALBUM", value.asInstanceOf[js.Any])
  }
}
