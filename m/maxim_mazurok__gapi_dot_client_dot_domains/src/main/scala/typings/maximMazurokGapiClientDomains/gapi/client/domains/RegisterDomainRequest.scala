package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterDomainRequest extends js.Object {
  
  /** The list of contact notices that the caller acknowledges. The notices required here depend on the values specified in `registration.contact_settings`. */
  var contactNotices: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of domain notices that you acknowledge. Call `RetrieveRegisterParameters` to see the notices that need acknowledgement. */
  var domainNotices: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The complete `Registration` resource to be created. */
  var registration: js.UndefOr[Registration] = js.native
  
  /** When true, only validation will be performed, without actually registering the domain. Follows: https://cloud.google.com/apis/design/design_patterns#request_validation */
  var validateOnly: js.UndefOr[Boolean] = js.native
  
  /** Required. Yearly price to register or renew the domain. The value that should be put here can be obtained from RetrieveRegisterParameters or SearchDomains calls. */
  var yearlyPrice: js.UndefOr[Money] = js.native
}
object RegisterDomainRequest {
  
  @scala.inline
  def apply(): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDomainRequest]
  }
  
  @scala.inline
  implicit class RegisterDomainRequestOps[Self <: RegisterDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setContactNoticesVarargs(value: String*): Self = this.set("contactNotices", js.Array(value :_*))
    
    @scala.inline
    def setContactNotices(value: js.Array[String]): Self = this.set("contactNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactNotices: Self = this.set("contactNotices", js.undefined)
    
    @scala.inline
    def setDomainNoticesVarargs(value: String*): Self = this.set("domainNotices", js.Array(value :_*))
    
    @scala.inline
    def setDomainNotices(value: js.Array[String]): Self = this.set("domainNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNotices: Self = this.set("domainNotices", js.undefined)
    
    @scala.inline
    def setRegistration(value: Registration): Self = this.set("registration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistration: Self = this.set("registration", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
    
    @scala.inline
    def setYearlyPrice(value: Money): Self = this.set("yearlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearlyPrice: Self = this.set("yearlyPrice", js.undefined)
  }
}
