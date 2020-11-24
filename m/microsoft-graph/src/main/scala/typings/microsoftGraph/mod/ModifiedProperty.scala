package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiedProperty extends js.Object {
  
  // Indicates the property name of the target attribute that was changed.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the updated value for the propery.
  var newValue: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the previous value (before the update) for the property.
  var oldValue: js.UndefOr[NullableOption[String]] = js.native
}
object ModifiedProperty {
  
  @scala.inline
  def apply(): ModifiedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiedProperty]
  }
  
  @scala.inline
  implicit class ModifiedPropertyOps[Self <: ModifiedProperty] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setNewValue(value: NullableOption[String]): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setNewValueNull: Self = this.set("newValue", null)
    
    @scala.inline
    def setOldValue(value: NullableOption[String]): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
  }
}
