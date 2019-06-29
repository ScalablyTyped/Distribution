package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLogConfig extends js.Object {
  var eventLog: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object EventLogConfig {
  @scala.inline
  def apply(eventLog: java.lang.String = null, source: java.lang.String = null): EventLogConfig = {
    val __obj = js.Dynamic.literal()
    if (eventLog != null) __obj.updateDynamic("eventLog")(eventLog)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[EventLogConfig]
  }
}

