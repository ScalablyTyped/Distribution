package typings.naverWhale.whale.system.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageCapacityInfo extends js.Object {
  /** The available capacity of the storage device, in bytes. */
  var availableCapacity: Double = js.native
  /** A copied |id| of getAvailableCapacity function parameter |id|. */
  var id: String = js.native
}

object StorageCapacityInfo {
  @scala.inline
  def apply(availableCapacity: Double, id: String): StorageCapacityInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageCapacityInfo]
  }
  @scala.inline
  implicit class StorageCapacityInfoOps[Self <: StorageCapacityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailableCapacity(value: Double): Self = this.set("availableCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

