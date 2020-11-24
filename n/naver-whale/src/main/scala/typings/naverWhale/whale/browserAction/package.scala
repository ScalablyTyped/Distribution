package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object browserAction {
  
  type BrowserClickedEvent = typings.chrome.chrome.events.Event[js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, scala.Unit]]
  
  type ColorArray = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}
