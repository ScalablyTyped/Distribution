package typings
package naverDashWhaleLib.whaleNs.devtoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindowNs {
  type ResourceAddedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* resource */ chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.Resource, 
      scala.Unit
    ]
  ]
  type ResourceContentCommittedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* resource */ chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.Resource, 
      /* content */ java.lang.String, 
      scala.Unit
    ]
  ]
}
