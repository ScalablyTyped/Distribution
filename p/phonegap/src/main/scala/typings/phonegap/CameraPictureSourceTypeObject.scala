package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraPictureSourceTypeObject extends StObject {
  
  var CAMERA: Double
  
  var PHOTOLIBRARY: Double
  
  var SAVEDPHOTOALBUM: Double
}
object CameraPictureSourceTypeObject {
  
  @scala.inline
  def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): CameraPictureSourceTypeObject = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPictureSourceTypeObject]
  }
  
  @scala.inline
  implicit class CameraPictureSourceTypeObjectMutableBuilder[Self <: CameraPictureSourceTypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAMERA(value: Double): Self = StObject.set(x, "CAMERA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPHOTOLIBRARY(value: Double): Self = StObject.set(x, "PHOTOLIBRARY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAVEDPHOTOALBUM(value: Double): Self = StObject.set(x, "SAVEDPHOTOALBUM", value.asInstanceOf[js.Any])
  }
}
