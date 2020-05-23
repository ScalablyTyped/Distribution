package typings.nodeTelegramBotApi.mod

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
    file_size: js.UndefOr[Double] = js.undefined,
    mime_type: String = null,
    performer: String = null,
    thumb: PhotoSize = null,
    title: String = null
  ): Audio = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any])
    if (!js.isUndefined(file_size)) __obj.updateDynamic("file_size")(file_size.get.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

