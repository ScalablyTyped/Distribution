package typings.naverDashWhale

import typings.chrome.chrome.system.storage.StorageCapacityInfo
import typings.chrome.chrome.system.storage.StorageUnitInfo
import typings.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typings.chrome.chrome.system.storage.SystemStorageDetachedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofstorageCallback extends js.Object {
  var onAttached: SystemStorageAttachedEvent
  var onDetached: SystemStorageDetachedEvent
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit
}

object TypeofstorageCallback {
  @scala.inline
  def apply(
    ejectDevice: (String, js.Function1[/* result */ String, Unit]) => Unit,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit,
    onAttached: SystemStorageAttachedEvent,
    onDetached: SystemStorageDetachedEvent
  ): TypeofstorageCallback = {
    val __obj = js.Dynamic.literal(ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofstorageCallback]
  }
}

