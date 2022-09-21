package typings.naverWhale

import typings.naverWhale.chrome.downloads.StateType
import typings.naverWhale.whale.sidebarAction.BadgeBackgroundColorDetails
import typings.naverWhale.whale.sidebarAction.BrowserClickedEvent
import typings.naverWhale.whale.sidebarAction.ColorArray
import typings.naverWhale.whale.sidebarAction.SidebarBadgeDetail
import typings.naverWhale.whale.sidebarAction.SidebarDockDetail
import typings.naverWhale.whale.sidebarAction.SidebarIconDetail
import typings.naverWhale.whale.sidebarAction.SidebarPageDetail
import typings.naverWhale.whale.sidebarAction.SidebarShowDetail
import typings.naverWhale.whale.sidebarAction.SidebarTitleDetail
import typings.naverWhale.whale.topSites.MostVisitedURL
import typings.naverWhale.whale.topSites.MostVisitedURL2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object chrome {
    
    object downloads {
      
      @JSGlobal("chrome.downloads.State")
      @js.native
      val State: StateType = js.native
    }
  }
  
  object whale {
    
    /**
      * 특정 탭의 네트워크 통신, JavaScript 디버깅, DOM · CSS 변형 등 디버그를 위한 [원격 디버깅 프로토콜](https://chromedevtools.github.io/devtools-protocol/tot/Network)을 사용할 수 있습니다.
      * `sendCommand()` 메소드와 `onEvent` 핸들러 함수를 이용해 개발자도구에서 제공하는 개별 기능을 명령 단위로 수행할 수 있습니다.
      * 권한: "debugger"
      * @since Chrome 18.
      */
    @JSGlobal("whale._debugger")
    @js.native
    val debugger: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof chrome.debugger */ Any = js.native
    
    object downloads {
      
      @JSGlobal("chrome.downloads.State")
      @js.native
      val State: StateType = js.native
    }
    
    ////////////////////
    // Runtime
    ////////////////////
    /**
      * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
      * @since Chrome 22
      */
    object runtime {
      
      @JSGlobal("chrome.runtime.OnInstalledReason")
      @js.native
      object OnInstalledReason extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.naverWhale.whale.runtime.OnInstalledReason & String] = js.native
        
        /* "chrome_update" */ val CHROME_UPDATE: typings.naverWhale.whale.runtime.OnInstalledReason.CHROME_UPDATE & String = js.native
        
        /* "install" */ val INSTALL: typings.naverWhale.whale.runtime.OnInstalledReason.INSTALL & String = js.native
        
        /* "shared_module_update" */ val SHARED_MODULE_UPDATE: typings.naverWhale.whale.runtime.OnInstalledReason.SHARED_MODULE_UPDATE & String = js.native
        
        /* "update" */ val UPDATE: typings.naverWhale.whale.runtime.OnInstalledReason.UPDATE & String = js.native
      }
    }
    
    object sidebarAction {
      
      @JSGlobal("whale.sidebarAction")
      @js.native
      val ^ : js.Any = js.native
      
      inline def dock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dock")(popupWindowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def dock(
        popupWindowId: Double,
        details: SidebarDockDetail,
        callback: js.Function1[/* windowId */ Double, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dock")(popupWindowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def getBadgeBackgroundColor(callback: js.Function1[/* color */ ColorArray, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def getBadgeText(callback: js.Function1[/* result */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def getPage(callback: js.Function1[/* result */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def getTitle(callback: js.Function1[/* result */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
      inline def hide(callback: js.Function1[/* windowId */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def hide(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def hide(windowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hide")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSGlobal("whale.sidebarAction.onClicked")
      @js.native
      def onClicked: BrowserClickedEvent = js.native
      inline def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
      
      inline def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setBadgeText(details: SidebarBadgeDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setIcon(details: SidebarIconDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setPage(details: SidebarPageDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPage")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setTitle(details: SidebarTitleDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
      inline def show(callback: js.Function1[/* windowId */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def show(details: SidebarShowDetail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def show(details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def show(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def show(windowId: Double, details: Unit, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def show(windowId: Double, details: SidebarShowDetail): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def show(windowId: Double, details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def undock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("undock")(popupWindowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    object topSites {
      
      @JSGlobal("whale.topSites")
      @js.native
      val ^ : js.Any = js.native
      
      inline def add(url: String, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def add(url: String, title: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def block(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 자주 가는 사이트에서 해당 url을 삭제합니다.
        * @param url 삭제할 url
        */
      @JSGlobal("whale.topSites._delete")
      @js.native
      def delete: js.Function1[/* url */ String, Unit] = js.native
      
      inline def delete_=(x: js.Function1[/* url */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
      
      inline def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def isBlocked(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlocked")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def search(term: String, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def search(term: String, count: Double, callback: js.Function1[/* result */ js.Array[MostVisitedURL2], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], count.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def unblock(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unblock")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def update(urls: js.Array[MostVisitedURL2]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(urls.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
  }
}
