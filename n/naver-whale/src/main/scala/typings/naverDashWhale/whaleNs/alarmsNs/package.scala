package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarmsNs {
  type AlarmEvent = Event[js.Function1[/* alarm */ typings.chrome.chromeNs.alarmsNs.Alarm, Unit]]
}
