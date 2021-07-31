package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraEncodingTypeObject extends StObject {
  
  var JPEG: Double
  
  var PNG: Double
}
object CameraEncodingTypeObject {
  
  @scala.inline
  def apply(JPEG: Double, PNG: Double): CameraEncodingTypeObject = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraEncodingTypeObject]
  }
  
  @scala.inline
  implicit class CameraEncodingTypeObjectMutableBuilder[Self <: CameraEncodingTypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPEG(value: Double): Self = StObject.set(x, "JPEG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG(value: Double): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
  }
}
