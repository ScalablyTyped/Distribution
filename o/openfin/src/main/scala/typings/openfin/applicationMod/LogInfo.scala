package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  var logId: String
}

object LogInfo {
  @scala.inline
  def apply(logId: String): LogInfo = {
    val __obj = js.Dynamic.literal(logId = logId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfo]
  }
}

