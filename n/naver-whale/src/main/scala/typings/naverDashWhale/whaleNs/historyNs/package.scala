package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object historyNs {
  type HistoryVisitRemovedEvent = Event[
    js.Function1[/* removed */ typings.chrome.chromeNs.historyNs.RemovedResult, Unit]
  ]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ typings.chrome.chromeNs.historyNs.HistoryItem, Unit]]
}
