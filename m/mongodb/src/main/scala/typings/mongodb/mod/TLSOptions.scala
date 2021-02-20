package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSOptions extends StObject {
  
  /**
    * Enable TLS connections
    * @default false
    */
  var tls: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
    */
  var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
    * and the hostname specified by the TLS certificate
    */
  var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.native
  
  /**
    * path to file with either a single or bundle of certificate authorities
    * to be considered trusted when making a TLS connection
    */
  var tlsCAFile: js.UndefOr[String] = js.native
  
  /**
    * path to the client certificate file or the client private key file;
    * in the case that they both are needed, the files should be concatenated
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.native
  
  /**
    * The password to decrypt the client private key to be used for TLS connections
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.native
  
  /**
    * Relax TLS constraints, disabling validation
    * @default false
    */
  var tlsInsecure: js.UndefOr[Boolean] = js.native
}
object TLSOptions {
  
  @scala.inline
  def apply(): TLSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSOptions]
  }
  
  @scala.inline
  implicit class TLSOptionsMutableBuilder[Self <: TLSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsAllowInvalidCertificates(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsAllowInvalidCertificatesUndefined: Self = StObject.set(x, "tlsAllowInvalidCertificates", js.undefined)
    
    @scala.inline
    def setTlsAllowInvalidHostnames(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsAllowInvalidHostnamesUndefined: Self = StObject.set(x, "tlsAllowInvalidHostnames", js.undefined)
    
    @scala.inline
    def setTlsCAFile(value: String): Self = StObject.set(x, "tlsCAFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCAFileUndefined: Self = StObject.set(x, "tlsCAFile", js.undefined)
    
    @scala.inline
    def setTlsCertificateKeyFile(value: String): Self = StObject.set(x, "tlsCertificateKeyFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCertificateKeyFilePassword(value: String): Self = StObject.set(x, "tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCertificateKeyFilePasswordUndefined: Self = StObject.set(x, "tlsCertificateKeyFilePassword", js.undefined)
    
    @scala.inline
    def setTlsCertificateKeyFileUndefined: Self = StObject.set(x, "tlsCertificateKeyFile", js.undefined)
    
    @scala.inline
    def setTlsInsecure(value: Boolean): Self = StObject.set(x, "tlsInsecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsInsecureUndefined: Self = StObject.set(x, "tlsInsecure", js.undefined)
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
