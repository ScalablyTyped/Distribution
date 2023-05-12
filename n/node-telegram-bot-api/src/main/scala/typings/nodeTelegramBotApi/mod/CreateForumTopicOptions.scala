package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateForumTopicOptions extends StObject {
  
  var icon_color: js.UndefOr[Double] = js.undefined
  
  var icon_custom_emoji_id: js.UndefOr[String] = js.undefined
}
object CreateForumTopicOptions {
  
  inline def apply(): CreateForumTopicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateForumTopicOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateForumTopicOptions] (val x: Self) extends AnyVal {
    
    inline def setIcon_color(value: Double): Self = StObject.set(x, "icon_color", value.asInstanceOf[js.Any])
    
    inline def setIcon_colorUndefined: Self = StObject.set(x, "icon_color", js.undefined)
    
    inline def setIcon_custom_emoji_id(value: String): Self = StObject.set(x, "icon_custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setIcon_custom_emoji_idUndefined: Self = StObject.set(x, "icon_custom_emoji_id", js.undefined)
  }
}
