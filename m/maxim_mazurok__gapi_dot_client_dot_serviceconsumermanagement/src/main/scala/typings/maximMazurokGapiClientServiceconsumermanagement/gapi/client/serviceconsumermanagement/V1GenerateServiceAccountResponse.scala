package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1GenerateServiceAccountResponse extends js.Object {
  
  /** ServiceAccount that was created or retrieved. */
  var account: js.UndefOr[V1ServiceAccount] = js.native
}
object V1GenerateServiceAccountResponse {
  
  @scala.inline
  def apply(): V1GenerateServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1GenerateServiceAccountResponse]
  }
  
  @scala.inline
  implicit class V1GenerateServiceAccountResponseOps[Self <: V1GenerateServiceAccountResponse] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: V1ServiceAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
  }
}
