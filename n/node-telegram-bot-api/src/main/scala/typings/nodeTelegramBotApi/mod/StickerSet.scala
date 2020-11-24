package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickerSet extends js.Object {
  
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
  implicit class StickerSetOps[Self <: StickerSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContains_masks(value: Boolean): Self = this.set("contains_masks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickersVarargs(value: Sticker*): Self = this.set("stickers", js.Array(value :_*))
    
    @scala.inline
    def setStickers(value: js.Array[Sticker]): Self = this.set("stickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
