package typings.nwDotGui.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrayOption extends js.Object {
  var alticon: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var menu: js.UndefOr[Menu] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object TrayOption {
  @scala.inline
  def apply(
    alticon: String = null,
    icon: String = null,
    menu: Menu = null,
    title: String = null,
    tooltip: String = null
  ): TrayOption = {
    val __obj = js.Dynamic.literal()
    if (alticon != null) __obj.updateDynamic("alticon")(alticon)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[TrayOption]
  }
}

