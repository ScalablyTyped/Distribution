package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.runtimeNs.MessageSender

  type OnRequestEvent = Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | (js.Function2[
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ])
  ]
}
