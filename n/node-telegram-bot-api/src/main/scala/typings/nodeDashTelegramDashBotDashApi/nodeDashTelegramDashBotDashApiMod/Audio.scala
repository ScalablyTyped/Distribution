package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends FileBase {
  var duration: Double
  var mime_type: js.UndefOr[String] = js.undefined
  var performer: js.UndefOr[String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Audio {
  @scala.inline
  def apply(
    duration: Double,
    file_id: String,
    file_size: Int | Double = null,
    mime_type: String = null,
    performer: String = null,
    thumb: PhotoSize = null,
    title: String = null
  ): Audio = {
    val __obj = js.Dynamic.literal(duration = duration, file_id = file_id)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Audio]
  }
}

