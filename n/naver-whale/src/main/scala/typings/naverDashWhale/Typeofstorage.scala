package typings.naverDashWhale

import typings.chrome.chromeNs.storageNs.LocalStorageArea
import typings.chrome.chromeNs.storageNs.StorageArea
import typings.chrome.chromeNs.storageNs.StorageChangedEvent
import typings.chrome.chromeNs.storageNs.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstorage extends js.Object {
  var local: LocalStorageArea
  var managed: StorageArea
  var onChanged: StorageChangedEvent
  var sync: SyncStorageArea
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: LocalStorageArea,
    managed: StorageArea,
    onChanged: StorageChangedEvent,
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local, managed = managed, onChanged = onChanged, sync = sync)
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

