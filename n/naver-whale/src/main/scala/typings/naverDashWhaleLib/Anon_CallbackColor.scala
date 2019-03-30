package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackColor extends js.Object {
  var onClicked: naverDashWhaleLib.whaleNs.sidebarActionNs.BrowserClickedEvent = js.native
  def dock(popupWindowId: scala.Double, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def dock(
    popupWindowId: scala.Double,
    details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarDockDetail,
    callback: js.Function1[/* windowId */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def getBadgeBackgroundColor(
    callback: js.Function1[/* color */ naverDashWhaleLib.whaleNs.sidebarActionNs.ColorArray, scala.Unit]
  ): scala.Unit = js.native
  def getBadgeText(callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getPage(callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getTitle(callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def hide(callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def hide(windowId: scala.Double): scala.Unit = js.native
  def hide(windowId: scala.Double, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def setBadgeBackgroundColor(details: naverDashWhaleLib.whaleNs.sidebarActionNs.BadgeBackgroundColorDetails): scala.Unit = js.native
  def setBadgeText(details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarBadgeDetail): scala.Unit = js.native
  def setIcon(details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarIconDetail): scala.Unit = js.native
  def setPage(details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarPageDetail): scala.Unit = js.native
  def setTitle(details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarTitleDetail): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
  def show(details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarShowDetail): scala.Unit = js.native
  def show(
    details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarShowDetail,
    callback: js.Function1[/* windowId */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def show(windowId: scala.Double): scala.Unit = js.native
  def show(windowId: scala.Double, details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarShowDetail): scala.Unit = js.native
  def show(
    windowId: scala.Double,
    details: naverDashWhaleLib.whaleNs.sidebarActionNs.SidebarShowDetail,
    callback: js.Function1[/* windowId */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def undock(popupWindowId: scala.Double, callback: js.Function1[/* windowId */ scala.Double, scala.Unit]): scala.Unit = js.native
}

