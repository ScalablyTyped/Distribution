package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertDetail extends StObject {
  
  /** The public information about the cert. */
  var certInfo: js.UndefOr[SslCert] = js.undefined
  
  /** The private key for the client cert, in pem format. Keep private in order to protect your security. */
  var certPrivateKey: js.UndefOr[String] = js.undefined
}
object SslCertDetail {
  
  inline def apply(): SslCertDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SslCertDetail] (val x: Self) extends AnyVal {
    
    inline def setCertInfo(value: SslCert): Self = StObject.set(x, "certInfo", value.asInstanceOf[js.Any])
    
    inline def setCertInfoUndefined: Self = StObject.set(x, "certInfo", js.undefined)
    
    inline def setCertPrivateKey(value: String): Self = StObject.set(x, "certPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setCertPrivateKeyUndefined: Self = StObject.set(x, "certPrivateKey", js.undefined)
  }
}
