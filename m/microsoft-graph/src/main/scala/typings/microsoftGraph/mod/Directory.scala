package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directory
  extends StObject
     with Entity {
  
  var administrativeUnits: js.UndefOr[NullableOption[js.Array[AdministrativeUnit]]] = js.undefined
  
  // Recently deleted items. Read-only. Nullable.
  var deletedItems: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
}
object Directory {
  
  @scala.inline
  def apply(): Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directory]
  }
  
  @scala.inline
  implicit class DirectoryMutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrativeUnits(value: NullableOption[js.Array[AdministrativeUnit]]): Self = StObject.set(x, "administrativeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeUnitsNull: Self = StObject.set(x, "administrativeUnits", null)
    
    @scala.inline
    def setAdministrativeUnitsUndefined: Self = StObject.set(x, "administrativeUnits", js.undefined)
    
    @scala.inline
    def setAdministrativeUnitsVarargs(value: AdministrativeUnit*): Self = StObject.set(x, "administrativeUnits", js.Array(value :_*))
    
    @scala.inline
    def setDeletedItems(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "deletedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedItemsNull: Self = StObject.set(x, "deletedItems", null)
    
    @scala.inline
    def setDeletedItemsUndefined: Self = StObject.set(x, "deletedItems", js.undefined)
    
    @scala.inline
    def setDeletedItemsVarargs(value: DirectoryObject*): Self = StObject.set(x, "deletedItems", js.Array(value :_*))
  }
}
