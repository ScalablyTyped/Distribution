package typings.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyChallengeResponseRequest extends js.Object {
  
  /** The generated response to the challenge */
  var challengeResponse: js.UndefOr[SignedData] = js.native
  
  /**
    * Service can optionally provide identity information about the device or user associated with the key. For an EMK, this value is the enrolled domain. For an EUK, this value is the
    * user's email address. If present, this value will be checked against contents of the response, and verification will fail if there is no match.
    */
  var expectedIdentity: js.UndefOr[String] = js.native
}
object VerifyChallengeResponseRequest {
  
  @scala.inline
  def apply(): VerifyChallengeResponseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyChallengeResponseRequest]
  }
  
  @scala.inline
  implicit class VerifyChallengeResponseRequestOps[Self <: VerifyChallengeResponseRequest] (val x: Self) extends AnyVal {
    
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
    def setChallengeResponse(value: SignedData): Self = this.set("challengeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeResponse: Self = this.set("challengeResponse", js.undefined)
    
    @scala.inline
    def setExpectedIdentity(value: String): Self = this.set("expectedIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedIdentity: Self = this.set("expectedIdentity", js.undefined)
  }
}
