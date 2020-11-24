package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemVersion extends BaseItemVersion {
  
  // A collection of the fields and values for this version of the list item.
  var fields: js.UndefOr[NullableOption[FieldValueSet]] = js.native
}
object ListItemVersion {
  
  @scala.inline
  def apply(): ListItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemVersion]
  }
  
  @scala.inline
  implicit class ListItemVersionOps[Self <: ListItemVersion] (val x: Self) extends AnyVal {
    
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
    def setFields(value: NullableOption[FieldValueSet]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
  }
}
