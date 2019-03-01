package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sticker extends js.Object {
  var emoji: js.UndefOr[java.lang.String] = js.undefined
  var file_id: java.lang.String
  var file_size: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var mask_position: js.UndefOr[MaskPosition] = js.undefined
  var set_name: js.UndefOr[java.lang.String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  var width: scala.Double
}

object Sticker {
  @scala.inline
  def apply(
    file_id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    emoji: java.lang.String = null,
    file_size: scala.Int | scala.Double = null,
    mask_position: MaskPosition = null,
    set_name: java.lang.String = null,
    thumb: PhotoSize = null
  ): Sticker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file_id")(file_id)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (emoji != null) __obj.updateDynamic("emoji")(emoji)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mask_position != null) __obj.updateDynamic("mask_position")(mask_position)
    if (set_name != null) __obj.updateDynamic("set_name")(set_name)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[Sticker]
  }
}

