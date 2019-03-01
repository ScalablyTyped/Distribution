package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemConfig extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var modifiers: js.UndefOr[java.lang.String] = js.undefined
  var submenu: js.UndefOr[Menu] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MenuItemConfig {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    click: js.Function = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    key: java.lang.String = null,
    label: java.lang.String = null,
    modifiers: java.lang.String = null,
    submenu: Menu = null,
    tooltip: java.lang.String = null,
    `type`: java.lang.String = null
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

