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
  
  inline def apply(): Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directory]
  }
  
  extension [Self <: Directory](x: Self) {
    
    inline def setAdministrativeUnits(value: NullableOption[js.Array[AdministrativeUnit]]): Self = StObject.set(x, "administrativeUnits", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeUnitsNull: Self = StObject.set(x, "administrativeUnits", null)
    
    inline def setAdministrativeUnitsUndefined: Self = StObject.set(x, "administrativeUnits", js.undefined)
    
    inline def setAdministrativeUnitsVarargs(value: AdministrativeUnit*): Self = StObject.set(x, "administrativeUnits", js.Array(value :_*))
    
    inline def setDeletedItems(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "deletedItems", value.asInstanceOf[js.Any])
    
    inline def setDeletedItemsNull: Self = StObject.set(x, "deletedItems", null)
    
    inline def setDeletedItemsUndefined: Self = StObject.set(x, "deletedItems", js.undefined)
    
    inline def setDeletedItemsVarargs(value: DirectoryObject*): Self = StObject.set(x, "deletedItems", js.Array(value :_*))
  }
}
