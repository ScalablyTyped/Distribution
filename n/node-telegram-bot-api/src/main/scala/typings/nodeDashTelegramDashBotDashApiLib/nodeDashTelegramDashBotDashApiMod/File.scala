package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends FileBase {
  var file_path: js.UndefOr[java.lang.String] = js.undefined
}

object File {
  @scala.inline
  def apply(
    file_id: java.lang.String,
    file_path: java.lang.String = null,
    file_size: scala.Int | scala.Double = null
  ): File = {
    val __obj = js.Dynamic.literal(file_id = file_id)
    if (file_path != null) __obj.updateDynamic("file_path")(file_path)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

