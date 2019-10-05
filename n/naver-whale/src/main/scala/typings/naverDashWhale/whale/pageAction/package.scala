package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pageAction {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.tabs.Tab

  type PageActionClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
