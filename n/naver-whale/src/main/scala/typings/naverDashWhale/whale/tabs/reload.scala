package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.reload")
@js.native
object reload extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function0[Unit]): Unit = js.native
  def apply(reloadProperties: typings.chrome.chrome.tabs.ReloadProperties): Unit = js.native
  def apply(reloadProperties: typings.chrome.chrome.tabs.ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  def apply(tabId: Double): Unit = js.native
  def apply(tabId: Double, reloadProperties: typings.chrome.chrome.tabs.ReloadProperties): Unit = js.native
  def apply(
    tabId: Double,
    reloadProperties: typings.chrome.chrome.tabs.ReloadProperties,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

