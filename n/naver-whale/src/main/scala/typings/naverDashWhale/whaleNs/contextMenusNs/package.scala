package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenusNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.tabsNs.Tab

  type MenuClickedEvent = Event[
    js.Function2[
      /* info */ typings.chrome.chromeNs.contextMenusNs.OnClickData, 
      /* tab */ js.UndefOr[Tab], 
      Unit
    ]
  ]
}
