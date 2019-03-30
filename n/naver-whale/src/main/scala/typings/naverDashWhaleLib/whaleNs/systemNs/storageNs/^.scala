package typings
package naverDashWhaleLib.whaleNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.system.storage")
@js.native
object ^ extends js.Object {
  var onAttached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent = js.native
  var onDetached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent = js.native
  def ejectDevice(id: java.lang.String, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getAvailableCapacity(
    id: java.lang.String,
    callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, scala.Unit]
  ): scala.Unit = js.native
  def getInfo(
    callback: js.Function1[
      /* info */ js.Array[chromeLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

