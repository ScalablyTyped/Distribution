package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferDomainRequest extends StObject {
  
  /** The domain's transfer authorization code. You can obtain this from the domain's current registrar. */
  var authorizationCode: js.UndefOr[AuthorizationCode] = js.undefined
  
  /** The list of contact notices that you acknowledge. The notices needed here depend on the values specified in `registration.contact_settings`. */
  var contactNotices: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The complete `Registration` resource to be created. You can leave `registration.dns_settings` unset to import the domain's current DNS configuration from its current
    * registrar. Use this option only if you are sure that the domain's current DNS service does not cease upon transfer, as is often the case for DNS services provided for free by the
    * registrar.
    */
  var registration: js.UndefOr[Registration] = js.undefined
  
  /** Validate the request without actually transferring the domain. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Acknowledgement of the price to transfer or renew the domain for one year. Call `RetrieveTransferParameters` to obtain the price, which you must acknowledge. */
  var yearlyPrice: js.UndefOr[Money] = js.undefined
}
object TransferDomainRequest {
  
  inline def apply(): TransferDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferDomainRequest]
  }
  
  extension [Self <: TransferDomainRequest](x: Self) {
    
    inline def setAuthorizationCode(value: AuthorizationCode): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    inline def setContactNotices(value: js.Array[String]): Self = StObject.set(x, "contactNotices", value.asInstanceOf[js.Any])
    
    inline def setContactNoticesUndefined: Self = StObject.set(x, "contactNotices", js.undefined)
    
    inline def setContactNoticesVarargs(value: String*): Self = StObject.set(x, "contactNotices", js.Array(value*))
    
    inline def setRegistration(value: Registration): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    
    inline def setYearlyPrice(value: Money): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
