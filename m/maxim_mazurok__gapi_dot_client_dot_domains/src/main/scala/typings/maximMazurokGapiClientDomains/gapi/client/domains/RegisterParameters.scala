package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterParameters extends StObject {
  
  /**
    * Indicates whether the domain is available for registration. This value is accurate when obtained by calling `RetrieveRegisterParameters`, but is approximate when obtained by calling
    * `SearchDomains`.
    */
  var availability: js.UndefOr[String] = js.undefined
  
  /** The domain name. Unicode domain names are expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.undefined
  
  /** Notices about special properties of the domain. */
  var domainNotices: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Contact privacy options that the domain supports. */
  var supportedPrivacy: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Price to register or renew the domain for one year. */
  var yearlyPrice: js.UndefOr[Money] = js.undefined
}
object RegisterParameters {
  
  inline def apply(): RegisterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterParameters]
  }
  
  extension [Self <: RegisterParameters](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainNotices(value: js.Array[String]): Self = StObject.set(x, "domainNotices", value.asInstanceOf[js.Any])
    
    inline def setDomainNoticesUndefined: Self = StObject.set(x, "domainNotices", js.undefined)
    
    inline def setDomainNoticesVarargs(value: String*): Self = StObject.set(x, "domainNotices", js.Array(value :_*))
    
    inline def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    inline def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    inline def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value :_*))
    
    inline def setYearlyPrice(value: Money): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
