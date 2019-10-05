package typings.nwDotJs.NWJS_Helpers

import typings.nwDotJs.nw.Menu
import typings.nwDotJs.nwDotJsStrings.checkbox
import typings.nwDotJs.nwDotJsStrings.normal
import typings.nwDotJs.nwDotJsStrings.separator
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
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * {Function} (Optional) The callback function when item is triggered by mouse click or keyboard shortcut
    */
  var click: js.UndefOr[js.Function] = js.undefined
  /**
    * {boolean} (Optional) Whether the item is enabled or disabled. It"s set to true by default.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * {string} (Optional) Icon for normal item or checkbox
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * {string} (Optional) The key of the shortcut
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * {string} (Optional) Label for normal item or checkbox
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * {string} (Optional) The modifiers of the shortcut
    */
  var modifiers: js.UndefOr[String] = js.undefined
  /**
    * {nw.Menu} (Optional) A submenu
    */
  var submenu: js.UndefOr[Menu] = js.undefined
  /**
    * {string} (Optional) Tooltip for normal item or checkbox
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * {string} (Optional) The type of the item. Three types are accepted: normal, checkbox, separator
    */
  var `type`: js.UndefOr[String | normal | checkbox | separator] = js.undefined
}

object MenuItemOption {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    click: js.Function = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    key: String = null,
    label: String = null,
    modifiers: String = null,
    submenu: Menu = null,
    tooltip: String = null,
    `type`: String | normal | checkbox | separator = null
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

