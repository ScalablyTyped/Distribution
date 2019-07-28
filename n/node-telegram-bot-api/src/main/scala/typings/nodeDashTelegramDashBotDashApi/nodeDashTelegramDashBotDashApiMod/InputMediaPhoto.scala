package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMediaPhoto
  extends InputMediaBase
     with InputMedia {
  var `type`: photo
}

object InputMediaPhoto {
  @scala.inline
  def apply(media: String, `type`: photo, caption: String = null, parse_mode: ParseMode = null): InputMediaPhoto = {
    val __obj = js.Dynamic.literal(media = media)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    __obj.asInstanceOf[InputMediaPhoto]
  }
}

