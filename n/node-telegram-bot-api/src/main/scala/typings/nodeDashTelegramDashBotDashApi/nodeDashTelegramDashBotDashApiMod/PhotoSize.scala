package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSize extends FileBase {
  var height: Double
  var width: Double
}

object PhotoSize {
  @scala.inline
  def apply(file_id: String, height: Double, width: Double, file_size: Int | Double = null): PhotoSize = {
    val __obj = js.Dynamic.literal(file_id = file_id, height = height, width = width)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSize]
  }
}

