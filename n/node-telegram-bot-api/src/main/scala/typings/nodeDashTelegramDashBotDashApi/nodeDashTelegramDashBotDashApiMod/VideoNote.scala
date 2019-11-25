package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoNote extends FileBase {
  var duration: Double
  var length: Double
  var thumb: js.UndefOr[PhotoSize] = js.undefined
}

object VideoNote {
  @scala.inline
  def apply(
    duration: Double,
    file_id: String,
    length: Double,
    file_size: Int | Double = null,
    thumb: PhotoSize = null
  ): VideoNote = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoNote]
  }
}

