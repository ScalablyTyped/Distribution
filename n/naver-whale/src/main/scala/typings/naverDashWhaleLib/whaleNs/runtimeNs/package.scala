package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeNs {
  type ExtensionConnectEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* port */ chromeLib.chromeNs.runtimeNs.Port, scala.Unit]]
  type ExtensionMessageEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ chromeLib.chromeNs.runtimeNs.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ]
  type PortDisconnectEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* port */ chromeLib.chromeNs.runtimeNs.Port, scala.Unit]]
  type PortMessageEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* message */ js.Any, /* port */ chromeLib.chromeNs.runtimeNs.Port, scala.Unit]
  ]
  type RuntimeEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type RuntimeInstalledEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* details */ chromeLib.chromeNs.runtimeNs.InstalledDetails, scala.Unit]
  ]
  type RuntimeRestartRequiredEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* reason */ java.lang.String, scala.Unit]]
  type RuntimeUpdateAvailableEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* details */ chromeLib.chromeNs.runtimeNs.UpdateAvailableDetails, scala.Unit]
  ]
}
