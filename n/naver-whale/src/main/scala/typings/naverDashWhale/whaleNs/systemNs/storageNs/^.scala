package typings.naverDashWhale.whaleNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.system.storage")
@js.native
object ^ extends js.Object {
  var onAttached: typings.chrome.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent = js.native
  var onDetached: typings.chrome.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent = js.native
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getAvailableCapacity(
    id: String,
    callback: js.Function1[/* info */ typings.chrome.chromeNs.systemNs.storageNs.StorageCapacityInfo, Unit]
  ): Unit = js.native
  def getInfo(
    callback: js.Function1[
      /* info */ js.Array[typings.chrome.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      Unit
    ]
  ): Unit = js.native
}

