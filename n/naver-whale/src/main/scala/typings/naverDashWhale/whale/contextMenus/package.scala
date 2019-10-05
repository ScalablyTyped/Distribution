package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.tabs.Tab

  type MenuClickedEvent = Event[
    js.Function2[
      /* info */ typings.chrome.chrome.contextMenus.OnClickData, 
      /* tab */ js.UndefOr[Tab], 
      Unit
    ]
  ]
}
