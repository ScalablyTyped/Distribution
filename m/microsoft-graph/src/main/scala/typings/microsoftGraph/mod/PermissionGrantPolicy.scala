package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionGrantPolicy extends PolicyBase {
  
  var excludes: js.UndefOr[NullableOption[js.Array[PermissionGrantConditionSet]]] = js.native
  
  var includes: js.UndefOr[NullableOption[js.Array[PermissionGrantConditionSet]]] = js.native
}
object PermissionGrantPolicy {
  
  @scala.inline
  def apply(): PermissionGrantPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGrantPolicy]
  }
  
  @scala.inline
  implicit class PermissionGrantPolicyMutableBuilder[Self <: PermissionGrantPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludes(value: NullableOption[js.Array[PermissionGrantConditionSet]]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: PermissionGrantConditionSet*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: NullableOption[js.Array[PermissionGrantConditionSet]]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesNull: Self = StObject.set(x, "includes", null)
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: PermissionGrantConditionSet*): Self = StObject.set(x, "includes", js.Array(value :_*))
  }
}
