package typings.nodeDashWindows.nodeDashWindowsMod

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
    if (eventLog != null) __obj.updateDynamic("eventLog")(eventLog)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[EventLogConfig]
  }
}

