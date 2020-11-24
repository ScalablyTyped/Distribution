package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionsKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildKeys extends js.Object {
  
  var childKeys: js.UndefOr[OptionsKeys] = js.native
  
  var children: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object ChildKeys {
  
  @scala.inline
  def apply(): ChildKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildKeys]
  }
  
  @scala.inline
  implicit class ChildKeysOps[Self <: ChildKeys] (val x: Self) extends AnyVal {
    
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
    def setChildKeys(value: OptionsKeys): Self = this.set("childKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildKeys: Self = this.set("childKeys", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
