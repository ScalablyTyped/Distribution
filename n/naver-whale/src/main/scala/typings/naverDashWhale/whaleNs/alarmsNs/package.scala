package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarmsNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type AlarmEvent = Event[js.Function1[/* alarm */ typings.chrome.chromeNs.alarmsNs.Alarm, Unit]]
}
