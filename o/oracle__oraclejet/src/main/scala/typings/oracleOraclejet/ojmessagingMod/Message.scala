package typings.oracleOraclejet.ojmessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var detail: String = js.native
  var severity: SEVERITY_TYPE | SEVERITY_LEVEL = js.native
  var summary: String = js.native
}

object Message {
  @scala.inline
  def apply(detail: String, severity: SEVERITY_TYPE | SEVERITY_LEVEL, summary: String): Message = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: SEVERITY_TYPE | SEVERITY_LEVEL): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

