package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends FileBase {
  var duration: Double
  var file_name: js.UndefOr[String] = js.undefined
  var height: Double
  var mime_type: js.UndefOr[String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  var width: Double
}

object Animation {
  @scala.inline
  def apply(
    duration: Double,
    file_id: String,
    height: Double,
    width: Double,
    file_name: String = null,
    file_size: Int | Double = null,
    mime_type: String = null,
    thumb: PhotoSize = null
  ): Animation = {
    val __obj = js.Dynamic.literal(duration = duration, file_id = file_id, height = height, width = width)
    if (file_name != null) __obj.updateDynamic("file_name")(file_name)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[Animation]
  }
}

