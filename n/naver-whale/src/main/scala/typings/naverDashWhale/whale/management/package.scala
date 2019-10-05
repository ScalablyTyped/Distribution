package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object management {
  import typings.chrome.chrome.events.Event

  type ManagementDisabledEvent = Event[js.Function1[/* info */ typings.chrome.chrome.management.ExtensionInfo, Unit]]
  type ManagementEnabledEvent = Event[js.Function1[/* info */ typings.chrome.chrome.management.ExtensionInfo, Unit]]
  type ManagementInstalledEvent = Event[js.Function1[/* info */ typings.chrome.chrome.management.ExtensionInfo, Unit]]
  type ManagementUninstalledEvent = Event[js.Function1[/* id */ String, Unit]]
}
