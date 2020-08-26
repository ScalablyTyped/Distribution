package typings.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLogConfig extends js.Object {
  var eventLog: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object EventLogConfig {
  @scala.inline
  def apply(): EventLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventLogConfig]
  }
  @scala.inline
  implicit class EventLogConfigOps[Self <: EventLogConfig] (val x: Self) extends AnyVal {
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
    def setEventLog(value: String): Self = this.set("eventLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventLog: Self = this.set("eventLog", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

