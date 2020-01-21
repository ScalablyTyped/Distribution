package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.getZoomSettings")
@js.native
object getZoomSettings extends js.Object {
  def apply(callback: js.Function1[/* zoomSettings */ typings.chrome.chrome.tabs.ZoomSettings, Unit]): Unit = js.native
  def apply(
    tabId: Double,
    callback: js.Function1[/* zoomSettings */ typings.chrome.chrome.tabs.ZoomSettings, Unit]
  ): Unit = js.native
}

