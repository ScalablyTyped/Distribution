package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveRegisterParametersResponse extends js.Object {
  
  /** Parameters to use when calling the `RegisterDomain` method. */
  var registerParameters: js.UndefOr[RegisterParameters] = js.native
}
object RetrieveRegisterParametersResponse {
  
  @scala.inline
  def apply(): RetrieveRegisterParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRegisterParametersResponse]
  }
  
  @scala.inline
  implicit class RetrieveRegisterParametersResponseOps[Self <: RetrieveRegisterParametersResponse] (val x: Self) extends AnyVal {
    
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
    def setRegisterParameters(value: RegisterParameters): Self = this.set("registerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterParameters: Self = this.set("registerParameters", js.undefined)
  }
}
