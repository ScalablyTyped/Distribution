package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// TELEGRAM TYPES ///
trait PassportFile extends js.Object {
  var file_date: Double
  var file_id: String
  var file_size: Double
}

object PassportFile {
  @scala.inline
  def apply(file_date: Double, file_id: String, file_size: Double): PassportFile = {
    val __obj = js.Dynamic.literal(file_date = file_date.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PassportFile]
  }
}

