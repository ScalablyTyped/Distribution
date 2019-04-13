package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends FileBase {
  var file_name: js.UndefOr[java.lang.String] = js.undefined
  var mime_type: js.UndefOr[java.lang.String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    file_id: java.lang.String,
    file_name: java.lang.String = null,
    file_size: scala.Int | scala.Double = null,
    mime_type: java.lang.String = null,
    thumb: PhotoSize = null
  ): Document = {
    val __obj = js.Dynamic.literal(file_id = file_id)
    if (file_name != null) __obj.updateDynamic("file_name")(file_name)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[Document]
  }
}

