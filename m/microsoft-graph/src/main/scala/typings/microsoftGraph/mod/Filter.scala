package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var categoryFilterGroups: js.UndefOr[NullableOption[js.Array[FilterGroup]]] = js.undefined
  
  var groups: js.UndefOr[NullableOption[js.Array[FilterGroup]]] = js.undefined
  
  var inputFilterGroups: js.UndefOr[NullableOption[js.Array[FilterGroup]]] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setCategoryFilterGroups(value: NullableOption[js.Array[FilterGroup]]): Self = StObject.set(x, "categoryFilterGroups", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterGroupsNull: Self = StObject.set(x, "categoryFilterGroups", null)
    
    inline def setCategoryFilterGroupsUndefined: Self = StObject.set(x, "categoryFilterGroups", js.undefined)
    
    inline def setCategoryFilterGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "categoryFilterGroups", js.Array(value*))
    
    inline def setGroups(value: NullableOption[js.Array[FilterGroup]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNull: Self = StObject.set(x, "groups", null)
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setInputFilterGroups(value: NullableOption[js.Array[FilterGroup]]): Self = StObject.set(x, "inputFilterGroups", value.asInstanceOf[js.Any])
    
    inline def setInputFilterGroupsNull: Self = StObject.set(x, "inputFilterGroups", null)
    
    inline def setInputFilterGroupsUndefined: Self = StObject.set(x, "inputFilterGroups", js.undefined)
    
    inline def setInputFilterGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "inputFilterGroups", js.Array(value*))
  }
}
