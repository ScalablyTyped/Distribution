package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestrictedSignIn extends SignIn {
  
  var targetTenantId: js.UndefOr[NullableOption[String]] = js.native
}
object RestrictedSignIn {
  
  @scala.inline
  def apply(): RestrictedSignIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictedSignIn]
  }
  
  @scala.inline
  implicit class RestrictedSignInOps[Self <: RestrictedSignIn] (val x: Self) extends AnyVal {
    
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
    def setTargetTenantId(value: NullableOption[String]): Self = this.set("targetTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTenantId: Self = this.set("targetTenantId", js.undefined)
    
    @scala.inline
    def setTargetTenantIdNull: Self = this.set("targetTenantId", null)
  }
}
