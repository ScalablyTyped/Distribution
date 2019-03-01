package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var channel: java.lang.String
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var processId: scala.Double
}

object Notification {
  @scala.inline
  def apply(channel: java.lang.String, processId: scala.Double, payload: java.lang.String = null): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("processId")(processId)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Notification]
  }
}

