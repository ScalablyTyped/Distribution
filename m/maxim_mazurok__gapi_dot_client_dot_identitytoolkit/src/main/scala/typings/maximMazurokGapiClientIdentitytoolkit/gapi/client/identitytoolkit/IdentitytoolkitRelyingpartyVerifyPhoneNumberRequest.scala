package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var idToken: js.UndefOr[String] = js.undefined
  
  var operation: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /** The session info previously returned by IdentityToolkit-SendVerificationCode. */
  var sessionInfo: js.UndefOr[String] = js.undefined
  
  var temporaryProof: js.UndefOr[String] = js.undefined
  
  var verificationProof: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyPhoneNumberRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    @scala.inline
    def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    
    @scala.inline
    def setVerificationProof(value: String): Self = StObject.set(x, "verificationProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationProofUndefined: Self = StObject.set(x, "verificationProof", js.undefined)
  }
}
