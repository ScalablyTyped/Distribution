package typings.nodeTelegramBotApi.mod

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
    file_size: js.UndefOr[Double] = js.undefined,
    mime_type: String = null,
    thumb: PhotoSize = null
  ): Animation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (file_name != null) __obj.updateDynamic("file_name")(file_name.asInstanceOf[js.Any])
    if (!js.isUndefined(file_size)) __obj.updateDynamic("file_size")(file_size.get.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

