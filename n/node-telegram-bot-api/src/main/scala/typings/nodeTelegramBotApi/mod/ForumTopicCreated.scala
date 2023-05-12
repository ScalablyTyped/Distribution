package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForumTopicCreated extends StObject {
  
  var icon_color: Double
  
  var icon_custom_emoji_id: String
  
  var name: String
}
object ForumTopicCreated {
  
  inline def apply(icon_color: Double, icon_custom_emoji_id: String, name: String): ForumTopicCreated = {
    val __obj = js.Dynamic.literal(icon_color = icon_color.asInstanceOf[js.Any], icon_custom_emoji_id = icon_custom_emoji_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForumTopicCreated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForumTopicCreated] (val x: Self) extends AnyVal {
    
    inline def setIcon_color(value: Double): Self = StObject.set(x, "icon_color", value.asInstanceOf[js.Any])
    
    inline def setIcon_custom_emoji_id(value: String): Self = StObject.set(x, "icon_custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
