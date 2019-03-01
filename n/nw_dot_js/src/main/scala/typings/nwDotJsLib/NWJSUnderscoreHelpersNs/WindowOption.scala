package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var always_on_top: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show as desktop background window under X11 environment
    */
  var as_desktop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify it to false to make the window frameless
    */
  var frame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether window is fullscreen
    */
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial height of the main window.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path to window’s icon
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id used to identify the window.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to use Kiosk mode.
    */
  var kiosk: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum height of window
    */
  var max_height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum width of window
    */
  var max_width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum height of window
    */
  var min_height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum width of window
    */
  var min_width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls where window will be put, be `null` or `center` or `mouse`
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether window is resizable
    */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify it to false if you want your app to be hidden on startup
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window is shown in taskbar or dock. The default is true.
    */
  var show_in_taskbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default title of window created by NW.js
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to turn on transparent window mode.
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window should be visible on all workspaces simultaneously (on platforms that support multiple workspaces, currently Mac OS X and Linux).
    */
  var visible_on_all_workspaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial width of the main window.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WindowOption {
  @scala.inline
  def apply(
    always_on_top: js.UndefOr[scala.Boolean] = js.undefined,
    as_desktop: js.UndefOr[scala.Boolean] = js.undefined,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    kiosk: js.UndefOr[scala.Boolean] = js.undefined,
    max_height: scala.Int | scala.Double = null,
    max_width: scala.Int | scala.Double = null,
    min_height: scala.Int | scala.Double = null,
    min_width: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    show_in_taskbar: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    visible_on_all_workspaces: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): WindowOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always_on_top)) __obj.updateDynamic("always_on_top")(always_on_top)
    if (!js.isUndefined(as_desktop)) __obj.updateDynamic("as_desktop")(as_desktop)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk)
    if (max_height != null) __obj.updateDynamic("max_height")(max_height.asInstanceOf[js.Any])
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (min_width != null) __obj.updateDynamic("min_width")(min_width.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(show_in_taskbar)) __obj.updateDynamic("show_in_taskbar")(show_in_taskbar)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (!js.isUndefined(visible_on_all_workspaces)) __obj.updateDynamic("visible_on_all_workspaces")(visible_on_all_workspaces)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOption]
  }
}

