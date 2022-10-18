package typings.nodeTelegramBotApi.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.mask
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.regular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStickerSetOptions extends StObject {
  
  var mask_position: js.UndefOr[MaskPosition] = js.undefined
  
  var sticker_type: js.UndefOr[regular | mask] = js.undefined
  
  var tgs_sticker: js.UndefOr[String | Stream | Buffer] = js.undefined
  
  var webm_sticker: js.UndefOr[String | Stream | Buffer] = js.undefined
}
object CreateStickerSetOptions {
  
  inline def apply(): CreateStickerSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStickerSetOptions]
  }
  
  extension [Self <: CreateStickerSetOptions](x: Self) {
    
    inline def setMask_position(value: MaskPosition): Self = StObject.set(x, "mask_position", value.asInstanceOf[js.Any])
    
    inline def setMask_positionUndefined: Self = StObject.set(x, "mask_position", js.undefined)
    
    inline def setSticker_type(value: regular | mask): Self = StObject.set(x, "sticker_type", value.asInstanceOf[js.Any])
    
    inline def setSticker_typeUndefined: Self = StObject.set(x, "sticker_type", js.undefined)
    
    inline def setTgs_sticker(value: String | Stream | Buffer): Self = StObject.set(x, "tgs_sticker", value.asInstanceOf[js.Any])
    
    inline def setTgs_stickerUndefined: Self = StObject.set(x, "tgs_sticker", js.undefined)
    
    inline def setWebm_sticker(value: String | Stream | Buffer): Self = StObject.set(x, "webm_sticker", value.asInstanceOf[js.Any])
    
    inline def setWebm_stickerUndefined: Self = StObject.set(x, "webm_sticker", js.undefined)
  }
}
