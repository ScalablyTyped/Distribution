package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadServiceAccountKeyRequest extends js.Object {
  
  /**
    * A field that allows clients to upload their own public key. If set, use this public key data to create a service account key for given service account. Please note, the expected
    * format for this field is X509_PEM.
    */
  var publicKeyData: js.UndefOr[String] = js.native
}
object UploadServiceAccountKeyRequest {
  
  @scala.inline
  def apply(): UploadServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadServiceAccountKeyRequest]
  }
  
  @scala.inline
  implicit class UploadServiceAccountKeyRequestOps[Self <: UploadServiceAccountKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setPublicKeyData(value: String): Self = this.set("publicKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyData: Self = this.set("publicKeyData", js.undefined)
  }
}
