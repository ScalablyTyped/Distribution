package typings.naverDashWhale.whaleNs.devtoolsNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindowNs {
  type ResourceAddedEvent = Event[
    js.Function1[/* resource */ typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.Resource, Unit]
  ]
  type ResourceContentCommittedEvent = Event[
    js.Function2[
      /* resource */ typings.chrome.chromeNs.devtoolsNs.inspectedWindowNs.Resource, 
      /* content */ String, 
      Unit
    ]
  ]
}
