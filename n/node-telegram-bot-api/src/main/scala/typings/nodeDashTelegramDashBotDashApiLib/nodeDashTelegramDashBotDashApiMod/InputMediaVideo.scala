package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMediaVideo
  extends InputMediaBase
     with InputMedia {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var supports_streaming: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.video
  var width: js.UndefOr[scala.Double] = js.undefined
}

object InputMediaVideo {
  @scala.inline
  def apply(
    media: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.video,
    caption: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    parse_mode: ParseMode = null,
    supports_streaming: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    if (!js.isUndefined(supports_streaming)) __obj.updateDynamic("supports_streaming")(supports_streaming)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaVideo]
  }
}

