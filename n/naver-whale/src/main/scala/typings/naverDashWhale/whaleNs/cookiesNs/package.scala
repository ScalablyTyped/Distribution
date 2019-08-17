package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookiesNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type CookieChangedEvent = Event[
    js.Function1[/* changeInfo */ typings.chrome.chromeNs.cookiesNs.CookieChangeInfo, Unit]
  ]
}
