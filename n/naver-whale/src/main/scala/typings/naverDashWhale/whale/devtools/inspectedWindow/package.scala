package typings.naverDashWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindow {
  import typings.chrome.chrome.events.Event

  type ResourceAddedEvent = Event[
    js.Function1[/* resource */ typings.chrome.chrome.devtools.inspectedWindow.Resource, Unit]
  ]
  type ResourceContentCommittedEvent = Event[
    js.Function2[
      /* resource */ typings.chrome.chrome.devtools.inspectedWindow.Resource, 
      /* content */ String, 
      Unit
    ]
  ]
}
