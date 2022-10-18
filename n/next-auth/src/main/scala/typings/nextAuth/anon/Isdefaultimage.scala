package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isdefaultimage extends StObject {
  
  var is_default_image: js.UndefOr[Boolean] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var profile_image_url: js.UndefOr[String] = js.undefined
  
  var thumbnail_image_url: js.UndefOr[String] = js.undefined
}
object Isdefaultimage {
  
  inline def apply(): Isdefaultimage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Isdefaultimage]
  }
  
  extension [Self <: Isdefaultimage](x: Self) {
    
    inline def setIs_default_image(value: Boolean): Self = StObject.set(x, "is_default_image", value.asInstanceOf[js.Any])
    
    inline def setIs_default_imageUndefined: Self = StObject.set(x, "is_default_image", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setProfile_image_url(value: String): Self = StObject.set(x, "profile_image_url", value.asInstanceOf[js.Any])
    
    inline def setProfile_image_urlUndefined: Self = StObject.set(x, "profile_image_url", js.undefined)
    
    inline def setThumbnail_image_url(value: String): Self = StObject.set(x, "thumbnail_image_url", value.asInstanceOf[js.Any])
    
    inline def setThumbnail_image_urlUndefined: Self = StObject.set(x, "thumbnail_image_url", js.undefined)
  }
}
