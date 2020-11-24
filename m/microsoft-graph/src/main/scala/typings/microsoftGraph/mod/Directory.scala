package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directory extends Entity {
  
  var administrativeUnits: js.UndefOr[NullableOption[js.Array[AdministrativeUnit]]] = js.native
  
  // Recently deleted items. Read-only. Nullable.
  var deletedItems: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
}
object Directory {
  
  @scala.inline
  def apply(): Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directory]
  }
  
  @scala.inline
  implicit class DirectoryOps[Self <: Directory] (val x: Self) extends AnyVal {
    
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
    def setAdministrativeUnitsVarargs(value: AdministrativeUnit*): Self = this.set("administrativeUnits", js.Array(value :_*))
    
    @scala.inline
    def setAdministrativeUnits(value: NullableOption[js.Array[AdministrativeUnit]]): Self = this.set("administrativeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeUnits: Self = this.set("administrativeUnits", js.undefined)
    
    @scala.inline
    def setAdministrativeUnitsNull: Self = this.set("administrativeUnits", null)
    
    @scala.inline
    def setDeletedItemsVarargs(value: DirectoryObject*): Self = this.set("deletedItems", js.Array(value :_*))
    
    @scala.inline
    def setDeletedItems(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("deletedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedItems: Self = this.set("deletedItems", js.undefined)
    
    @scala.inline
    def setDeletedItemsNull: Self = this.set("deletedItems", null)
  }
}
