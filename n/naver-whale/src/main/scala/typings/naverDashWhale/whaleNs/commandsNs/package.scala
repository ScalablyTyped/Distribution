package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commandsNs {
  type CommandEvent = Event[js.Function1[/* command */ String, Unit]]
}
