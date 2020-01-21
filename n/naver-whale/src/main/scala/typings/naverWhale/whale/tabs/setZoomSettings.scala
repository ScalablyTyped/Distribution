package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.setZoomSettings")
@js.native
object setZoomSettings extends js.Object {
  def apply(tabId: Double, zoomSettings: typings.chrome.chrome.tabs.ZoomSettings): Unit = js.native
  def apply(tabId: Double, zoomSettings: typings.chrome.chrome.tabs.ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  def apply(zoomSettings: typings.chrome.chrome.tabs.ZoomSettings): Unit = js.native
  def apply(zoomSettings: typings.chrome.chrome.tabs.ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
}

