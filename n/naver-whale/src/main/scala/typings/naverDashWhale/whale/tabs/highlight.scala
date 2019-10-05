package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.highlight")
@js.native
object highlight extends js.Object {
  def apply(highlightInfo: typings.chrome.chrome.tabs.HighlightInfo): Unit = js.native
  def apply(
    highlightInfo: typings.chrome.chrome.tabs.HighlightInfo,
    callback: js.Function1[/* window */ typings.chrome.chrome.windows.Window, Unit]
  ): Unit = js.native
}

