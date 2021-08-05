package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSOptions extends StObject {
  
  /**
    * Enable TLS connections
    * @default false
    */
  var tls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
    */
  var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
    * and the hostname specified by the TLS certificate
    */
  var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * path to file with either a single or bundle of certificate authorities
    * to be considered trusted when making a TLS connection
    */
  var tlsCAFile: js.UndefOr[String] = js.undefined
  
  /**
    * path to the client certificate file or the client private key file;
    * in the case that they both are needed, the files should be concatenated
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.undefined
  
  /**
    * The password to decrypt the client private key to be used for TLS connections
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.undefined
  
  /**
    * Relax TLS constraints, disabling validation
    * @default false
    */
  var tlsInsecure: js.UndefOr[Boolean] = js.undefined
}
object TLSOptions {
  
  inline def apply(): TLSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSOptions]
  }
  
  extension [Self <: TLSOptions](x: Self) {
    
    inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsAllowInvalidCertificates(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidCertificates", value.asInstanceOf[js.Any])
    
    inline def setTlsAllowInvalidCertificatesUndefined: Self = StObject.set(x, "tlsAllowInvalidCertificates", js.undefined)
    
    inline def setTlsAllowInvalidHostnames(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidHostnames", value.asInstanceOf[js.Any])
    
    inline def setTlsAllowInvalidHostnamesUndefined: Self = StObject.set(x, "tlsAllowInvalidHostnames", js.undefined)
    
    inline def setTlsCAFile(value: String): Self = StObject.set(x, "tlsCAFile", value.asInstanceOf[js.Any])
    
    inline def setTlsCAFileUndefined: Self = StObject.set(x, "tlsCAFile", js.undefined)
    
    inline def setTlsCertificateKeyFile(value: String): Self = StObject.set(x, "tlsCertificateKeyFile", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificateKeyFilePassword(value: String): Self = StObject.set(x, "tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificateKeyFilePasswordUndefined: Self = StObject.set(x, "tlsCertificateKeyFilePassword", js.undefined)
    
    inline def setTlsCertificateKeyFileUndefined: Self = StObject.set(x, "tlsCertificateKeyFile", js.undefined)
    
    inline def setTlsInsecure(value: Boolean): Self = StObject.set(x, "tlsInsecure", value.asInstanceOf[js.Any])
    
    inline def setTlsInsecureUndefined: Self = StObject.set(x, "tlsInsecure", js.undefined)
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
