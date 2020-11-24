package typings.microsoftGraph.mod

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
  implicit class PermissionGrantPolicyOps[Self <: PermissionGrantPolicy] (val x: Self) extends AnyVal {
    
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
    def setExcludesVarargs(value: PermissionGrantConditionSet*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: NullableOption[js.Array[PermissionGrantConditionSet]]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setExcludesNull: Self = this.set("excludes", null)
    
    @scala.inline
    def setIncludesVarargs(value: PermissionGrantConditionSet*): Self = this.set("includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: NullableOption[js.Array[PermissionGrantConditionSet]]): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
    
    @scala.inline
    def setIncludesNull: Self = this.set("includes", null)
  }
}
