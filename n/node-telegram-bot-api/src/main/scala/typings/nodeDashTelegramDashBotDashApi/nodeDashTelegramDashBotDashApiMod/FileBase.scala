package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBase extends js.Object {
  var file_id: String
  var file_size: js.UndefOr[Double] = js.undefined
}

object FileBase {
  @scala.inline
  def apply(file_id: String, file_size: Int | Double = null): FileBase = {
    val __obj = js.Dynamic.literal(file_id = file_id)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBase]
  }
}

