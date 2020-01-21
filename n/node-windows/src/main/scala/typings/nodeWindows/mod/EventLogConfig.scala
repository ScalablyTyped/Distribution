package typings.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLogConfig extends js.Object {
  var eventLog: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object EventLogConfig {
  @scala.inline
  def apply(eventLog: String = null, source: String = null): EventLogConfig = {
    val __obj = js.Dynamic.literal()
    if (eventLog != null) __obj.updateDynamic("eventLog")(eventLog.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLogConfig]
  }
}

