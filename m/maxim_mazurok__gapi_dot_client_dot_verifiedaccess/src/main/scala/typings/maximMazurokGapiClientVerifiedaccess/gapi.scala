package typings.maximMazurokGapiClientVerifiedaccess

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVerifiedaccess.anon.Accesstoken
import typings.maximMazurokGapiClientVerifiedaccess.anon.Alt
import typings.maximMazurokGapiClientVerifiedaccess.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object verifiedaccess {
      
      @js.native
      trait Challenge extends StObject {
        
        /** Challenge generated with the old signing key (this will only be present during key rotation) */
        var alternativeChallenge: js.UndefOr[SignedData] = js.native
        
        /** Generated challenge */
        var challenge: js.UndefOr[SignedData] = js.native
      }
      object Challenge {
        
        @scala.inline
        def apply(): Challenge = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Challenge]
        }
        
        @scala.inline
        implicit class ChallengeMutableBuilder[Self <: Challenge] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlternativeChallenge(value: SignedData): Self = StObject.set(x, "alternativeChallenge", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAlternativeChallengeUndefined: Self = StObject.set(x, "alternativeChallenge", js.undefined)
          
          @scala.inline
          def setChallenge(value: SignedData): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        }
      }
      
      @js.native
      trait ChallengeResource extends StObject {
        
        /** CreateChallenge API */
        def create(request: Accesstoken): Request[Challenge] = js.native
        def create(request: Alt, body: Empty): Request[Challenge] = js.native
        
        def verify(request: Alt, body: VerifyChallengeResponseRequest): Request[VerifyChallengeResponseResult] = js.native
        /** VerifyChallengeResponse API */
        def verify(request: Callback): Request[VerifyChallengeResponseResult] = js.native
      }
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait Empty extends StObject
      
      @js.native
      trait SignedData extends StObject {
        
        /** The data to be signed. */
        var data: js.UndefOr[String] = js.native
        
        /** The signature of the data field. */
        var signature: js.UndefOr[String] = js.native
      }
      object SignedData {
        
        @scala.inline
        def apply(): SignedData = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignedData]
        }
        
        @scala.inline
        implicit class SignedDataMutableBuilder[Self <: SignedData] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          @scala.inline
          def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
        }
      }
      
      @js.native
      trait VerifyChallengeResponseRequest extends StObject {
        
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
        implicit class VerifyChallengeResponseRequestMutableBuilder[Self <: VerifyChallengeResponseRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChallengeResponse(value: SignedData): Self = StObject.set(x, "challengeResponse", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChallengeResponseUndefined: Self = StObject.set(x, "challengeResponse", js.undefined)
          
          @scala.inline
          def setExpectedIdentity(value: String): Self = StObject.set(x, "expectedIdentity", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpectedIdentityUndefined: Self = StObject.set(x, "expectedIdentity", js.undefined)
        }
      }
      
      @js.native
      trait VerifyChallengeResponseResult extends StObject {
        
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
        implicit class VerifyChallengeResponseResultMutableBuilder[Self <: VerifyChallengeResponseResult] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDeviceEnrollmentId(value: String): Self = StObject.set(x, "deviceEnrollmentId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeviceEnrollmentIdUndefined: Self = StObject.set(x, "deviceEnrollmentId", js.undefined)
          
          @scala.inline
          def setDevicePermanentId(value: String): Self = StObject.set(x, "devicePermanentId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDevicePermanentIdUndefined: Self = StObject.set(x, "devicePermanentId", js.undefined)
          
          @scala.inline
          def setSignedPublicKeyAndChallenge(value: String): Self = StObject.set(x, "signedPublicKeyAndChallenge", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSignedPublicKeyAndChallengeUndefined: Self = StObject.set(x, "signedPublicKeyAndChallenge", js.undefined)
          
          @scala.inline
          def setVerificationOutput(value: String): Self = StObject.set(x, "verificationOutput", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVerificationOutputUndefined: Self = StObject.set(x, "verificationOutput", js.undefined)
        }
      }
    }
  }
}
