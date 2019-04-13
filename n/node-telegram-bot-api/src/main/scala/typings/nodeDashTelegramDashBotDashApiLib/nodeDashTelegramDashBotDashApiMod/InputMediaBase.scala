package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMediaBase extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var media: java.lang.String
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object InputMediaBase {
  @scala.inline
  def apply(media: java.lang.String, caption: java.lang.String = null, parse_mode: ParseMode = null): InputMediaBase = {
    val __obj = js.Dynamic.literal(media = media)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    __obj.asInstanceOf[InputMediaBase]
  }
}

