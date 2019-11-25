package typings.meteor.DDP

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
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (retryTime != null) __obj.updateDynamic("retryTime")(retryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDPStatus]
  }
}

