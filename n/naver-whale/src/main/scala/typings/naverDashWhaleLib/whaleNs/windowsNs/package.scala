package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsNs {
  type WindowIdEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* windowId */ scala.Double, 
      /* filters */ js.UndefOr[chromeLib.chromeNs.windowsNs.WindowEventFilter], 
      scala.Unit
    ]
  ]
  type WindowReferenceEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* window */ chromeLib.chromeNs.windowsNs.Window, 
      /* filters */ js.UndefOr[chromeLib.chromeNs.windowsNs.WindowEventFilter], 
      scala.Unit
    ]
  ]
}
