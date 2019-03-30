package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenusNs {
  type MenuClickedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* info */ chromeLib.chromeNs.contextMenusNs.OnClickData, 
      /* tab */ js.UndefOr[chromeLib.chromeNs.tabsNs.Tab], 
      scala.Unit
    ]
  ]
}
