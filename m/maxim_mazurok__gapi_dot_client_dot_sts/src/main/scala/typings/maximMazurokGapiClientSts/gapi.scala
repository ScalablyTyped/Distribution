package typings.maximMazurokGapiClientSts

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSts.anon.Accesstoken
import typings.maximMazurokGapiClientSts.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object sts {
      
      @js.native
      trait GoogleIdentityStsV1ExchangeTokenRequest extends StObject {
        
        /** Required. The grant type. Must be `urn:ietf:params:oauth:grant-type:token-exchange`, which indicates a token exchange. */
        var grantType: js.UndefOr[String] = js.native
        
        /** A set of features that Security Token Service supports, in addition to the standard OAuth 2.0 token exchange, formatted as a serialized JSON object of Options. */
        var options: js.UndefOr[String] = js.native
        
        /** Required. An identifier for the type of requested security token. Must be `urn:ietf:params:oauth:token-type:access_token`. */
        var requestedTokenType: js.UndefOr[String] = js.native
        
        /**
          * Required. The input token. You can use a Google-issued OAuth 2.0 access token with this field to obtain an access token with new security attributes applied, such as a Credential
          * Access Boundary. If an access token already contains security attributes, you cannot apply additional security attributes.
          */
        var subjectToken: js.UndefOr[String] = js.native
        
        /** Required. An identifier that indicates the type of the security token in the `subject_token` parameter. Must be `urn:ietf:params:oauth:token-type:access_token`. */
        var subjectTokenType: js.UndefOr[String] = js.native
      }
      object GoogleIdentityStsV1ExchangeTokenRequest {
        
        @scala.inline
        def apply(): GoogleIdentityStsV1ExchangeTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1ExchangeTokenRequest]
        }
        
        @scala.inline
        implicit class GoogleIdentityStsV1ExchangeTokenRequestMutableBuilder[Self <: GoogleIdentityStsV1ExchangeTokenRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGrantType(value: String): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGrantTypeUndefined: Self = StObject.set(x, "grantType", js.undefined)
          
          @scala.inline
          def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
          
          @scala.inline
          def setRequestedTokenType(value: String): Self = StObject.set(x, "requestedTokenType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRequestedTokenTypeUndefined: Self = StObject.set(x, "requestedTokenType", js.undefined)
          
          @scala.inline
          def setSubjectToken(value: String): Self = StObject.set(x, "subjectToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubjectTokenType(value: String): Self = StObject.set(x, "subjectTokenType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubjectTokenTypeUndefined: Self = StObject.set(x, "subjectTokenType", js.undefined)
          
          @scala.inline
          def setSubjectTokenUndefined: Self = StObject.set(x, "subjectToken", js.undefined)
        }
      }
      
      @js.native
      trait GoogleIdentityStsV1ExchangeTokenResponse extends StObject {
        
        /** An OAuth 2.0 security token, issued by Google, in response to the token exchange request. */
        var access_token: js.UndefOr[String] = js.native
        
        /**
          * The amount of time, in seconds, between the time when the `access_token` was issued and the time when the `access_token` will expire. This field is absent when the `subject_token`
          * in the request is a Google-issued, short-lived access token. In this case, the `access_token` has the same expiration time as the `subject_token`.
          */
        var expires_in: js.UndefOr[Double] = js.native
        
        /** The token type. Always matches the value of `requested_token_type` from the request. */
        var issued_token_type: js.UndefOr[String] = js.native
        
        /** The type of `access_token`. Always has the value `Bearer`. */
        var token_type: js.UndefOr[String] = js.native
      }
      object GoogleIdentityStsV1ExchangeTokenResponse {
        
        @scala.inline
        def apply(): GoogleIdentityStsV1ExchangeTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1ExchangeTokenResponse]
        }
        
        @scala.inline
        implicit class GoogleIdentityStsV1ExchangeTokenResponseMutableBuilder[Self <: GoogleIdentityStsV1ExchangeTokenResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
          
          @scala.inline
          def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
          
          @scala.inline
          def setIssued_token_type(value: String): Self = StObject.set(x, "issued_token_type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIssued_token_typeUndefined: Self = StObject.set(x, "issued_token_type", js.undefined)
          
          @scala.inline
          def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
        }
      }
      
      @js.native
      trait V1Resource extends StObject {
        
        /** Exchanges a credential for a Google OAuth 2.0 access token. */
        def token(request: Accesstoken): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
        def token(request: Alt, body: GoogleIdentityStsV1ExchangeTokenRequest): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
      }
    }
  }
}
