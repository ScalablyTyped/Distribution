package typings.naverDashWhale.whaleNs.pageActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.pageAction")
@js.native
object ^ extends js.Object {
  var onClicked: typings.chrome.chromeNs.pageActionNs.PageActionClickedEvent = js.native
  def getPopup(
    details: typings.chrome.chromeNs.pageActionNs.GetDetails,
    callback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def getTitle(
    details: typings.chrome.chromeNs.pageActionNs.GetDetails,
    callback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def hide(tabId: Double): Unit = js.native
  def hide(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def setIcon(details: typings.chrome.chromeNs.pageActionNs.IconDetails): Unit = js.native
  def setIcon(details: typings.chrome.chromeNs.pageActionNs.IconDetails, callback: js.Function0[Unit]): Unit = js.native
  def setPopup(details: typings.chrome.chromeNs.pageActionNs.PopupDetails): Unit = js.native
  def setPopup(details: typings.chrome.chromeNs.pageActionNs.PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  def setTitle(details: typings.chrome.chromeNs.pageActionNs.TitleDetails): Unit = js.native
  def setTitle(details: typings.chrome.chromeNs.pageActionNs.TitleDetails, callback: js.Function0[Unit]): Unit = js.native
  def show(tabId: Double): Unit = js.native
  def show(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
}

