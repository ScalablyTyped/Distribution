package typings.nextAuth.anon

import typings.nextAuth.providersKakaoMod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msgblocked extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var msg_blocked: js.UndefOr[Boolean] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var profile_image: js.UndefOr[String] = js.undefined
  
  var registered_at: js.UndefOr[DateTime] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var thumbnail_image: js.UndefOr[String] = js.undefined
}
object Msgblocked {
  
  inline def apply(): Msgblocked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Msgblocked]
  }
  
  extension [Self <: Msgblocked](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMsg_blocked(value: Boolean): Self = StObject.set(x, "msg_blocked", value.asInstanceOf[js.Any])
    
    inline def setMsg_blockedUndefined: Self = StObject.set(x, "msg_blocked", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
    
    inline def setProfile_imageUndefined: Self = StObject.set(x, "profile_image", js.undefined)
    
    inline def setRegistered_at(value: DateTime): Self = StObject.set(x, "registered_at", value.asInstanceOf[js.Any])
    
    inline def setRegistered_atUndefined: Self = StObject.set(x, "registered_at", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setThumbnail_image(value: String): Self = StObject.set(x, "thumbnail_image", value.asInstanceOf[js.Any])
    
    inline def setThumbnail_imageUndefined: Self = StObject.set(x, "thumbnail_image", js.undefined)
  }
}
