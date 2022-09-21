package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  var album: Any
  
  var camera: Any
  
  var location: Any
  
  var phoneNumber: Any
  
  var userInfo: Any
}
object Camera {
  
  inline def apply(album: Any, camera: Any, location: Any, phoneNumber: Any, userInfo: Any): Camera = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setAlbum(value: Any): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Any): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: Any): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
