package typings.nwJs.mod._Global_.NWJSHelpers

import typings.nwJs.mod._Global_.nw.Menu
import typings.nwJs.nwJsStrings.checkbox
import typings.nwJs.nwJsStrings.normal
import typings.nwJs.nwJsStrings.separator
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
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemOption]
  }
}

