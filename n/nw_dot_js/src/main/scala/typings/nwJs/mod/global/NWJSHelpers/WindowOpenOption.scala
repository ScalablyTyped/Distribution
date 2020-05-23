package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOpenOption extends WindowOption {
  /**
    * (Optional) The script to be injected before document unloaded.
    */
  var inject_js_end: js.UndefOr[String] = js.undefined
  /**
    * (Optional) The script to be injected before document loaded.
    */
  var inject_js_start: js.UndefOr[String] = js.undefined
  /**
    * (Optional) Whether to open a new window in a separate render process.
    */
  var new_instance: js.UndefOr[Boolean] = js.undefined
}

object WindowOpenOption {
  @scala.inline
  def apply(
    always_on_top: js.UndefOr[Boolean] = js.undefined,
    as_desktop: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    icon: String = null,
    id: String = null,
    inject_js_end: String = null,
    inject_js_start: String = null,
    kiosk: js.UndefOr[Boolean] = js.undefined,
    max_height: js.UndefOr[Double] = js.undefined,
    max_width: js.UndefOr[Double] = js.undefined,
    min_height: js.UndefOr[Double] = js.undefined,
    min_width: js.UndefOr[Double] = js.undefined,
    new_instance: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    show_in_taskbar: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible_on_all_workspaces: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): WindowOpenOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always_on_top)) __obj.updateDynamic("always_on_top")(always_on_top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(as_desktop)) __obj.updateDynamic("as_desktop")(as_desktop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inject_js_end != null) __obj.updateDynamic("inject_js_end")(inject_js_end.asInstanceOf[js.Any])
    if (inject_js_start != null) __obj.updateDynamic("inject_js_start")(inject_js_start.asInstanceOf[js.Any])
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_height)) __obj.updateDynamic("max_height")(max_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_width)) __obj.updateDynamic("max_width")(max_width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_height)) __obj.updateDynamic("min_height")(min_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_width)) __obj.updateDynamic("min_width")(min_width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(new_instance)) __obj.updateDynamic("new_instance")(new_instance.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show_in_taskbar)) __obj.updateDynamic("show_in_taskbar")(show_in_taskbar.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible_on_all_workspaces)) __obj.updateDynamic("visible_on_all_workspaces")(visible_on_all_workspaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOpenOption]
  }
}

