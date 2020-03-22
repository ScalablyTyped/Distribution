package typings.openfin.platformMod

import typings.openfin.applicationOptionMod.ApplicationOption
import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import typings.openfin.viewViewMod.ViewCreationOptions
import typings.openfin.windowOptionMod.Accelerator
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import typings.openfin.windowOptionMod.CornerRounding
import typings.openfin.windowOptionMod.CustomRequestHeaders
import typings.openfin.windowOptionMod.ResizeRegion
import typings.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformOptions extends ApplicationOption {
  var defaultViewOptions: js.UndefOr[ViewCreationOptions] = js.undefined
  var defaultWindowOptions: js.UndefOr[WindowOption] = js.undefined
}

object PlatformOptions {
  @scala.inline
  def apply(
    uuid: String,
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
    defaultViewOptions: ViewCreationOptions = null,
    defaultWidth: Int | Double = null,
    defaultWindowOptions: WindowOption = null,
    disableIabSecureLogging: js.UndefOr[Boolean] = js.undefined,
    fdc3Api: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    hideOnClose: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    loadErrorMessage: String = null,
    mainWindowOptions: WindowOption = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nonPersistent: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    plugins: js.UndefOr[Boolean] = js.undefined,
    preloadScripts: js.Array[DownloadPreloadOption] = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizeRegion: ResizeRegion = null,
    saveWindowState: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    showTaskbarIcon: js.UndefOr[Boolean] = js.undefined,
    smallWindow: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    taskbarIconGroup: String = null,
    url: String = null,
    waitForPageLoad: js.UndefOr[Boolean] = js.undefined,
    webSecurity: js.UndefOr[Boolean] = js.undefined
  ): PlatformOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
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
    if (defaultViewOptions != null) __obj.updateDynamic("defaultViewOptions")(defaultViewOptions.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (defaultWindowOptions != null) __obj.updateDynamic("defaultWindowOptions")(defaultWindowOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIabSecureLogging)) __obj.updateDynamic("disableIabSecureLogging")(disableIabSecureLogging.asInstanceOf[js.Any])
    if (!js.isUndefined(fdc3Api)) __obj.updateDynamic("fdc3Api")(fdc3Api.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClose)) __obj.updateDynamic("hideOnClose")(hideOnClose.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadErrorMessage != null) __obj.updateDynamic("loadErrorMessage")(loadErrorMessage.asInstanceOf[js.Any])
    if (mainWindowOptions != null) __obj.updateDynamic("mainWindowOptions")(mainWindowOptions.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistent)) __obj.updateDynamic("nonPersistent")(nonPersistent.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (preloadScripts != null) __obj.updateDynamic("preloadScripts")(preloadScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resizeRegion != null) __obj.updateDynamic("resizeRegion")(resizeRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(saveWindowState)) __obj.updateDynamic("saveWindowState")(saveWindowState.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showTaskbarIcon)) __obj.updateDynamic("showTaskbarIcon")(showTaskbarIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(smallWindow)) __obj.updateDynamic("smallWindow")(smallWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (taskbarIconGroup != null) __obj.updateDynamic("taskbarIconGroup")(taskbarIconGroup.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForPageLoad)) __obj.updateDynamic("waitForPageLoad")(waitForPageLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(webSecurity)) __obj.updateDynamic("webSecurity")(webSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOptions]
  }
}

