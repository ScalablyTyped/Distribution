package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMediaBase extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var media: String
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object InputMediaBase {
  @scala.inline
  def apply(media: String, caption: String = null, parse_mode: ParseMode = null): InputMediaBase = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaBase]
  }
}

