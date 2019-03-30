package typings
package naverDashWhaleLib.whaleNs.devtoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object networkNs {
  type NavigatedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* url */ java.lang.String, scala.Unit]]
  type RequestFinishedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* request */ chromeLib.chromeNs.devtoolsNs.networkNs.Request, scala.Unit]
  ]
}
