package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object history {
  import typings.chrome.chrome.events.Event

  type HistoryVisitRemovedEvent = Event[js.Function1[/* removed */ typings.chrome.chrome.history.RemovedResult, Unit]]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ typings.chrome.chrome.history.HistoryItem, Unit]]
}
