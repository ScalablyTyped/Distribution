package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConfig extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var modifiers: js.UndefOr[String] = js.undefined
  var submenu: js.UndefOr[Menu] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object MenuItemConfig {
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
    `type`: String = null
  ): MenuItemConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemConfig]
  }
}

