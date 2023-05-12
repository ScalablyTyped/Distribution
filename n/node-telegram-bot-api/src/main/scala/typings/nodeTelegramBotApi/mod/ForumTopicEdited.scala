package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForumTopicEdited extends StObject {
  
  var icon_custom_emoji_id: String
  
  var name: String
}
object ForumTopicEdited {
  
  inline def apply(icon_custom_emoji_id: String, name: String): ForumTopicEdited = {
    val __obj = js.Dynamic.literal(icon_custom_emoji_id = icon_custom_emoji_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForumTopicEdited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForumTopicEdited] (val x: Self) extends AnyVal {
    
    inline def setIcon_custom_emoji_id(value: String): Self = StObject.set(x, "icon_custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
