package typings.nodePgMigrate.policiesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyOptions extends js.Object {
  
  var check: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String | js.Array[String]] = js.native
  
  var using: js.UndefOr[String] = js.native
}
object PolicyOptions {
  
  @scala.inline
  def apply(): PolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyOptions]
  }
  
  @scala.inline
  implicit class PolicyOptionsOps[Self <: PolicyOptions] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: String): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setRoleVarargs(value: String*): Self = this.set("role", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String | js.Array[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setUsing(value: String): Self = this.set("using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsing: Self = this.set("using", js.undefined)
  }
}
