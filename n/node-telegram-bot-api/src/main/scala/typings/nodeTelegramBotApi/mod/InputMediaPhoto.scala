package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
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
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaPhoto]
  }
}

