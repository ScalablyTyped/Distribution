package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadServiceAccountKeyRequest extends StObject {
  
  /**
    * The public key to associate with the service account. Must be an RSA public key that is wrapped in an X.509 v3 certificate. Include the first line, `-----BEGIN CERTIFICATE-----`,
    * and the last line, `-----END CERTIFICATE-----`.
    */
  var publicKeyData: js.UndefOr[String] = js.undefined
}
object UploadServiceAccountKeyRequest {
  
  inline def apply(): UploadServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadServiceAccountKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadServiceAccountKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setPublicKeyData(value: String): Self = StObject.set(x, "publicKeyData", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyDataUndefined: Self = StObject.set(x, "publicKeyData", js.undefined)
  }
}
