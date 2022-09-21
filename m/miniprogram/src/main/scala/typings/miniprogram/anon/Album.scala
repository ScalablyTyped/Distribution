package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Album extends StObject {
  
  var album: Boolean
  
  var camera: Boolean
  
  var location: Boolean
  
  var phoneNumber: Boolean
  
  var userInfo: Boolean
}
object Album {
  
  inline def apply(album: Boolean, camera: Boolean, location: Boolean, phoneNumber: Boolean, userInfo: Boolean): Album = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  extension [Self <: Album](x: Self) {
    
    inline def setAlbum(value: Boolean): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: Boolean): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: Boolean): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
