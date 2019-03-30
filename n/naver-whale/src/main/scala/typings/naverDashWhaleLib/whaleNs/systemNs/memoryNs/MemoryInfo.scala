package typings
package naverDashWhaleLib.whaleNs.systemNs.memoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** The amount of available capacity, in bytes. */
  var availableCapacity: scala.Double
  /** The total amount of physical memory capacity, in bytes. */
  var capacity: scala.Double
}

object MemoryInfo {
  @scala.inline
  def apply(availableCapacity: scala.Double, capacity: scala.Double): MemoryInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity, capacity = capacity)
  
    __obj.asInstanceOf[MemoryInfo]
  }
}

