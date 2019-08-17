package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pageActionNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.tabsNs.Tab

  type PageActionClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
