package typings.naverWhale

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
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
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
}

