package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupFilter extends StObject {
  
  var includedGroups: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object GroupFilter {
  
  inline def apply(): GroupFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupFilter] (val x: Self) extends AnyVal {
    
    inline def setIncludedGroups(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "includedGroups", value.asInstanceOf[js.Any])
    
    inline def setIncludedGroupsNull: Self = StObject.set(x, "includedGroups", null)
    
    inline def setIncludedGroupsUndefined: Self = StObject.set(x, "includedGroups", js.undefined)
    
    inline def setIncludedGroupsVarargs(value: String*): Self = StObject.set(x, "includedGroups", js.Array(value*))
  }
}
