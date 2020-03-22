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
trait LegacyWinOptionsInAppOptions extends js.Object {
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
  var api: js.UndefOr[Api] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var autoShow: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var contentNavigation: js.UndefOr[ContentNavigation] = js.undefined
  var contextMenu: js.UndefOr[Boolean] = js.undefined
  var cornerRounding: js.UndefOr[CornerRounding] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
  var defaultCentered: js.UndefOr[Boolean] = js.undefined
  var defaultHeight: js.UndefOr[Double] = js.undefined
  var defaultLeft: js.UndefOr[Double] = js.undefined
  var defaultTop: js.UndefOr[Double] = js.undefined
  var defaultWidth: js.UndefOr[Double] = js.undefined
  var frame: js.UndefOr[Boolean] = js.undefined
  var hideOnClose: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var maximizable: js.UndefOr[Boolean] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var minimizable: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resizeRegion: js.UndefOr[ResizeRegion] = js.undefined
  var saveWindowState: js.UndefOr[Boolean] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var showTaskbarIcon: js.UndefOr[Boolean] = js.undefined
  var smallWindow: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var taskbarIconGroup: js.UndefOr[String] = js.undefined
  var waitForPageLoad: js.UndefOr[Boolean] = js.undefined
}

object LegacyWinOptionsInAppOptions {
  @scala.inline
  def apply(
    accelerator: Accelerator = null,
    alwaysOnTop: js.UndefOr[Boolean] = js.undefined,
    api: Api = null,
    aspectRatio: Int | Double = null,
    autoShow: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    contentNavigation: ContentNavigation = null,
    contextMenu: js.UndefOr[Boolean] = js.undefined,
    cornerRounding: CornerRounding = null,
    customData: js.Any = null,
    customRequestHeaders: js.Array[CustomRequestHeaders] = null,
    defaultCentered: js.UndefOr[Boolean] = js.undefined,
    defaultHeight: Int | Double = null,
    defaultLeft: Int | Double = null,
    defaultTop: Int | Double = null,
    defaultWidth: Int | Double = null,
    frame: js.UndefOr[Boolean] = js.undefined,
    hideOnClose: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    preloadScripts: js.Array[DownloadPreloadOption] = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizeRegion: ResizeRegion = null,
    saveWindowState: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    showTaskbarIcon: js.UndefOr[Boolean] = js.undefined,
    smallWindow: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    taskbarIconGroup: String = null,
    waitForPageLoad: js.UndefOr[Boolean] = js.undefined
  ): LegacyWinOptionsInAppOptions = {
    val __obj = js.Dynamic.literal()
    if (accelerator != null) __obj.updateDynamic("accelerator")(accelerator.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysOnTop)) __obj.updateDynamic("alwaysOnTop")(alwaysOnTop.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoShow)) __obj.updateDynamic("autoShow")(autoShow.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (contentNavigation != null) __obj.updateDynamic("contentNavigation")(contentNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenu)) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (cornerRounding != null) __obj.updateDynamic("cornerRounding")(cornerRounding.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (customRequestHeaders != null) __obj.updateDynamic("customRequestHeaders")(customRequestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCentered)) __obj.updateDynamic("defaultCentered")(defaultCentered.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultLeft != null) __obj.updateDynamic("defaultLeft")(defaultLeft.asInstanceOf[js.Any])
    if (defaultTop != null) __obj.updateDynamic("defaultTop")(defaultTop.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClose)) __obj.updateDynamic("hideOnClose")(hideOnClose.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preloadScripts != null) __obj.updateDynamic("preloadScripts")(preloadScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resizeRegion != null) __obj.updateDynamic("resizeRegion")(resizeRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(saveWindowState)) __obj.updateDynamic("saveWindowState")(saveWindowState.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showTaskbarIcon)) __obj.updateDynamic("showTaskbarIcon")(showTaskbarIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(smallWindow)) __obj.updateDynamic("smallWindow")(smallWindow.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (taskbarIconGroup != null) __obj.updateDynamic("taskbarIconGroup")(taskbarIconGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForPageLoad)) __obj.updateDynamic("waitForPageLoad")(waitForPageLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyWinOptionsInAppOptions]
  }
}

