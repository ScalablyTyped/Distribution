package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object history {
  
  type HistoryVisitRemovedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* removed */ typings.chrome.chrome.history.RemovedResult, scala.Unit]
  ]
  
  type HistoryVisitedEvent = typings.chrome.chrome.events.Event[js.Function1[/* result */ typings.chrome.chrome.history.HistoryItem, scala.Unit]]
}
