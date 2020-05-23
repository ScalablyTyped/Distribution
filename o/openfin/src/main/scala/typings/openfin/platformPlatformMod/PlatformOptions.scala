package typings.openfin.platformPlatformMod

import typings.openfin.applicationOptionMod.ApplicationOption
import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import typings.openfin.shapesMod.ShortcutOverride
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
  @JSName("defaultWindowOptions")
  var defaultWindowOptions_PlatformOptions: js.UndefOr[DefaultWindowOptions] = js.undefined
  var disableDefaultCommands: js.UndefOr[Boolean] = js.undefined
}

object PlatformOptions {
  @scala.inline
  def apply(
    uuid: String,
    accelerator: Accelerator = null,
    alwaysOnTop: js.UndefOr[Boolean] = js.undefined,
    api: Api = null,
    aspectRatio: js.UndefOr[Double] = js.undefined,
    autoShow: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    commands: js.Array[ShortcutOverride] = null,
    contentNavigation: ContentNavigation = null,
    contextMenu: js.UndefOr[Boolean] = js.undefined,
    cornerRounding: CornerRounding = null,
    customData: js.Any = null,
    customRequestHeaders: js.Array[CustomRequestHeaders] = null,
    defaultCentered: js.UndefOr[Boolean] = js.undefined,
    defaultHeight: js.UndefOr[Double] = js.undefined,
    defaultLeft: js.UndefOr[Double] = js.undefined,
    defaultTop: js.UndefOr[Double] = js.undefined,
    defaultViewOptions: ViewCreationOptions = null,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    defaultWindowOptions: DefaultWindowOptions = null,
    disableDefaultCommands: js.UndefOr[Boolean] = js.undefined,
    disableIabSecureLogging: js.UndefOr[Boolean] = js.undefined,
    fdc3Api: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    hideOnClose: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    isPlatformController: js.UndefOr[Boolean] = js.undefined,
    loadErrorMessage: String = null,
    mainWindowOptions: WindowOption = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nonPersistent: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(alwaysOnTop)) __obj.updateDynamic("alwaysOnTop")(alwaysOnTop.get.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoShow)) __obj.updateDynamic("autoShow")(autoShow.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (contentNavigation != null) __obj.updateDynamic("contentNavigation")(contentNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenu)) __obj.updateDynamic("contextMenu")(contextMenu.get.asInstanceOf[js.Any])
    if (cornerRounding != null) __obj.updateDynamic("cornerRounding")(cornerRounding.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (customRequestHeaders != null) __obj.updateDynamic("customRequestHeaders")(customRequestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCentered)) __obj.updateDynamic("defaultCentered")(defaultCentered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHeight)) __obj.updateDynamic("defaultHeight")(defaultHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLeft)) __obj.updateDynamic("defaultLeft")(defaultLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultTop)) __obj.updateDynamic("defaultTop")(defaultTop.get.asInstanceOf[js.Any])
    if (defaultViewOptions != null) __obj.updateDynamic("defaultViewOptions")(defaultViewOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (defaultWindowOptions != null) __obj.updateDynamic("defaultWindowOptions")(defaultWindowOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDefaultCommands)) __obj.updateDynamic("disableDefaultCommands")(disableDefaultCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIabSecureLogging)) __obj.updateDynamic("disableIabSecureLogging")(disableIabSecureLogging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fdc3Api)) __obj.updateDynamic("fdc3Api")(fdc3Api.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClose)) __obj.updateDynamic("hideOnClose")(hideOnClose.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlatformController)) __obj.updateDynamic("isPlatformController")(isPlatformController.get.asInstanceOf[js.Any])
    if (loadErrorMessage != null) __obj.updateDynamic("loadErrorMessage")(loadErrorMessage.asInstanceOf[js.Any])
    if (mainWindowOptions != null) __obj.updateDynamic("mainWindowOptions")(mainWindowOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistent)) __obj.updateDynamic("nonPersistent")(nonPersistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.get.asInstanceOf[js.Any])
    if (preloadScripts != null) __obj.updateDynamic("preloadScripts")(preloadScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (resizeRegion != null) __obj.updateDynamic("resizeRegion")(resizeRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(saveWindowState)) __obj.updateDynamic("saveWindowState")(saveWindowState.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTaskbarIcon)) __obj.updateDynamic("showTaskbarIcon")(showTaskbarIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smallWindow)) __obj.updateDynamic("smallWindow")(smallWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (taskbarIconGroup != null) __obj.updateDynamic("taskbarIconGroup")(taskbarIconGroup.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForPageLoad)) __obj.updateDynamic("waitForPageLoad")(waitForPageLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webSecurity)) __obj.updateDynamic("webSecurity")(webSecurity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOptions]
  }
}

