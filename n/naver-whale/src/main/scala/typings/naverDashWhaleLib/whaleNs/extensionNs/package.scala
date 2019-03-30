package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionNs {
  type OnRequestEvent = chromeLib.chromeNs.eventsNs.Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ chromeLib.chromeNs.runtimeNs.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]) | (js.Function2[
      /* sender */ chromeLib.chromeNs.runtimeNs.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ])
  ]
}
