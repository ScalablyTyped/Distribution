package typings
package naverDashWhaleLib.whaleNs.sidebarActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.sidebarAction")
@js.native
object ^ extends js.Object {
  var onClicked: BrowserClickedEvent = js.native
  def dock(popupWindowId: scala.Double, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def dock(
    popupWindowId: scala.Double,
    details: SidebarDockDetail,
    callback: js.Function1[/* windowId */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def getBadgeBackgroundColor(callback: js.Function1[/* color */ ColorArray, scala.Unit]): scala.Unit = js.native
  def getBadgeText(callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getPage(callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getTitle(callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def hide(callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def hide(windowId: scala.Double): scala.Unit = js.native
  def hide(windowId: scala.Double, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): scala.Unit = js.native
  def setBadgeText(details: SidebarBadgeDetail): scala.Unit = js.native
  def setIcon(details: SidebarIconDetail): scala.Unit = js.native
  def setPage(details: SidebarPageDetail): scala.Unit = js.native
  def setTitle(details: SidebarTitleDetail): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def show(details: SidebarShowDetail): scala.Unit = js.native
  def show(details: SidebarShowDetail, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def show(windowId: scala.Double): scala.Unit = js.native
  def show(windowId: scala.Double, details: SidebarShowDetail): scala.Unit = js.native
  def show(
    windowId: scala.Double,
    details: SidebarShowDetail,
    callback: js.Function1[/* windowId */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def undock(popupWindowId: scala.Double, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
}

