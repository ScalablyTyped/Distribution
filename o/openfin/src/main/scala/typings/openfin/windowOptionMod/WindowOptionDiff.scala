package typings.openfin.windowOptionMod

import typings.openfin.anon.NewVal
import typings.openfin.anon.NewValOldVal
import typings.openfin.anon.OldVal
import typings.openfin.anon.`0`
import typings.openfin.anon.`10`
import typings.openfin.anon.`11`
import typings.openfin.anon.`12`
import typings.openfin.anon.`1`
import typings.openfin.anon.`2`
import typings.openfin.anon.`3`
import typings.openfin.anon.`4`
import typings.openfin.anon.`5`
import typings.openfin.anon.`6`
import typings.openfin.anon.`7`
import typings.openfin.anon.`8`
import typings.openfin.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in keyof openfin.openfin/_v2/api/window/windowOption.WindowOption ]: {  oldVal :openfin.openfin/_v2/api/window/windowOption.WindowOption[key],   newVal :openfin.openfin/_v2/api/window/windowOption.WindowOption[key]}} */
@js.native
trait WindowOptionDiff extends js.Object {
  
  var accelerator: js.UndefOr[`12`] = js.native
  
  var alphaMask: js.UndefOr[`5`] = js.native
  
  var alwaysOnTop: js.UndefOr[NewValOldVal] = js.native
  
  var api: js.UndefOr[`7`] = js.native
  
  var applicationIcon: js.UndefOr[`2`] = js.native
  
  var aspectRatio: js.UndefOr[NewVal] = js.native
  
  var autoShow: js.UndefOr[NewValOldVal] = js.native
  
  var backgroundColor: js.UndefOr[`2`] = js.native
  
  var contentNavigation: js.UndefOr[`8`] = js.native
  
  var contentRedirect: js.UndefOr[`4`] = js.native
  
  var contextMenu: js.UndefOr[NewValOldVal] = js.native
  
  var contextMenuSettings: js.UndefOr[`9`] = js.native
  
  var cornerRounding: js.UndefOr[`0`] = js.native
  
  var customContext: js.UndefOr[`1`] = js.native
  
  var customData: js.UndefOr[`1`] = js.native
  
  var customRequestHeaders: js.UndefOr[`6`] = js.native
  
  var defaultCentered: js.UndefOr[NewValOldVal] = js.native
  
  var defaultHeight: js.UndefOr[NewVal] = js.native
  
  var defaultLeft: js.UndefOr[NewVal] = js.native
  
  var defaultTop: js.UndefOr[NewVal] = js.native
  
  var defaultWidth: js.UndefOr[NewVal] = js.native
  
  var frame: js.UndefOr[NewValOldVal] = js.native
  
  var hideOnClose: js.UndefOr[NewValOldVal] = js.native
  
  var hotkeys: js.UndefOr[OldVal] = js.native
  
  var icon: js.UndefOr[`2`] = js.native
  
  var layout: js.UndefOr[`3`] = js.native
  
  var maxHeight: js.UndefOr[NewVal] = js.native
  
  var maxWidth: js.UndefOr[NewVal] = js.native
  
  var maximizable: js.UndefOr[NewValOldVal] = js.native
  
  var minHeight: js.UndefOr[NewVal] = js.native
  
  var minWidth: js.UndefOr[NewVal] = js.native
  
  var minimizable: js.UndefOr[NewValOldVal] = js.native
  
  var name: js.UndefOr[`2`] = js.native
  
  var opacity: js.UndefOr[NewVal] = js.native
  
  var preloadScripts: js.UndefOr[`10`] = js.native
  
  var resizable: js.UndefOr[NewValOldVal] = js.native
  
  var resizeRegion: js.UndefOr[`11`] = js.native
  
  var saveWindowState: js.UndefOr[NewValOldVal] = js.native
  
  var shadow: js.UndefOr[NewValOldVal] = js.native
  
  var showBackgroundImages: js.UndefOr[NewValOldVal] = js.native
  
  var showTaskbarIcon: js.UndefOr[NewValOldVal] = js.native
  
  var smallWindow: js.UndefOr[NewValOldVal] = js.native
  
  var state: js.UndefOr[`2`] = js.native
  
  var taskbarIconGroup: js.UndefOr[`2`] = js.native
  
  var url: js.UndefOr[`2`] = js.native
  
  var uuid: js.UndefOr[`2`] = js.native
  
  var waitForPageLoad: js.UndefOr[NewValOldVal] = js.native
}
object WindowOptionDiff {
  
