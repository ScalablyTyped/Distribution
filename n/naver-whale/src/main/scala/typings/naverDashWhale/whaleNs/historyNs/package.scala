package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object historyNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type HistoryVisitRemovedEvent = Event[
    js.Function1[/* removed */ typings.chrome.chromeNs.historyNs.RemovedResult, Unit]
  ]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ typings.chrome.chromeNs.historyNs.HistoryItem, Unit]]
}
