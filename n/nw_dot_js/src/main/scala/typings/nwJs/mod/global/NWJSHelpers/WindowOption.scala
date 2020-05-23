package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window Option that is in the same format as the Window subfields in manifest format.
  */
trait WindowOption extends js.Object {
  /**
    * Whether the window should always stay on top of other windows.
    */
  var always_on_top: js.UndefOr[Boolean] = js.undefined
  /**
    * Show as desktop background window under X11 environment
    */
  var as_desktop: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify it to false to make the window frameless
    */
  var frame: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether window is fullscreen
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial height of the main window.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Path to window’s icon
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * The id used to identify the window.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Whether to use Kiosk mode.
    */
  var kiosk: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum height of window
    */
  var max_height: js.UndefOr[Double] = js.undefined
  /**
    * Maximum width of window
    */
  var max_width: js.UndefOr[Double] = js.undefined
  /**
    * Minimum height of window
    */
  var min_height: js.UndefOr[Double] = js.undefined
  /**
    * Minimum width of window
    */
  var min_width: js.UndefOr[Double] = js.undefined
  /**
    * Controls where window will be put, be `null` or `center` or `mouse`
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Whether window is resizable
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify it to false if you want your app to be hidden on startup
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window is shown in taskbar or dock. The default is true.
    */
  var show_in_taskbar: js.UndefOr[Boolean] = js.undefined
  /**
    * The default title of window created by NW.js
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Whether to turn on transparent window mode.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window should be visible on all workspaces simultaneously (on platforms that support multiple workspaces, currently Mac OS X and Linux).
    */
  var visible_on_all_workspaces: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial width of the main window.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object WindowOption {
  @scala.inline
  def apply(
    always_on_top: js.UndefOr[Boolean] = js.undefined,
    as_desktop: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    icon: String = null,
    id: String = null,
    kiosk: js.UndefOr[Boolean] = js.undefined,
    max_height: js.UndefOr[Double] = js.undefined,
    max_width: js.UndefOr[Double] = js.undefined,
    min_height: js.UndefOr[Double] = js.undefined,
    min_width: js.UndefOr[Double] = js.undefined,
    position: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    show_in_taskbar: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible_on_all_workspaces: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): WindowOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always_on_top)) __obj.updateDynamic("always_on_top")(always_on_top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(as_desktop)) __obj.updateDynamic("as_desktop")(as_desktop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_height)) __obj.updateDynamic("max_height")(max_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_width)) __obj.updateDynamic("max_width")(max_width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_height)) __obj.updateDynamic("min_height")(min_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_width)) __obj.updateDynamic("min_width")(min_width.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show_in_taskbar)) __obj.updateDynamic("show_in_taskbar")(show_in_taskbar.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible_on_all_workspaces)) __obj.updateDynamic("visible_on_all_workspaces")(visible_on_all_workspaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOption]
  }
}

