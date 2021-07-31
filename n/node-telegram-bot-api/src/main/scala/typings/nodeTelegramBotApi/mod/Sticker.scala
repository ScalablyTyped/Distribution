package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sticker extends StObject {
  
  var emoji: js.UndefOr[String] = js.undefined
  
  var file_id: String
  
  var file_size: js.UndefOr[Double] = js.undefined
  
  var file_unique_id: String
  
  var height: Double
  
  var is_animated: Boolean
  
  var mask_position: js.UndefOr[MaskPosition] = js.undefined
  
  var set_name: js.UndefOr[String] = js.undefined
  
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  
  var width: Double
}
object Sticker {
  
  @scala.inline
  def apply(file_id: String, file_unique_id: String, height: Double, is_animated: Boolean, width: Double): Sticker = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], file_unique_id = file_unique_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_animated = is_animated.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sticker]
  }
  
  @scala.inline
  implicit class StickerMutableBuilder[Self <: Sticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
    
    @scala.inline
    def setFile_id(value: String): Self = StObject.set(x, "file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_sizeUndefined: Self = StObject.set(x, "file_size", js.undefined)
    
    @scala.inline
    def setFile_unique_id(value: String): Self = StObject.set(x, "file_unique_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_animated(value: Boolean): Self = StObject.set(x, "is_animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask_position(value: MaskPosition): Self = StObject.set(x, "mask_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask_positionUndefined: Self = StObject.set(x, "mask_position", js.undefined)
    
    @scala.inline
    def setSet_name(value: String): Self = StObject.set(x, "set_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet_nameUndefined: Self = StObject.set(x, "set_name", js.undefined)
    
    @scala.inline
    def setThumb(value: PhotoSize): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
