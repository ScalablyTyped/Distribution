package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserAction {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.tabs.Tab

  type BrowserClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
}
