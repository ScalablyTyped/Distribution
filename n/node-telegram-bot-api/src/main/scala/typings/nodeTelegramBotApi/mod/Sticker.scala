package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sticker extends js.Object {
  var emoji: js.UndefOr[String] = js.undefined
  var file_id: String
  var file_size: js.UndefOr[Double] = js.undefined
  var height: Double
  var mask_position: js.UndefOr[MaskPosition] = js.undefined
  var set_name: js.UndefOr[String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  var width: Double
}

object Sticker {
  @scala.inline
  def apply(
    file_id: String,
    height: Double,
    width: Double,
    emoji: String = null,
    file_size: js.UndefOr[Double] = js.undefined,
    mask_position: MaskPosition = null,
    set_name: String = null,
    thumb: PhotoSize = null
  ): Sticker = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (emoji != null) __obj.updateDynamic("emoji")(emoji.asInstanceOf[js.Any])
    if (!js.isUndefined(file_size)) __obj.updateDynamic("file_size")(file_size.get.asInstanceOf[js.Any])
    if (mask_position != null) __obj.updateDynamic("mask_position")(mask_position.asInstanceOf[js.Any])
    if (set_name != null) __obj.updateDynamic("set_name")(set_name.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sticker]
  }
}

