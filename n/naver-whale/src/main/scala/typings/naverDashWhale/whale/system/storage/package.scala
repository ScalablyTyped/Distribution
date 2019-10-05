package typings.naverDashWhale.whale.system

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  import typings.chrome.chrome.events.Event

  type SystemStorageAttachedEvent = Event[
    js.Function1[/* info */ typings.chrome.chrome.system.storage.StorageUnitInfo, Unit]
  ]
  type SystemStorageDetachedEvent = Event[js.Function1[/* id */ String, Unit]]
}
