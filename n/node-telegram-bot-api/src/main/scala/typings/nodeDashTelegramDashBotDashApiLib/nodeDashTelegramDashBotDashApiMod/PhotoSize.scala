package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSize extends FileBase {
  var height: scala.Double
  var width: scala.Double
}

object PhotoSize {
  @scala.inline
  def apply(
    file_id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    file_size: scala.Int | scala.Double = null
  ): PhotoSize = {
    val __obj = js.Dynamic.literal(file_id = file_id, height = height, width = width)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSize]
  }
}

