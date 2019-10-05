package typings.naverDashWhale.whale.system.cpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorUsage extends js.Object {
  /** The cumulative time spent idle by this processor. */
  var idle: Double
  /** The cumulative time used by kernel programs on this processor. */
  var kernel: Double
  /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
  var total: Double
  /** The cumulative time used by userspace programs on this processor. */
  var user: Double
}

object ProcessorUsage {
  @scala.inline
  def apply(idle: Double, kernel: Double, total: Double, user: Double): ProcessorUsage = {
    val __obj = js.Dynamic.literal(idle = idle, kernel = kernel, total = total, user = user)
  
    __obj.asInstanceOf[ProcessorUsage]
  }
}

