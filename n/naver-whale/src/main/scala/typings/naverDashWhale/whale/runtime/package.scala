package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.chrome.chrome.events.Event

  type ExtensionConnectEvent = Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, Unit]]
  type ExtensionMessageEvent = Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typings.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ]
  type ManifestIcons = NumberDictionary[String]
  type PortDisconnectEvent = Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, Unit]]
  type PortMessageEvent = Event[
    js.Function2[/* message */ js.Any, /* port */ typings.chrome.chrome.runtime.Port, Unit]
  ]
  type RuntimeEvent = Event[js.Function0[Unit]]
  type RuntimeInstalledEvent = Event[js.Function1[/* details */ typings.chrome.chrome.runtime.InstalledDetails, Unit]]
  type RuntimeRestartRequiredEvent = Event[js.Function1[/* reason */ String, Unit]]
  type RuntimeUpdateAvailableEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.runtime.UpdateAvailableDetails, Unit]
  ]
}
