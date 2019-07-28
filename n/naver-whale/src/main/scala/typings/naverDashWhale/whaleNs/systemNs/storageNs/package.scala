package typings.naverDashWhale.whaleNs.systemNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  type SystemStorageAttachedEvent = Event[
    js.Function1[/* info */ typings.chrome.chromeNs.systemNs.storageNs.StorageUnitInfo, Unit]
  ]
  type SystemStorageDetachedEvent = Event[js.Function1[/* id */ String, Unit]]
}
