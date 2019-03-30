package typings
package naverDashWhaleLib.whaleNs.systemNs.cpuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorUsage extends js.Object {
  /** The cumulative time spent idle by this processor. */
  var idle: scala.Double
  /** The cumulative time used by kernel programs on this processor. */
  var kernel: scala.Double
  /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
  var total: scala.Double
  /** The cumulative time used by userspace programs on this processor. */
  var user: scala.Double
}

object ProcessorUsage {
  @scala.inline
  def apply(idle: scala.Double, kernel: scala.Double, total: scala.Double, user: scala.Double): ProcessorUsage = {
    val __obj = js.Dynamic.literal(idle = idle, kernel = kernel, total = total, user = user)
  
    __obj.asInstanceOf[ProcessorUsage]
  }
}

