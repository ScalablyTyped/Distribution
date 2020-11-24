package typings.maximMazurokGapiClientIamcredentials.gapi.client.iamcredentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignBlobResponse extends js.Object {
  
  /**
    * The ID of the key used to sign the blob. The key used for signing will remain valid for at least 12 hours after the blob is signed. To verify the signature, you can retrieve the
    * public key in several formats from the following endpoints: - RSA public key wrapped in an X.509 v3 certificate:
    * `https://www.googleapis.com/service_accounts/v1/metadata/x509/{ACCOUNT_EMAIL}` - Raw key in JSON format:
    * `https://www.googleapis.com/service_accounts/v1/metadata/raw/{ACCOUNT_EMAIL}` - JSON Web Key (JWK): `https://www.googleapis.com/service_accounts/v1/metadata/jwk/{ACCOUNT_EMAIL}`
    */
  var keyId: js.UndefOr[String] = js.native
  
  /**
    * The signature for the blob. Does not include the original blob. After the key pair referenced by the `key_id` response field expires, Google no longer exposes the public key that
    * can be used to verify the blob. As a result, the receiver can no longer verify the signature.
    */
  var signedBlob: js.UndefOr[String] = js.native
}
object SignBlobResponse {
  
  @scala.inline
  def apply(): SignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignBlobResponse]
  }
  
  @scala.inline
  implicit class SignBlobResponseOps[Self <: SignBlobResponse] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setSignedBlob(value: String): Self = this.set("signedBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedBlob: Self = this.set("signedBlob", js.undefined)
  }
}
