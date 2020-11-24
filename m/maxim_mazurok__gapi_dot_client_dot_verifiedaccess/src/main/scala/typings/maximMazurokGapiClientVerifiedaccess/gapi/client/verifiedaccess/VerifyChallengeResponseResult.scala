package typings.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyChallengeResponseResult extends js.Object {
  
  /** Device enrollment id is returned in this field (for the machine response only). */
  var deviceEnrollmentId: js.UndefOr[String] = js.native
  
  /** Device permanent id is returned in this field (for the machine response only). */
  var devicePermanentId: js.UndefOr[String] = js.native
  
  /**
    * Certificate Signing Request (in the SPKAC format, base64 encoded) is returned in this field. This field will be set only if device has included CSR in its challenge response. (the
    * option to include CSR is now available for both user and machine responses)
    */
  var signedPublicKeyAndChallenge: js.UndefOr[String] = js.native
  
  /**
    * For EMCert check, device permanent id is returned here. For EUCert check, signed_public_key_and_challenge [base64 encoded] is returned if present, otherwise empty string is
    * returned. This field is deprecated, please use device_permanent_id or signed_public_key_and_challenge fields.
    */
  var verificationOutput: js.UndefOr[String] = js.native
}
object VerifyChallengeResponseResult {
  
  @scala.inline
  def apply(): VerifyChallengeResponseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyChallengeResponseResult]
  }
  
  @scala.inline
  implicit class VerifyChallengeResponseResultOps[Self <: VerifyChallengeResponseResult] (val x: Self) extends AnyVal {
    
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
    def setDeviceEnrollmentId(value: String): Self = this.set("deviceEnrollmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceEnrollmentId: Self = this.set("deviceEnrollmentId", js.undefined)
    
    @scala.inline
    def setDevicePermanentId(value: String): Self = this.set("devicePermanentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePermanentId: Self = this.set("devicePermanentId", js.undefined)
    
    @scala.inline
    def setSignedPublicKeyAndChallenge(value: String): Self = this.set("signedPublicKeyAndChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedPublicKeyAndChallenge: Self = this.set("signedPublicKeyAndChallenge", js.undefined)
    
    @scala.inline
    def setVerificationOutput(value: String): Self = this.set("verificationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationOutput: Self = this.set("verificationOutput", js.undefined)
  }
}
