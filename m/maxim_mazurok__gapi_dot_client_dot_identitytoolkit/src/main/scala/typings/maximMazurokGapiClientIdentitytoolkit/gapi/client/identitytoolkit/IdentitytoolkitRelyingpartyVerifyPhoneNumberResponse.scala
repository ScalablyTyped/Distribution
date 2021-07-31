package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends StObject {
  
  var expiresIn: js.UndefOr[String] = js.undefined
  
  var idToken: js.UndefOr[String] = js.undefined
  
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  
  var localId: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var temporaryProof: js.UndefOr[String] = js.undefined
  
  var temporaryProofExpiresIn: js.UndefOr[String] = js.undefined
  
  var verificationProof: js.UndefOr[String] = js.undefined
  
  var verificationProofExpiresIn: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyPhoneNumberResponseMutableBuilder[Self <: IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryProofExpiresIn(value: String): Self = StObject.set(x, "temporaryProofExpiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryProofExpiresInUndefined: Self = StObject.set(x, "temporaryProofExpiresIn", js.undefined)
    
    @scala.inline
    def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    
    @scala.inline
    def setVerificationProof(value: String): Self = StObject.set(x, "verificationProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationProofExpiresIn(value: String): Self = StObject.set(x, "verificationProofExpiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationProofExpiresInUndefined: Self = StObject.set(x, "verificationProofExpiresIn", js.undefined)
    
    @scala.inline
    def setVerificationProofUndefined: Self = StObject.set(x, "verificationProof", js.undefined)
  }
}
