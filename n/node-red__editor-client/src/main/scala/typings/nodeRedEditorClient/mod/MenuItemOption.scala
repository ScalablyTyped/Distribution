package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemOption extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var group: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var onselect: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, Unit])] = js.native
  
  var options: js.UndefOr[js.Array[MenuItemOption | Null]] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var setting: js.UndefOr[String] = js.native
  
  var sublabel: js.UndefOr[String] = js.native
  
  var toggle: js.UndefOr[Boolean] = js.native
}
object MenuItemOption {
  
  @scala.inline
  def apply(): MenuItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOption]
  }
  
  @scala.inline
  implicit class MenuItemOptionOps[Self <: MenuItemOption] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnselectFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("onselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnselect(value: String | (js.Function1[/* repeated */ js.Any, Unit])): Self = this.set("onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (MenuItemOption | Null)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[MenuItemOption | Null]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSetting(value: String): Self = this.set("setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
    
    @scala.inline
    def setSublabel(value: String): Self = this.set("sublabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublabel: Self = this.set("sublabel", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
