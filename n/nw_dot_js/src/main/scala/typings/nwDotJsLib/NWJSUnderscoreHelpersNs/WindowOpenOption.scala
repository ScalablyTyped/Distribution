package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOpenOption extends WindowOption {
  /**
    * (Optional) The script to be injected before document unloaded.
    */
  var inject_js_end: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) The script to be injected before document loaded.
    */
  var inject_js_start: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) Whether to open a new window in a separate render process.
    */
  var new_instance: js.UndefOr[scala.Boolean] = js.undefined
}

object WindowOpenOption {
  @scala.inline
  def apply(
    always_on_top: js.UndefOr[scala.Boolean] = js.undefined,
    as_desktop: js.UndefOr[scala.Boolean] = js.undefined,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    inject_js_end: java.lang.String = null,
    inject_js_start: java.lang.String = null,
    kiosk: js.UndefOr[scala.Boolean] = js.undefined,
    max_height: scala.Int | scala.Double = null,
    max_width: scala.Int | scala.Double = null,
    min_height: scala.Int | scala.Double = null,
    min_width: scala.Int | scala.Double = null,
    new_instance: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    show_in_taskbar: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    visible_on_all_workspaces: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): WindowOpenOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always_on_top)) __obj.updateDynamic("always_on_top")(always_on_top)
    if (!js.isUndefined(as_desktop)) __obj.updateDynamic("as_desktop")(as_desktop)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inject_js_end != null) __obj.updateDynamic("inject_js_end")(inject_js_end)
    if (inject_js_start != null) __obj.updateDynamic("inject_js_start")(inject_js_start)
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk)
    if (max_height != null) __obj.updateDynamic("max_height")(max_height.asInstanceOf[js.Any])
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (min_width != null) __obj.updateDynamic("min_width")(min_width.asInstanceOf[js.Any])
    if (!js.isUndefined(new_instance)) __obj.updateDynamic("new_instance")(new_instance)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(show_in_taskbar)) __obj.updateDynamic("show_in_taskbar")(show_in_taskbar)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (!js.isUndefined(visible_on_all_workspaces)) __obj.updateDynamic("visible_on_all_workspaces")(visible_on_all_workspaces)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOpenOption]
  }
}

