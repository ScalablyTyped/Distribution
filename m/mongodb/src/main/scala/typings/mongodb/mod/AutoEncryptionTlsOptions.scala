package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoEncryptionTlsOptions extends StObject {
  
  /**
    * Specifies the location of a local .pem file that contains the
    * root certificate chain from the Certificate Authority.
    * This file is used to validate the certificate presented by the
    * KMS provider.
    */
  var tlsCAFile: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the location of a local .pem file that contains
    * either the client's TLS/SSL certificate and key or only the
    * client's TLS/SSL key when tlsCertificateFile is used to
    * provide the certificate.
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the password to de-crypt the tlsCertificateKeyFile.
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.undefined
}
object AutoEncryptionTlsOptions {
  
  inline def apply(): AutoEncryptionTlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoEncryptionTlsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoEncryptionTlsOptions] (val x: Self) extends AnyVal {
    
    inline def setTlsCAFile(value: String): Self = StObject.set(x, "tlsCAFile", value.asInstanceOf[js.Any])
    
    inline def setTlsCAFileUndefined: Self = StObject.set(x, "tlsCAFile", js.undefined)
    
    inline def setTlsCertificateKeyFile(value: String): Self = StObject.set(x, "tlsCertificateKeyFile", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificateKeyFilePassword(value: String): Self = StObject.set(x, "tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificateKeyFilePasswordUndefined: Self = StObject.set(x, "tlsCertificateKeyFilePassword", js.undefined)
    
    inline def setTlsCertificateKeyFileUndefined: Self = StObject.set(x, "tlsCertificateKeyFile", js.undefined)
  }
}
