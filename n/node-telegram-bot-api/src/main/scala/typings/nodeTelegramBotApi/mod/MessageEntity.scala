package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEntity extends StObject {
  
  var custom_emoji_id: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var length: Double
  
  var offset: Double
  
  var `type`: MessageEntityType
  
  var url: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[User] = js.undefined
}
object MessageEntity {
  
  inline def apply(length: Double, offset: Double, `type`: MessageEntityType): MessageEntity = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageEntity] (val x: Self) extends AnyVal {
    
    inline def setCustom_emoji_id(value: String): Self = StObject.set(x, "custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_emoji_idUndefined: Self = StObject.set(x, "custom_emoji_id", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: MessageEntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
