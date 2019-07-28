package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import typings.chrome.chromeNs.tabsNs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pageActionNs {
  type PageActionClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
