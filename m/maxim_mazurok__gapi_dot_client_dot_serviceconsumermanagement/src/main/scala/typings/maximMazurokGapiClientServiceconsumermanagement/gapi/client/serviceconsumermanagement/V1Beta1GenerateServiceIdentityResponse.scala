package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Beta1GenerateServiceIdentityResponse extends js.Object {
  
  /** ServiceIdentity that was created or retrieved. */
  var identity: js.UndefOr[V1Beta1ServiceIdentity] = js.native
}
object V1Beta1GenerateServiceIdentityResponse {
  
  @scala.inline
  def apply(): V1Beta1GenerateServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1GenerateServiceIdentityResponse]
  }
  
  @scala.inline
  implicit class V1Beta1GenerateServiceIdentityResponseOps[Self <: V1Beta1GenerateServiceIdentityResponse] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: V1Beta1ServiceIdentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
  }
}