  @scala.inline
  def apply(): WindowOptionDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOptionDiff]
  }
  
  @scala.inline
  implicit class WindowOptionDiffOps[Self <: WindowOptionDiff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccelerator(value: `12`): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    
    @scala.inline
    def setAlphaMask(value: `5`): Self = this.set("alphaMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaMask: Self = this.set("alphaMask", js.undefined)
    
    @scala.inline
    def setAlwaysOnTop(value: NewValOldVal): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysOnTop: Self = this.set("alwaysOnTop", js.undefined)
    
    @scala.inline
    def setApi(value: `7`): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setApplicationIcon(value: `2`): Self = this.set("applicationIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationIcon: Self = this.set("applicationIcon", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: NewVal): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoShow(value: NewValOldVal): Self = this.set("autoShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoShow: Self = this.set("autoShow", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: `2`): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setContentNavigation(value: `8`): Self = this.set("contentNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentNavigation: Self = this.set("contentNavigation", js.undefined)
    
    @scala.inline
    def setContentRedirect(value: `4`): Self = this.set("contentRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRedirect: Self = this.set("contentRedirect", js.undefined)
    
    @scala.inline
    def setContextMenu(value: NewValOldVal): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setContextMenuSettings(value: `9`): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    
    @scala.inline
    def setCornerRounding(value: `0`): Self = this.set("cornerRounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRounding: Self = this.set("cornerRounding", js.undefined)
    
    @scala.inline
    def setCustomContext(value: `1`): Self = this.set("customContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomContext: Self = this.set("customContext", js.undefined)
    
    @scala.inline
    def setCustomData(value: `1`): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    
    @scala.inline
    def setCustomRequestHeaders(value: `6`): Self = this.set("customRequestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRequestHeaders: Self = this.set("customRequestHeaders", js.undefined)
    
    @scala.inline
    def setDefaultCentered(value: NewValOldVal): Self = this.set("defaultCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCentered: Self = this.set("defaultCentered", js.undefined)
    
    @scala.inline
    def setDefaultHeight(value: NewVal): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    
    @scala.inline
    def setDefaultLeft(value: NewVal): Self = this.set("defaultLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLeft: Self = this.set("defaultLeft", js.undefined)
    
    @scala.inline
    def setDefaultTop(value: NewVal): Self = this.set("defaultTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTop: Self = this.set("defaultTop", js.undefined)
    
    @scala.inline
    def setDefaultWidth(value: NewVal): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    
    @scala.inline
    def setFrame(value: NewValOldVal): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setHideOnClose(value: NewValOldVal): Self = this.set("hideOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnClose: Self = this.set("hideOnClose", js.undefined)
    
    @scala.inline
    def setHotkeys(value: OldVal): Self = this.set("hotkeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkeys: Self = this.set("hotkeys", js.undefined)
    
    @scala.inline
    def setIcon(value: `2`): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLayout(value: `3`): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: NewVal): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: NewVal): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMaximizable(value: NewValOldVal): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    
    @scala.inline
    def setMinHeight(value: NewVal): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: NewVal): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMinimizable(value: NewValOldVal): Self = this.set("minimizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizable: Self = this.set("minimizable", js.undefined)
    
    @scala.inline
    def setName(value: `2`): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: NewVal): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPreloadScripts(value: `10`): Self = this.set("preloadScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadScripts: Self = this.set("preloadScripts", js.undefined)
    
    @scala.inline
    def setResizable(value: NewValOldVal): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setResizeRegion(value: `11`): Self = this.set("resizeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeRegion: Self = this.set("resizeRegion", js.undefined)
    
    @scala.inline
    def setSaveWindowState(value: NewValOldVal): Self = this.set("saveWindowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveWindowState: Self = this.set("saveWindowState", js.undefined)
    
    @scala.inline
    def setShadow(value: NewValOldVal): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShowBackgroundImages(value: NewValOldVal): Self = this.set("showBackgroundImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBackgroundImages: Self = this.set("showBackgroundImages", js.undefined)
    
    @scala.inline
    def setShowTaskbarIcon(value: NewValOldVal): Self = this.set("showTaskbarIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTaskbarIcon: Self = this.set("showTaskbarIcon", js.undefined)
    
    @scala.inline
    def setSmallWindow(value: NewValOldVal): Self = this.set("smallWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallWindow: Self = this.set("smallWindow", js.undefined)
    
    @scala.inline
    def setState(value: `2`): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTaskbarIconGroup(value: `2`): Self = this.set("taskbarIconGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskbarIconGroup: Self = this.set("taskbarIconGroup", js.undefined)
    
    @scala.inline
    def setUrl(value: `2`): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUuid(value: `2`): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    
    @scala.inline
    def setWaitForPageLoad(value: NewValOldVal): Self = this.set("waitForPageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForPageLoad: Self = this.set("waitForPageLoad", js.undefined)
  }
}
