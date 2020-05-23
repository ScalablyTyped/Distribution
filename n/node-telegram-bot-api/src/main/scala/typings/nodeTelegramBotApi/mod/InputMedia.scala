package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.mod.InputMediaPhoto
  - typings.nodeTelegramBotApi.mod.InputMediaVideo
*/
trait InputMedia extends js.Object

object InputMedia {
  @scala.inline
  def InputMediaPhoto(media: String, `type`: photo, caption: String = null, parse_mode: ParseMode = null): InputMedia = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMedia]
  }
  @scala.inline
  def InputMediaVideo(
    media: String,
    `type`: video,
    caption: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    parse_mode: ParseMode = null,
    supports_streaming: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): InputMedia = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    if (!js.isUndefined(supports_streaming)) __obj.updateDynamic("supports_streaming")(supports_streaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMedia]
  }
}

