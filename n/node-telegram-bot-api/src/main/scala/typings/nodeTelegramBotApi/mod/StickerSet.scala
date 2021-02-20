package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickerSet extends StObject {
  
  var contains_masks: Boolean = js.native
  
  var name: String = js.native
  
  var stickers: js.Array[Sticker] = js.native
  
  var title: String = js.native
}
object StickerSet {
  
  @scala.inline
  def apply(contains_masks: Boolean, name: String, stickers: js.Array[Sticker], title: String): StickerSet = {
    val __obj = js.Dynamic.literal(contains_masks = contains_masks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stickers = stickers.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerSet]
  }
  
  @scala.inline
  implicit class StickerSetMutableBuilder[Self <: StickerSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains_masks(value: Boolean): Self = StObject.set(x, "contains_masks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickers(value: js.Array[Sticker]): Self = StObject.set(x, "stickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickersVarargs(value: Sticker*): Self = StObject.set(x, "stickers", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
