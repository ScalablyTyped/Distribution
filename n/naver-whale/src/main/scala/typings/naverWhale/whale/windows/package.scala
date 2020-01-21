package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  type WindowIdEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* windowId */ scala.Double, 
      /* filters */ js.UndefOr[typings.chrome.chrome.windows.WindowEventFilter], 
      scala.Unit
    ]
  ]
  type WindowReferenceEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* window */ typings.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[typings.chrome.chrome.windows.WindowEventFilter], 
      scala.Unit
    ]
  ]
}
