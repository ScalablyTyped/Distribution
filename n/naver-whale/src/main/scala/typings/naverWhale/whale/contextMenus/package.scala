package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  type MenuClickedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* info */ typings.chrome.chrome.contextMenus.OnClickData, 
      /* tab */ js.UndefOr[typings.chrome.chrome.tabs.Tab], 
      scala.Unit
    ]
  ]
}
