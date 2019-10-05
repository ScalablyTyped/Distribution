package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  import typings.chrome.chrome.events.Event

  type WindowIdEvent = Event[
    js.Function2[
      /* windowId */ Double, 
      /* filters */ js.UndefOr[typings.chrome.chrome.windows.WindowEventFilter], 
      Unit
    ]
  ]
  type WindowReferenceEvent = Event[
    js.Function2[
      /* window */ typings.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[typings.chrome.chrome.windows.WindowEventFilter], 
      Unit
    ]
  ]
}
