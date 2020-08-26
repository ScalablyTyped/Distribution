package typings.openfin.applicationOptionMod

import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import typings.openfin.windowOptionMod.Accelerator
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import typings.openfin.windowOptionMod.CornerRounding
import typings.openfin.windowOptionMod.CustomRequestHeaders
import typings.openfin.windowOptionMod.ResizeRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<openfin.openfin/_v2/api/window/windowOption.WindowOption, 'accelerator' | 'alwaysOnTop' | 'api' | 'aspectRatio' | 'autoShow' | 'backgroundColor' | 'contentNavigation' | 'contextMenu' | 'cornerRounding' | 'customData' | 'customRequestHeaders' | 'defaultCentered' | 'defaultHeight' | 'defaultLeft' | 'defaultTop' | 'defaultWidth' | 'frame' | 'hideOnClose' | 'icon' | 'maxHeight' | 'maximizable' | 'maxWidth' | 'minHeight' | 'minimizable' | 'minWidth' | 'opacity' | 'preloadScripts' | 'resizable' | 'resizeRegion' | 'saveWindowState' | 'shadow' | 'showTaskbarIcon' | 'smallWindow' | 'state' | 'taskbarIconGroup' | 'waitForPageLoad'> */
@js.native
trait LegacyWinOptionsInAppOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.native
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  var api: js.UndefOr[Api] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var autoShow: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var contentNavigation: js.UndefOr[ContentNavigation] = js.native
  var contextMenu: js.UndefOr[Boolean] = js.native
  var cornerRounding: js.UndefOr[CornerRounding] = js.native
  var customData: js.UndefOr[js.Any] = js.native
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
  var defaultCentered: js.UndefOr[Boolean] = js.native
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultLeft: js.UndefOr[Double] = js.native
  var defaultTop: js.UndefOr[Double] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var frame: js.UndefOr[Boolean] = js.native
  var hideOnClose: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var maximizable: js.UndefOr[Boolean] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var minimizable: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resizeRegion: js.UndefOr[ResizeRegion] = js.native
  var saveWindowState: js.UndefOr[Boolean] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var showTaskbarIcon: js.UndefOr[Boolean] = js.native
  var smallWindow: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[String] = js.native
  var taskbarIconGroup: js.UndefOr[String] = js.native
  var waitForPageLoad: js.UndefOr[Boolean] = js.native
}

object LegacyWinOptionsInAppOptions {
  @scala.inline
  def apply(): LegacyWinOptionsInAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyWinOptionsInAppOptions]
  }
  @scala.inline
  implicit class LegacyWinOptionsInAppOptionsOps[Self <: LegacyWinOptionsInAppOptions] (val x: Self) extends AnyVal {
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
    def setAccelerator(value: Accelerator): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    @scala.inline
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysOnTop: Self = this.set("alwaysOnTop", js.undefined)
    @scala.inline
    def setApi(value: Api): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setAutoShow(value: Boolean): Self = this.set("autoShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoShow: Self = this.set("autoShow", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setContentNavigation(value: ContentNavigation): Self = this.set("contentNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentNavigation: Self = this.set("contentNavigation", js.undefined)
    @scala.inline
    def setContextMenu(value: Boolean): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setCornerRounding(value: CornerRounding): Self = this.set("cornerRounding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRounding: Self = this.set("cornerRounding", js.undefined)
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setCustomRequestHeadersVarargs(value: CustomRequestHeaders*): Self = this.set("customRequestHeaders", js.Array(value :_*))
    @scala.inline
    def setCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = this.set("customRequestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRequestHeaders: Self = this.set("customRequestHeaders", js.undefined)
    @scala.inline
    def setDefaultCentered(value: Boolean): Self = this.set("defaultCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCentered: Self = this.set("defaultCentered", js.undefined)
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    @scala.inline
    def setDefaultLeft(value: Double): Self = this.set("defaultLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLeft: Self = this.set("defaultLeft", js.undefined)
    @scala.inline
    def setDefaultTop(value: Double): Self = this.set("defaultTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTop: Self = this.set("defaultTop", js.undefined)
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setHideOnClose(value: Boolean): Self = this.set("hideOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnClose: Self = this.set("hideOnClose", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinimizable(value: Boolean): Self = this.set("minimizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizable: Self = this.set("minimizable", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPreloadScriptsVarargs(value: DownloadPreloadOption*): Self = this.set("preloadScripts", js.Array(value :_*))
    @scala.inline
    def setPreloadScripts(value: js.Array[DownloadPreloadOption]): Self = this.set("preloadScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadScripts: Self = this.set("preloadScripts", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResizeRegion(value: ResizeRegion): Self = this.set("resizeRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeRegion: Self = this.set("resizeRegion", js.undefined)
    @scala.inline
    def setSaveWindowState(value: Boolean): Self = this.set("saveWindowState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveWindowState: Self = this.set("saveWindowState", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShowTaskbarIcon(value: Boolean): Self = this.set("showTaskbarIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTaskbarIcon: Self = this.set("showTaskbarIcon", js.undefined)
    @scala.inline
    def setSmallWindow(value: Boolean): Self = this.set("smallWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallWindow: Self = this.set("smallWindow", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTaskbarIconGroup(value: String): Self = this.set("taskbarIconGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarIconGroup: Self = this.set("taskbarIconGroup", js.undefined)
    @scala.inline
    def setWaitForPageLoad(value: Boolean): Self = this.set("waitForPageLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForPageLoad: Self = this.set("waitForPageLoad", js.undefined)
  }
  
}

