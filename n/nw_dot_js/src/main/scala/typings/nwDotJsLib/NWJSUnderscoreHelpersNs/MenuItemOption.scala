package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for MenuItem.
  */
trait MenuItemOption extends js.Object {
  /**
    * {boolean} (Optional) Whether the checkbox is checked or not. It"s set to false by default.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * {Function} (Optional) The callback function when item is triggered by mouse click or keyboard shortcut
    */
  var click: js.UndefOr[js.Function] = js.undefined
  /**
    * {boolean} (Optional) Whether the item is enabled or disabled. It"s set to true by default.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * {string} (Optional) Icon for normal item or checkbox
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {string} (Optional) The key of the shortcut
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {string} (Optional) Label for normal item or checkbox
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {string} (Optional) The modifiers of the shortcut
    */
  var modifiers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {nw.Menu} (Optional) A submenu
    */
  var submenu: js.UndefOr[nwDotJsLib.nwNs.Menu] = js.undefined
  /**
    * {string} (Optional) Tooltip for normal item or checkbox
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {string} (Optional) The type of the item. Three types are accepted: normal, checkbox, separator
    */
  var `type`: js.UndefOr[
    java.lang.String | nwDotJsLib.nwDotJsLibStrings.normal | nwDotJsLib.nwDotJsLibStrings.checkbox | nwDotJsLib.nwDotJsLibStrings.separator
  ] = js.undefined
}

object MenuItemOption {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    click: js.Function = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    key: java.lang.String = null,
    label: java.lang.String = null,
    modifiers: java.lang.String = null,
    submenu: nwDotJsLib.nwNs.Menu = null,
    tooltip: java.lang.String = null,
    `type`: java.lang.String | nwDotJsLib.nwDotJsLibStrings.normal | nwDotJsLib.nwDotJsLibStrings.checkbox | nwDotJsLib.nwDotJsLibStrings.separator = null
  ): MenuItemOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (click != null) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemOption]
  }
}

