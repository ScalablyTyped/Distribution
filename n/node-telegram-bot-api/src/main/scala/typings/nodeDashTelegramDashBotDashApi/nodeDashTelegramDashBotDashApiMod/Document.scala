package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends FileBase {
  var file_name: js.UndefOr[String] = js.undefined
  var mime_type: js.UndefOr[String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    file_id: String,
    file_name: String = null,
    file_size: Int | Double = null,
    mime_type: String = null,
    thumb: PhotoSize = null
  ): Document = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any])
    if (file_name != null) __obj.updateDynamic("file_name")(file_name.asInstanceOf[js.Any])
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

