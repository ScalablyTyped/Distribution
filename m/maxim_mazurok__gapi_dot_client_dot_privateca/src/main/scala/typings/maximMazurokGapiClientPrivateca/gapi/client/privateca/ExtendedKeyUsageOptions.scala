package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedKeyUsageOptions extends js.Object {
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS. */
  var clientAuth: js.UndefOr[Boolean] = js.native
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication". */
  var codeSigning: js.UndefOr[Boolean] = js.native
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection". */
  var emailProtection: js.UndefOr[Boolean] = js.native
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses". */
  var ocspSigning: js.UndefOr[Boolean] = js.native
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS. */
  var serverAuth: js.UndefOr[Boolean] = js.native
  
  /** Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time". */
  var timeStamping: js.UndefOr[Boolean] = js.native
}
object ExtendedKeyUsageOptions {
  
  @scala.inline
  def apply(): ExtendedKeyUsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedKeyUsageOptions]
  }
  
  @scala.inline
  implicit class ExtendedKeyUsageOptionsOps[Self <: ExtendedKeyUsageOptions] (val x: Self) extends AnyVal {
    
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
    def setClientAuth(value: Boolean): Self = this.set("clientAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAuth: Self = this.set("clientAuth", js.undefined)
    
    @scala.inline
    def setCodeSigning(value: Boolean): Self = this.set("codeSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSigning: Self = this.set("codeSigning", js.undefined)
    
    @scala.inline
    def setEmailProtection(value: Boolean): Self = this.set("emailProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailProtection: Self = this.set("emailProtection", js.undefined)
    
    @scala.inline
    def setOcspSigning(value: Boolean): Self = this.set("ocspSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcspSigning: Self = this.set("ocspSigning", js.undefined)
    
    @scala.inline
    def setServerAuth(value: Boolean): Self = this.set("serverAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerAuth: Self = this.set("serverAuth", js.undefined)
    
    @scala.inline
    def setTimeStamping(value: Boolean): Self = this.set("timeStamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStamping: Self = this.set("timeStamping", js.undefined)
  }
}
