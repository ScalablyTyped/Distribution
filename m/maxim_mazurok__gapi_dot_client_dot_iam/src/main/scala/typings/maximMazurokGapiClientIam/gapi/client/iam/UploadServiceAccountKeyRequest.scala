package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadServiceAccountKeyRequest extends StObject {
  
  /**
    * A field that allows clients to upload their own public key. If set, use this public key data to create a service account key for given service account. Please note, the expected
    * format for this field is X509_PEM.
    */
  var publicKeyData: js.UndefOr[String] = js.undefined
}
object UploadServiceAccountKeyRequest {
  
  @scala.inline
  def apply(): UploadServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadServiceAccountKeyRequest]
  }
  
  @scala.inline
  implicit class UploadServiceAccountKeyRequestMutableBuilder[Self <: UploadServiceAccountKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeyData(value: String): Self = StObject.set(x, "publicKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyDataUndefined: Self = StObject.set(x, "publicKeyData", js.undefined)
  }
}
