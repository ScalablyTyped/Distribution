package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBase extends js.Object {
  var file_id: java.lang.String
  var file_size: js.UndefOr[scala.Double] = js.undefined
}

object FileBase {
  @scala.inline
  def apply(file_id: java.lang.String, file_size: scala.Int | scala.Double = null): FileBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file_id")(file_id)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBase]
  }
}

