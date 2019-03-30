package typings
package naverDashWhaleLib.whaleNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageCapacityInfo extends js.Object {
  /** The available capacity of the storage device, in bytes. */
  var availableCapacity: scala.Double
  /** A copied |id| of getAvailableCapacity function parameter |id|. */
  var id: java.lang.String
}

object StorageCapacityInfo {
  @scala.inline
  def apply(availableCapacity: scala.Double, id: java.lang.String): StorageCapacityInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity, id = id)
  
    __obj.asInstanceOf[StorageCapacityInfo]
  }
}

