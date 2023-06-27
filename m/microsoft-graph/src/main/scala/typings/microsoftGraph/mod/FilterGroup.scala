package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterGroup extends StObject {
  
  var clauses: js.UndefOr[NullableOption[js.Array[FilterClause]]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object FilterGroup {
  
  inline def apply(): FilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterGroup] (val x: Self) extends AnyVal {
    
    inline def setClauses(value: NullableOption[js.Array[FilterClause]]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesNull: Self = StObject.set(x, "clauses", null)
    
    inline def setClausesUndefined: Self = StObject.set(x, "clauses", js.undefined)
    
    inline def setClausesVarargs(value: FilterClause*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
