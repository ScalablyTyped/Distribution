package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsAddOrUpdateMembershipForUserInOrgResponse422Data extends js.Object {
  
  var errors: js.Array[Field] = js.native
  
  var message: String = js.native
}
object TeamsAddOrUpdateMembershipForUserInOrgResponse422Data {
  
  @scala.inline
  def apply(errors: js.Array[Field], message: String): TeamsAddOrUpdateMembershipForUserInOrgResponse422Data = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserInOrgResponse422Data]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserInOrgResponse422DataOps[Self <: TeamsAddOrUpdateMembershipForUserInOrgResponse422Data] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: Field*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Field]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
