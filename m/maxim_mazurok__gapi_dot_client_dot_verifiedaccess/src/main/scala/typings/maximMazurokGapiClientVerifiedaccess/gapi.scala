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
        
        /** Challenge generated with the old signing key, the bytes representation of SignedData (this will only be present during key rotation). */
        var alternativeChallenge: js.UndefOr[String] = js.undefined
        
        /** Generated challenge, the bytes representation of SignedData. */
        var challenge: js.UndefOr[String] = js.undefined
      }
      object Challenge {
        
        inline def apply(): Challenge = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Challenge]
        }
        
        extension [Self <: Challenge](x: Self) {
          
          inline def setAlternativeChallenge(value: String): Self = StObject.set(x, "alternativeChallenge", value.asInstanceOf[js.Any])
          
          inline def setAlternativeChallengeUndefined: Self = StObject.set(x, "alternativeChallenge", js.undefined)
          
          inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
          
          inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        }
      }
      
      @js.native
      trait ChallengeResource extends StObject {
        
        /** Generates a new challenge. */
        def generate(request: Accesstoken): Request[Challenge] = js.native
        def generate(request: Alt, body: Empty): Request[Challenge] = js.native
        
        def verify(request: Alt, body: VerifyChallengeResponseRequest): Request[VerifyChallengeResponseResult] = js.native
        /** Verifies the challenge response. */
        def verify(request: Callback): Request[VerifyChallengeResponseResult] = js.native
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait VerifyChallengeResponseRequest extends StObject {
        
        /** Required. The generated response to the challenge, the bytes representation of SignedData. */
        var challengeResponse: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. Service can optionally provide identity information about the device or user associated with the key. For an EMK, this value is the enrolled domain. For an EUK, this value
          * is the user's email address. If present, this value will be checked against contents of the response, and verification will fail if there is no match.
          */
        var expectedIdentity: js.UndefOr[String] = js.undefined
      }
      object VerifyChallengeResponseRequest {
        
        inline def apply(): VerifyChallengeResponseRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[VerifyChallengeResponseRequest]
        }
        
        extension [Self <: VerifyChallengeResponseRequest](x: Self) {
          
          inline def setChallengeResponse(value: String): Self = StObject.set(x, "challengeResponse", value.asInstanceOf[js.Any])
          
          inline def setChallengeResponseUndefined: Self = StObject.set(x, "challengeResponse", js.undefined)
          
          inline def setExpectedIdentity(value: String): Self = StObject.set(x, "expectedIdentity", value.asInstanceOf[js.Any])
          
          inline def setExpectedIdentityUndefined: Self = StObject.set(x, "expectedIdentity", js.undefined)
        }
      }
      
      trait VerifyChallengeResponseResult extends StObject {
        
        /** Device permanent id is returned in this field (for the machine response only). */
        var devicePermanentId: js.UndefOr[String] = js.undefined
        
        /** Device signal in json string representation. */
        var deviceSignal: js.UndefOr[String] = js.undefined
        
        /** Device attested key trust level. */
        var keyTrustLevel: js.UndefOr[String] = js.undefined
        
        /**
          * Certificate Signing Request (in the SPKAC format, base64 encoded) is returned in this field. This field will be set only if device has included CSR in its challenge response. (the
          * option to include CSR is now available for both user and machine responses)
          */
        var signedPublicKeyAndChallenge: js.UndefOr[String] = js.undefined
      }
      object VerifyChallengeResponseResult {
        
        inline def apply(): VerifyChallengeResponseResult = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[VerifyChallengeResponseResult]
        }
        
        extension [Self <: VerifyChallengeResponseResult](x: Self) {
          
          inline def setDevicePermanentId(value: String): Self = StObject.set(x, "devicePermanentId", value.asInstanceOf[js.Any])
          
          inline def setDevicePermanentIdUndefined: Self = StObject.set(x, "devicePermanentId", js.undefined)
          
          inline def setDeviceSignal(value: String): Self = StObject.set(x, "deviceSignal", value.asInstanceOf[js.Any])
          
          inline def setDeviceSignalUndefined: Self = StObject.set(x, "deviceSignal", js.undefined)
          
          inline def setKeyTrustLevel(value: String): Self = StObject.set(x, "keyTrustLevel", value.asInstanceOf[js.Any])
          
          inline def setKeyTrustLevelUndefined: Self = StObject.set(x, "keyTrustLevel", js.undefined)
          
          inline def setSignedPublicKeyAndChallenge(value: String): Self = StObject.set(x, "signedPublicKeyAndChallenge", value.asInstanceOf[js.Any])
          
          inline def setSignedPublicKeyAndChallengeUndefined: Self = StObject.set(x, "signedPublicKeyAndChallenge", js.undefined)
        }
      }
    }
  }
}
