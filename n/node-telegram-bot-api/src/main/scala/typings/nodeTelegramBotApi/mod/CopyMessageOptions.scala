package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyMessageOptions
  extends StObject
     with SendBasicOptions {
  
  var allow_sending_without_reply: js.UndefOr[Boolean] = js.undefined
  
  var caption: js.UndefOr[String] = js.undefined
  
  var caption_entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object CopyMessageOptions {
  
  inline def apply(): CopyMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyMessageOptions]
  }
  
  extension [Self <: CopyMessageOptions](x: Self) {
    
    inline def setAllow_sending_without_reply(value: Boolean): Self = StObject.set(x, "allow_sending_without_reply", value.asInstanceOf[js.Any])
    
    inline def setAllow_sending_without_replyUndefined: Self = StObject.set(x, "allow_sending_without_reply", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCaption_entities(value: js.Array[MessageEntity]): Self = StObject.set(x, "caption_entities", value.asInstanceOf[js.Any])
    
    inline def setCaption_entitiesUndefined: Self = StObject.set(x, "caption_entities", js.undefined)
    
    inline def setCaption_entitiesVarargs(value: MessageEntity*): Self = StObject.set(x, "caption_entities", js.Array(value*))
    
    inline def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    inline def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
