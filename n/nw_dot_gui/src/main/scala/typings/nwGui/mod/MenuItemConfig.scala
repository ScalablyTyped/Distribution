package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemConfig extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var click: js.UndefOr[js.Function] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var modifiers: js.UndefOr[String] = js.native
  var submenu: js.UndefOr[Menu] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object MenuItemConfig {
  @scala.inline
  def apply(): MenuItemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemConfig]
  }
  @scala.inline
  implicit class MenuItemConfigOps[Self <: MenuItemConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setModifiers(value: String): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setSubmenu(value: Menu): Self = this.set("submenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

