package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditForumTopicOptions extends StObject {
  
  var icon_custom_emoji_id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object EditForumTopicOptions {
  
  inline def apply(): EditForumTopicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditForumTopicOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditForumTopicOptions] (val x: Self) extends AnyVal {
    
    inline def setIcon_custom_emoji_id(value: String): Self = StObject.set(x, "icon_custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setIcon_custom_emoji_idUndefined: Self = StObject.set(x, "icon_custom_emoji_id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
