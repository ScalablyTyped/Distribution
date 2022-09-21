package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGrantPolicy
  extends StObject
     with PolicyBase {
  
  // Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
  var excludes: js.UndefOr[NullableOption[js.Array[PermissionGrantConditionSet]]] = js.undefined
  
  // Condition sets which are included in this permission grant policy. Automatically expanded on GET.
  var includes: js.UndefOr[NullableOption[js.Array[PermissionGrantConditionSet]]] = js.undefined
}
object PermissionGrantPolicy {
  
  inline def apply(): PermissionGrantPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGrantPolicy]
  }
  
  extension [Self <: PermissionGrantPolicy](x: Self) {
    
    inline def setExcludes(value: NullableOption[js.Array[PermissionGrantConditionSet]]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: PermissionGrantConditionSet*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setIncludes(value: NullableOption[js.Array[PermissionGrantConditionSet]]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesNull: Self = StObject.set(x, "includes", null)
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIncludesVarargs(value: PermissionGrantConditionSet*): Self = StObject.set(x, "includes", js.Array(value*))
  }
}
