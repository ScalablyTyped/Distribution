package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectAltNames extends js.Object {
  
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
  implicit class SubjectAltNamesOps[Self <: SubjectAltNames] (val x: Self) extends AnyVal {
    
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
    def setCustomSansVarargs(value: X509Extension*): Self = this.set("customSans", js.Array(value :_*))
    
    @scala.inline
    def setCustomSans(value: js.Array[X509Extension]): Self = this.set("customSans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSans: Self = this.set("customSans", js.undefined)
    
    @scala.inline
    def setDnsNamesVarargs(value: String*): Self = this.set("dnsNames", js.Array(value :_*))
    
    @scala.inline
    def setDnsNames(value: js.Array[String]): Self = this.set("dnsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsNames: Self = this.set("dnsNames", js.undefined)
    
    @scala.inline
    def setEmailAddressesVarargs(value: String*): Self = this.set("emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddresses(value: js.Array[String]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: String*): Self = this.set("ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: js.Array[String]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddresses: Self = this.set("ipAddresses", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = this.set("uris", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = this.set("uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUris: Self = this.set("uris", js.undefined)
  }
}
