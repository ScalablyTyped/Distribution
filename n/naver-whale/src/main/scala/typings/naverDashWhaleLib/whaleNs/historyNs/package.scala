package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object historyNs {
  type HistoryVisitRemovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* removed */ chromeLib.chromeNs.historyNs.RemovedResult, scala.Unit]
  ]
  type HistoryVisitedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* result */ chromeLib.chromeNs.historyNs.HistoryItem, scala.Unit]]
}
