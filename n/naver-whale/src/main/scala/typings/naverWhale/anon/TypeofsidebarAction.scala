package typings.naverWhale.anon

import typings.naverWhale.whale.sidebarAction.BadgeBackgroundColorDetails
import typings.naverWhale.whale.sidebarAction.BrowserClickedEvent
import typings.naverWhale.whale.sidebarAction.ColorArray
import typings.naverWhale.whale.sidebarAction.SidebarBadgeDetail
import typings.naverWhale.whale.sidebarAction.SidebarDockDetail
import typings.naverWhale.whale.sidebarAction.SidebarIconDetail
import typings.naverWhale.whale.sidebarAction.SidebarPageDetail
import typings.naverWhale.whale.sidebarAction.SidebarShowDetail
import typings.naverWhale.whale.sidebarAction.SidebarTitleDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofsidebarAction extends js.Object {
  var onClicked: BrowserClickedEvent = js.native
  def dock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def dock(
    popupWindowId: Double,
    details: SidebarDockDetail,
    callback: js.Function1[/* windowId */ Double, Unit]
  ): Unit = js.native
  def getBadgeBackgroundColor(callback: js.Function1[/* color */ ColorArray, Unit]): Unit = js.native
  def getBadgeText(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getPage(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getTitle(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def hide(): Unit = js.native
  def hide(callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def hide(windowId: Double): Unit = js.native
  def hide(windowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
  def setBadgeText(details: SidebarBadgeDetail): Unit = js.native
  def setIcon(details: SidebarIconDetail): Unit = js.native
  def setPage(details: SidebarPageDetail): Unit = js.native
  def setTitle(details: SidebarTitleDetail): Unit = js.native
  def show(): Unit = js.native
  def show(callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def show(details: SidebarShowDetail): Unit = js.native
  def show(details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def show(windowId: Double): Unit = js.native
  def show(windowId: Double, details: SidebarShowDetail): Unit = js.native
  def show(windowId: Double, details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def undock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
}

