package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectAltNames extends StObject {
  
  /** Contains additional subject alternative name values. */
  var customSans: js.UndefOr[js.Array[X509Extension]] = js.native
  
  /** Contains only valid, fully-qualified host names. */
  var dnsNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Contains only valid RFC 2822 E-mail addresses. */
  var emailAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /** Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses. */
  var ipAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /** Contains only valid RFC 3986 URIs. */
  var uris: js.UndefOr[js.Array[String]] = js.native
}
object SubjectAltNames {
  
  @scala.inline
  def apply(): SubjectAltNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectAltNames]
  }
  
  @scala.inline
  implicit class SubjectAltNamesMutableBuilder[Self <: SubjectAltNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSans(value: js.Array[X509Extension]): Self = StObject.set(x, "customSans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSansUndefined: Self = StObject.set(x, "customSans", js.undefined)
    
    @scala.inline
    def setCustomSansVarargs(value: X509Extension*): Self = StObject.set(x, "customSans", js.Array(value :_*))
    
    @scala.inline
    def setDnsNames(value: js.Array[String]): Self = StObject.set(x, "dnsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNamesUndefined: Self = StObject.set(x, "dnsNames", js.undefined)
    
    @scala.inline
    def setDnsNamesVarargs(value: String*): Self = StObject.set(x, "dnsNames", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    @scala.inline
    def setEmailAddressesVarargs(value: String*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value :_*))
  }
}
