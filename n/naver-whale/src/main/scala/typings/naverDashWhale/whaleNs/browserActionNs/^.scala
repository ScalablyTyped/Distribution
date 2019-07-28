package typings.naverDashWhale.whaleNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction")
@js.native
object ^ extends js.Object {
  var onClicked: typings.chrome.chromeNs.browserActionNs.BrowserClickedEvent = js.native
  def disable(): Unit = js.native
  def disable(tabId: Double): Unit = js.native
  def disable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def enable(): Unit = js.native
  def enable(tabId: Double): Unit = js.native
  def enable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def getBadgeBackgroundColor(
    details: typings.chrome.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.browserActionNs.ColorArray, Unit]
  ): Unit = js.native
  def getBadgeText(
    details: typings.chrome.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def getPopup(
    details: typings.chrome.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def getTitle(
    details: typings.chrome.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def setBadgeBackgroundColor(details: typings.chrome.chromeNs.browserActionNs.BadgeBackgroundColorDetails): Unit = js.native
  def setBadgeBackgroundColor(
    details: typings.chrome.chromeNs.browserActionNs.BadgeBackgroundColorDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setBadgeText(details: typings.chrome.chromeNs.browserActionNs.BadgeTextDetails): Unit = js.native
  def setBadgeText(details: typings.chrome.chromeNs.browserActionNs.BadgeTextDetails, callback: js.Function0[Unit]): Unit = js.native
  def setIcon(details: typings.chrome.chromeNs.browserActionNs.TabIconDetails): Unit = js.native
  def setIcon(details: typings.chrome.chromeNs.browserActionNs.TabIconDetails, callback: js.Function): Unit = js.native
  def setPopup(details: typings.chrome.chromeNs.browserActionNs.PopupDetails): Unit = js.native
  def setPopup(details: typings.chrome.chromeNs.browserActionNs.PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  def setTitle(details: typings.chrome.chromeNs.browserActionNs.TitleDetails): Unit = js.native
  def setTitle(details: typings.chrome.chromeNs.browserActionNs.TitleDetails, callback: js.Function0[Unit]): Unit = js.native
}

