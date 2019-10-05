package typings.meteorDashTypings.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DDPStatus extends js.Object {
  var connected: Boolean
  var reason: js.UndefOr[String] = js.undefined
  var retryCount: Double
  var retryTime: js.UndefOr[Double] = js.undefined
  var status: Status
}

object DDPStatus {
  @scala.inline
  def apply(
    connected: Boolean,
    retryCount: Double,
    status: Status,
    reason: String = null,
    retryTime: Int | Double = null
  ): DDPStatus = {
    val __obj = js.Dynamic.literal(connected = connected, retryCount = retryCount, status = status)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (retryTime != null) __obj.updateDynamic("retryTime")(retryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDPStatus]
  }
}

