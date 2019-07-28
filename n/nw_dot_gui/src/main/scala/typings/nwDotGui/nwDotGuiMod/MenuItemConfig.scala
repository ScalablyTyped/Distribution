package typings.nwDotGui.nwDotGuiMod

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
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (click != null) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuItemConfig]
  }
}

