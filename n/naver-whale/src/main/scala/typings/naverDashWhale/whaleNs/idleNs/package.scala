package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idleNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type IdleStateChangedEvent = Event[js.Function1[/* newState */ String, Unit]]
}
