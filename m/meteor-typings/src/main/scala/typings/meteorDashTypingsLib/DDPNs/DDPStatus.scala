package typings
package meteorDashTypingsLib.DDPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DDPStatus extends js.Object {
  var connected: scala.Boolean
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var retryCount: scala.Double
  var retryTime: js.UndefOr[scala.Double] = js.undefined
  var status: Status
}

object DDPStatus {
  @scala.inline
  def apply(
    connected: scala.Boolean,
    retryCount: scala.Double,
    status: Status,
    reason: java.lang.String = null,
    retryTime: scala.Int | scala.Double = null
  ): DDPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connected")(connected)
    __obj.updateDynamic("retryCount")(retryCount)
    __obj.updateDynamic("status")(status)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (retryTime != null) __obj.updateDynamic("retryTime")(retryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDPStatus]
  }
}

