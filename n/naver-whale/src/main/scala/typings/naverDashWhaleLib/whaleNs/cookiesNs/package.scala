package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookiesNs {
  type CookieChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* changeInfo */ chromeLib.chromeNs.cookiesNs.CookieChangeInfo, scala.Unit]
  ]
}
