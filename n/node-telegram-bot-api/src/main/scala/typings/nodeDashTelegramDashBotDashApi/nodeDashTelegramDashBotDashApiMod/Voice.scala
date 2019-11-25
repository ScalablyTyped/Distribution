package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Voice extends FileBase {
  var duration: Double
  var mime_type: js.UndefOr[String] = js.undefined
}

object Voice {
  @scala.inline
  def apply(duration: Double, file_id: String, file_size: Int | Double = null, mime_type: String = null): Voice = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any])
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
}

