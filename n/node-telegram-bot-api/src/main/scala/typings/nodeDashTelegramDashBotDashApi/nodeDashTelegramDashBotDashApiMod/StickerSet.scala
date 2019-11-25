package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickerSet extends js.Object {
  var contains_masks: Boolean
  var name: String
  var stickers: js.Array[Sticker]
  var title: String
}

object StickerSet {
  @scala.inline
  def apply(contains_masks: Boolean, name: String, stickers: js.Array[Sticker], title: String): StickerSet = {
    val __obj = js.Dynamic.literal(contains_masks = contains_masks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stickers = stickers.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StickerSet]
  }
}

