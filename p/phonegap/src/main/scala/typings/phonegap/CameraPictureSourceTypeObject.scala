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
  
  inline def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): CameraPictureSourceTypeObject = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPictureSourceTypeObject]
  }
  
  extension [Self <: CameraPictureSourceTypeObject](x: Self) {
    
    inline def setCAMERA(value: Double): Self = StObject.set(x, "CAMERA", value.asInstanceOf[js.Any])
    
    inline def setPHOTOLIBRARY(value: Double): Self = StObject.set(x, "PHOTOLIBRARY", value.asInstanceOf[js.Any])
    
    inline def setSAVEDPHOTOALBUM(value: Double): Self = StObject.set(x, "SAVEDPHOTOALBUM", value.asInstanceOf[js.Any])
  }
}
