package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMediaPhoto
  extends InputMediaBase
     with InputMedia {
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.photo
}

object InputMediaPhoto {
  @scala.inline
  def apply(
    media: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.photo,
    caption: java.lang.String = null,
    parse_mode: ParseMode = null
  ): InputMediaPhoto = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("media")(media)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    __obj.asInstanceOf[InputMediaPhoto]
  }
}

