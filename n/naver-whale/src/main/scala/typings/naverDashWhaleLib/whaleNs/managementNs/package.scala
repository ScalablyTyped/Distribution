package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managementNs {
  type ManagementDisabledEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* info */ chromeLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]
  ]
  type ManagementEnabledEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* info */ chromeLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]
  ]
  type ManagementInstalledEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* info */ chromeLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]
  ]
  type ManagementUninstalledEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
