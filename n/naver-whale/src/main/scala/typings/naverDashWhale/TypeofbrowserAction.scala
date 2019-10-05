package typings.naverDashWhale

import typings.chrome.chrome.browserAction.BadgeBackgroundColorDetails
import typings.chrome.chrome.browserAction.BadgeTextDetails
import typings.chrome.chrome.browserAction.BrowserClickedEvent
import typings.chrome.chrome.browserAction.ColorArray
import typings.chrome.chrome.browserAction.PopupDetails
import typings.chrome.chrome.browserAction.TabDetails
import typings.chrome.chrome.browserAction.TabIconDetails
import typings.chrome.chrome.browserAction.TitleDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofbrowserAction extends js.Object {
  var onClicked: BrowserClickedEvent = js.native
  def disable(): Unit = js.native
  def disable(tabId: Double): Unit = js.native
  def disable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def enable(): Unit = js.native
  def enable(tabId: Double): Unit = js.native
  def enable(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = js.native
  def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[Unit]): Unit = js.native
  def setBadgeText(details: BadgeTextDetails): Unit = js.native
  def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = js.native
  def setIcon(details: TabIconDetails): Unit = js.native
  def setIcon(details: TabIconDetails, callback: js.Function): Unit = js.native
  def setPopup(details: PopupDetails): Unit = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  def setTitle(details: TitleDetails): Unit = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
}

