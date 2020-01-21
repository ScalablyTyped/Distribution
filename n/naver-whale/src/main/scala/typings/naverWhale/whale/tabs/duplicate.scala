package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.duplicate")
@js.native
object duplicate extends js.Object {
  def apply(tabId: Double): Unit = js.native
  def apply(tabId: Double, callback: js.Function1[/* tab */ js.UndefOr[typings.chrome.chrome.tabs.Tab], Unit]): Unit = js.native
}

