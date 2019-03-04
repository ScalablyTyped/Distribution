package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickerSet extends js.Object {
  var contains_masks: scala.Boolean
  var name: java.lang.String
  var stickers: js.Array[Sticker]
  var title: java.lang.String
}

object StickerSet {
  @scala.inline
  def apply(
    contains_masks: scala.Boolean,
    name: java.lang.String,
    stickers: js.Array[Sticker],
    title: java.lang.String
  ): StickerSet = {
    val __obj = js.Dynamic.literal(contains_masks = contains_masks, name = name, stickers = stickers, title = title)
  
    __obj.asInstanceOf[StickerSet]
  }
}

