package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMediaVideo
  extends InputMediaBase
     with InputMedia {
  var duration: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var supports_streaming: js.UndefOr[Boolean] = js.undefined
  var `type`: video
  var width: js.UndefOr[Double] = js.undefined
}

object InputMediaVideo {
  @scala.inline
  def apply(
    media: String,
    `type`: video,
    caption: String = null,
    duration: Int | Double = null,
    height: Int | Double = null,
    parse_mode: ParseMode = null,
    supports_streaming: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    if (!js.isUndefined(supports_streaming)) __obj.updateDynamic("supports_streaming")(supports_streaming.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaVideo]
  }
}

