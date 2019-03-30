package typings
package naverDashWhaleLib.whaleNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction")
@js.native
object ^ extends js.Object {
  var onClicked: chromeLib.chromeNs.browserActionNs.BrowserClickedEvent = js.native
  def disable(): scala.Unit = js.native
  def disable(tabId: scala.Double): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(tabId: scala.Double): scala.Unit = js.native
  def getBadgeBackgroundColor(
    details: chromeLib.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ chromeLib.chromeNs.browserActionNs.ColorArray, scala.Unit]
  ): scala.Unit = js.native
  def getBadgeText(
    details: chromeLib.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getPopup(
    details: chromeLib.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getTitle(
    details: chromeLib.chromeNs.browserActionNs.TabDetails,
    callback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setBadgeBackgroundColor(details: chromeLib.chromeNs.browserActionNs.BadgeBackgroundColorDetails): scala.Unit = js.native
  def setBadgeText(details: chromeLib.chromeNs.browserActionNs.BadgeTextDetails): scala.Unit = js.native
  def setIcon(details: chromeLib.chromeNs.browserActionNs.TabIconDetails): scala.Unit = js.native
  def setIcon(details: chromeLib.chromeNs.browserActionNs.TabIconDetails, callback: js.Function): scala.Unit = js.native
  def setPopup(details: chromeLib.chromeNs.browserActionNs.PopupDetails): scala.Unit = js.native
  def setTitle(details: chromeLib.chromeNs.browserActionNs.TitleDetails): scala.Unit = js.native
}

