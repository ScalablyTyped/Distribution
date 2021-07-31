package typings.naverWhale.global.whale

import typings.naverWhale.whale.sidebarAction.BadgeBackgroundColorDetails
import typings.naverWhale.whale.sidebarAction.BrowserClickedEvent
import typings.naverWhale.whale.sidebarAction.ColorArray
import typings.naverWhale.whale.sidebarAction.SidebarBadgeDetail
import typings.naverWhale.whale.sidebarAction.SidebarDockDetail
import typings.naverWhale.whale.sidebarAction.SidebarIconDetail
import typings.naverWhale.whale.sidebarAction.SidebarPageDetail
import typings.naverWhale.whale.sidebarAction.SidebarShowDetail
import typings.naverWhale.whale.sidebarAction.SidebarTitleDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarAction {
  
  @JSGlobal("whale.sidebarAction")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dock")(popupWindowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def dock(
    popupWindowId: Double,
    details: SidebarDockDetail,
    callback: js.Function1[/* windowId */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dock")(popupWindowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getBadgeBackgroundColor(callback: js.Function1[/* color */ ColorArray, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getBadgeText(callback: js.Function1[/* result */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getPage(callback: js.Function1[/* result */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getTitle(callback: js.Function1[/* result */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  @scala.inline
  def hide(callback: js.Function1[/* windowId */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def hide(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def hide(windowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hide")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("whale.sidebarAction.onClicked")
  @js.native
  def onClicked: BrowserClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setBadgeText(details: SidebarBadgeDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setIcon(details: SidebarIconDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setPage(details: SidebarPageDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPage")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTitle(details: SidebarTitleDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  @scala.inline
  def show(callback: js.Function1[/* windowId */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(details: SidebarShowDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(windowId: Double, details: Unit, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(windowId: Double, details: SidebarShowDetail): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(windowId: Double, details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def undock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undock")(popupWindowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
