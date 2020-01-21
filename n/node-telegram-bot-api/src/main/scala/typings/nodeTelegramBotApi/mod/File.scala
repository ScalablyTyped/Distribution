package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends FileBase {
  var file_path: js.UndefOr[String] = js.undefined
}

object File {
  @scala.inline
  def apply(file_id: String, file_path: String = null, file_size: Int | Double = null): File = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any])
    if (file_path != null) __obj.updateDynamic("file_path")(file_path.asInstanceOf[js.Any])
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

