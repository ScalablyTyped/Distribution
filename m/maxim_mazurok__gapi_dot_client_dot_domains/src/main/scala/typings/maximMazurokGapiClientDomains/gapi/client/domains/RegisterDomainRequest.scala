package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDomainRequest extends StObject {
  
  /** The list of contact notices that the caller acknowledges. The notices required here depend on the values specified in `registration.contact_settings`. */
  var contactNotices: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of domain notices that you acknowledge. Call `RetrieveRegisterParameters` to see the notices that need acknowledgement. */
  var domainNotices: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The complete `Registration` resource to be created. */
  var registration: js.UndefOr[Registration] = js.undefined
  
  /** When true, only validation will be performed, without actually registering the domain. Follows: https://cloud.google.com/apis/design/design_patterns#request_validation */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Yearly price to register or renew the domain. The value that should be put here can be obtained from RetrieveRegisterParameters or SearchDomains calls. */
  var yearlyPrice: js.UndefOr[Money] = js.undefined
}
object RegisterDomainRequest {
  
  @scala.inline
  def apply(): RegisterDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDomainRequest]
  }
  
  @scala.inline
  implicit class RegisterDomainRequestMutableBuilder[Self <: RegisterDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactNotices(value: js.Array[String]): Self = StObject.set(x, "contactNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNoticesUndefined: Self = StObject.set(x, "contactNotices", js.undefined)
    
    @scala.inline
    def setContactNoticesVarargs(value: String*): Self = StObject.set(x, "contactNotices", js.Array(value :_*))
    
    @scala.inline
    def setDomainNotices(value: js.Array[String]): Self = StObject.set(x, "domainNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNoticesUndefined: Self = StObject.set(x, "domainNotices", js.undefined)
    
    @scala.inline
    def setDomainNoticesVarargs(value: String*): Self = StObject.set(x, "domainNotices", js.Array(value :_*))
    
    @scala.inline
    def setRegistration(value: Registration): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    
    @scala.inline
    def setYearlyPrice(value: Money): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
