package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1GenerateDefaultIdentityResponse extends js.Object {
  
  /** Status of the role attachment. Under development (go/si-attach-role), currently always return ATTACH_STATUS_UNSPECIFIED) */
  var attachStatus: js.UndefOr[String] = js.native
  
  /** DefaultIdentity that was created or retrieved. */
  var identity: js.UndefOr[V1DefaultIdentity] = js.native
  
  /** Role attached to consumer project. Empty if not attached in this request. (Under development, currently always return empty.) */
  var role: js.UndefOr[String] = js.native
}
object V1GenerateDefaultIdentityResponse {
  
  @scala.inline
  def apply(): V1GenerateDefaultIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1GenerateDefaultIdentityResponse]
  }
  
  @scala.inline
  implicit class V1GenerateDefaultIdentityResponseOps[Self <: V1GenerateDefaultIdentityResponse] (val x: Self) extends AnyVal {
    
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
    def setAttachStatus(value: String): Self = this.set("attachStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachStatus: Self = this.set("attachStatus", js.undefined)
    
    @scala.inline
    def setIdentity(value: V1DefaultIdentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
