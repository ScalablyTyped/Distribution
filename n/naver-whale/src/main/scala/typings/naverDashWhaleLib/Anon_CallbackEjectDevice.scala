package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEjectDevice extends js.Object {
  var onAttached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent
  var onDetached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent
  def ejectDevice(id: java.lang.String, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit
  def getAvailableCapacity(
    id: java.lang.String,
    callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, scala.Unit]
  ): scala.Unit
  def getInfo(
    callback: js.Function1[
      /* info */ js.Array[chromeLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_CallbackEjectDevice {
  @scala.inline
  def apply(
    ejectDevice: (java.lang.String, js.Function1[/* result */ java.lang.String, scala.Unit]) => scala.Unit,
    getAvailableCapacity: (java.lang.String, js.Function1[/* info */ chromeLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, scala.Unit]) => scala.Unit,
    getInfo: js.Function1[
      /* info */ js.Array[chromeLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      scala.Unit
    ] => scala.Unit,
    onAttached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent,
    onDetached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent
  ): Anon_CallbackEjectDevice = {
    val __obj = js.Dynamic.literal(ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached, onDetached = onDetached)
  
    __obj.asInstanceOf[Anon_CallbackEjectDevice]
  }
}

