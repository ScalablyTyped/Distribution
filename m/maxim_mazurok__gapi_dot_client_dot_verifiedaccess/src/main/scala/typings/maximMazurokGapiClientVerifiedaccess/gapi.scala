package typings.maximMazurokGapiClientVerifiedaccess

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVerifiedaccess.anon.Accesstoken
import typings.maximMazurokGapiClientVerifiedaccess.anon.Alt
import typings.maximMazurokGapiClientVerifiedaccess.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object verifiedaccess {
      
      trait Challenge extends StObject {
        
        /** Challenge generated with the old signing key (this will only be present during key rotation) */
        var alternativeChallenge: js.UndefOr[SignedData] = js.undefined
        
        /** Generated challenge */
        var challenge: js.UndefOr[SignedData] = js.undefined
      }
      object Challenge {
        
        inline def apply(): Challenge = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Challenge]
        }
        
        extension [Self <: Challenge](x: Self) {
          
          inline def setAlternativeChallenge(value: SignedData): Self = StObject.set(x, "alternativeChallenge", value.asInstanceOf[js.Any])
          
          inline def setAlternativeChallengeUndefined: Self = StObject.set(x, "alternativeChallenge", js.undefined)
          
          inline def setChallenge(value: SignedData): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
          
          inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
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
      trait Empty extends StObject
      
      trait SignedData extends StObject {
        
        /** The data to be signed. */
        var data: js.UndefOr[String] = js.undefined
        
        /** The signature of the data field. */
        var signature: js.UndefOr[String] = js.undefined
      }
      object SignedData {
        
        inline def apply(): SignedData = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignedData]
        }
        
        extension [Self <: SignedData](x: Self) {
          
          inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
          
          inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
        }
      }
      
      trait VerifyChallengeResponseRequest extends StObject {
        
        /** The generated response to the challenge */
        var challengeResponse: js.UndefOr[SignedData] = js.undefined
        
        /**
          * Service can optionally provide identity information about the device or user associated with the key. For an EMK, this value is the enrolled domain. For an EUK, this value is the
          * user's email address. If present, this value will be checked against contents of the response, and verification will fail if there is no match.
          */
        var expectedIdentity: js.UndefOr[String] = js.undefined
      }
      object VerifyChallengeResponseRequest {
        
        inline def apply(): VerifyChallengeResponseRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[VerifyChallengeResponseRequest]
        }
        
        extension [Self <: VerifyChallengeResponseRequest](x: Self) {
          
          inline def setChallengeResponse(value: SignedData): Self = StObject.set(x, "challengeResponse", value.asInstanceOf[js.Any])
          
          inline def setChallengeResponseUndefined: Self = StObject.set(x, "challengeResponse", js.undefined)
          
          inline def setExpectedIdentity(value: String): Self = StObject.set(x, "expectedIdentity", value.asInstanceOf[js.Any])
          
          inline def setExpectedIdentityUndefined: Self = StObject.set(x, "expectedIdentity", js.undefined)
        }
      }
      
      trait VerifyChallengeResponseResult extends StObject {
        
        /** Device enrollment id is returned in this field (for the machine response only). */
        var deviceEnrollmentId: js.UndefOr[String] = js.undefined
        
        /** Device permanent id is returned in this field (for the machine response only). */
        var devicePermanentId: js.UndefOr[String] = js.undefined
        
        /**
          * Certificate Signing Request (in the SPKAC format, base64 encoded) is returned in this field. This field will be set only if device has included CSR in its challenge response. (the
          * option to include CSR is now available for both user and machine responses)
          */
        var signedPublicKeyAndChallenge: js.UndefOr[String] = js.undefined
        
        /**
          * For EMCert check, device permanent id is returned here. For EUCert check, signed_public_key_and_challenge [base64 encoded] is returned if present, otherwise empty string is
          * returned. This field is deprecated, please use device_permanent_id or signed_public_key_and_challenge fields.
          */
        var verificationOutput: js.UndefOr[String] = js.undefined
      }
      object VerifyChallengeResponseResult {
        
        inline def apply(): VerifyChallengeResponseResult = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[VerifyChallengeResponseResult]
        }
        
        extension [Self <: VerifyChallengeResponseResult](x: Self) {
          
          inline def setDeviceEnrollmentId(value: String): Self = StObject.set(x, "deviceEnrollmentId", value.asInstanceOf[js.Any])
          
          inline def setDeviceEnrollmentIdUndefined: Self = StObject.set(x, "deviceEnrollmentId", js.undefined)
          
          inline def setDevicePermanentId(value: String): Self = StObject.set(x, "devicePermanentId", value.asInstanceOf[js.Any])
          
          inline def setDevicePermanentIdUndefined: Self = StObject.set(x, "devicePermanentId", js.undefined)
          
          inline def setSignedPublicKeyAndChallenge(value: String): Self = StObject.set(x, "signedPublicKeyAndChallenge", value.asInstanceOf[js.Any])
          
          inline def setSignedPublicKeyAndChallengeUndefined: Self = StObject.set(x, "signedPublicKeyAndChallenge", js.undefined)
          
          inline def setVerificationOutput(value: String): Self = StObject.set(x, "verificationOutput", value.asInstanceOf[js.Any])
          
          inline def setVerificationOutputUndefined: Self = StObject.set(x, "verificationOutput", js.undefined)
        }
      }
    }
  }
}
