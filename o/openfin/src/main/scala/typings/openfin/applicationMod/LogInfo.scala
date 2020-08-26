package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogInfo extends js.Object {
  var logId: String = js.native
}

object LogInfo {
  @scala.inline
  def apply(logId: String): LogInfo = {
    val __obj = js.Dynamic.literal(logId = logId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfo]
  }
  @scala.inline
  implicit class LogInfoOps[Self <: LogInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogId(value: String): Self = this.set("logId", value.asInstanceOf[js.Any])
  }
  
}

