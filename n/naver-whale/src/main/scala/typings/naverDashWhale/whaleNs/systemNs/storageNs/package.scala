package typings.naverDashWhale.whaleNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type SystemStorageAttachedEvent = Event[
    js.Function1[/* info */ typings.chrome.chromeNs.systemNs.storageNs.StorageUnitInfo, Unit]
  ]
  type SystemStorageDetachedEvent = Event[js.Function1[/* id */ String, Unit]]
}
