package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sticker
  extends StObject
     with FileBase {
  
  var custom_emoji_id: js.UndefOr[String] = js.undefined
  
  var emoji: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var is_animated: Boolean
  
  var is_video: Boolean
  
  var mask_position: js.UndefOr[MaskPosition] = js.undefined
  
  var premium_animation: js.UndefOr[File] = js.undefined
  
  var set_name: js.UndefOr[String] = js.undefined
  
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  
  var `type`: StickerType
  
  var width: Double
}
object Sticker {
  
  inline def apply(
    file_id: String,
    file_unique_id: String,
    height: Double,
    is_animated: Boolean,
    is_video: Boolean,
    `type`: StickerType,
    width: Double
  ): Sticker = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], file_unique_id = file_unique_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_animated = is_animated.asInstanceOf[js.Any], is_video = is_video.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sticker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sticker] (val x: Self) extends AnyVal {
    
    inline def setCustom_emoji_id(value: String): Self = StObject.set(x, "custom_emoji_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_emoji_idUndefined: Self = StObject.set(x, "custom_emoji_id", js.undefined)
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIs_animated(value: Boolean): Self = StObject.set(x, "is_animated", value.asInstanceOf[js.Any])
    
    inline def setIs_video(value: Boolean): Self = StObject.set(x, "is_video", value.asInstanceOf[js.Any])
    
    inline def setMask_position(value: MaskPosition): Self = StObject.set(x, "mask_position", value.asInstanceOf[js.Any])
    
    inline def setMask_positionUndefined: Self = StObject.set(x, "mask_position", js.undefined)
    
    inline def setPremium_animation(value: File): Self = StObject.set(x, "premium_animation", value.asInstanceOf[js.Any])
    
    inline def setPremium_animationUndefined: Self = StObject.set(x, "premium_animation", js.undefined)
    
    inline def setSet_name(value: String): Self = StObject.set(x, "set_name", value.asInstanceOf[js.Any])
    
    inline def setSet_nameUndefined: Self = StObject.set(x, "set_name", js.undefined)
    
    inline def setThumb(value: PhotoSize): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setType(value: StickerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
