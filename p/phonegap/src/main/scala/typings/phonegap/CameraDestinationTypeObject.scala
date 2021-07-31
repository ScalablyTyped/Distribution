package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraDestinationTypeObject extends StObject {
  
  var DATA_URL: Double
  
  var FILE_URI: Double
}
object CameraDestinationTypeObject {
  
  @scala.inline
  def apply(DATA_URL: Double, FILE_URI: Double): CameraDestinationTypeObject = {
    val __obj = js.Dynamic.literal(DATA_URL = DATA_URL.asInstanceOf[js.Any], FILE_URI = FILE_URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraDestinationTypeObject]
  }
  
  @scala.inline
  implicit class CameraDestinationTypeObjectMutableBuilder[Self <: CameraDestinationTypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDATA_URL(value: Double): Self = StObject.set(x, "DATA_URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFILE_URI(value: Double): Self = StObject.set(x, "FILE_URI", value.asInstanceOf[js.Any])
  }
}
