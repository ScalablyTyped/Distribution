package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.getZoom")
@js.native
object getZoom extends js.Object {
  def apply(callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  def apply(tabId: Double, callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
}

