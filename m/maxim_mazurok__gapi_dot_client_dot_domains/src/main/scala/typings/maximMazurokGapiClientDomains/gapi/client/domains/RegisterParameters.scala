package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterParameters extends StObject {
  
  /**
    * Indicates whether the domain is available for registration. This value is accurate when obtained by calling `RetrieveRegisterParameters`, but is approximate when obtained by calling
    * `SearchDomains`.
    */
  var availability: js.UndefOr[String] = js.native
  
  /** The domain name. Unicode domain names are expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.native
  
  /** Notices about special properties of the domain. */
  var domainNotices: js.UndefOr[js.Array[String]] = js.native
  
  /** Contact privacy options that the domain supports. */
  var supportedPrivacy: js.UndefOr[js.Array[String]] = js.native
  
  /** Price to register or renew the domain for one year. */
  var yearlyPrice: js.UndefOr[Money] = js.native
}
object RegisterParameters {
  
  @scala.inline
  def apply(): RegisterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterParameters]
  }
  
  @scala.inline
  implicit class RegisterParametersMutableBuilder[Self <: RegisterParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setDomainNotices(value: js.Array[String]): Self = StObject.set(x, "domainNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNoticesUndefined: Self = StObject.set(x, "domainNotices", js.undefined)
    
    @scala.inline
    def setDomainNoticesVarargs(value: String*): Self = StObject.set(x, "domainNotices", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    @scala.inline
    def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value :_*))
    
    @scala.inline
    def setYearlyPrice(value: Money): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
