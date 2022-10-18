package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StickerSet extends StObject {
  
  var is_animated: Boolean
  
  var is_video: Boolean
  
  var name: String
  
  var sticker_type: StickerType
  
  var stickers: js.Array[Sticker]
  
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  
  var title: String
}
object StickerSet {
  
  inline def apply(
    is_animated: Boolean,
    is_video: Boolean,
    name: String,
    sticker_type: StickerType,
    stickers: js.Array[Sticker],
    title: String
  ): StickerSet = {
    val __obj = js.Dynamic.literal(is_animated = is_animated.asInstanceOf[js.Any], is_video = is_video.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sticker_type = sticker_type.asInstanceOf[js.Any], stickers = stickers.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerSet]
  }
  
  extension [Self <: StickerSet](x: Self) {
    
    inline def setIs_animated(value: Boolean): Self = StObject.set(x, "is_animated", value.asInstanceOf[js.Any])
    
    inline def setIs_video(value: Boolean): Self = StObject.set(x, "is_video", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSticker_type(value: StickerType): Self = StObject.set(x, "sticker_type", value.asInstanceOf[js.Any])
    
    inline def setStickers(value: js.Array[Sticker]): Self = StObject.set(x, "stickers", value.asInstanceOf[js.Any])
    
    inline def setStickersVarargs(value: Sticker*): Self = StObject.set(x, "stickers", js.Array(value*))
    
    inline def setThumb(value: PhotoSize): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
