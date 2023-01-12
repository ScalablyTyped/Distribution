package typings.maximMazurokGapiClientIamcredentials

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIamcredentials.anon.Accesstoken
import typings.maximMazurokGapiClientIamcredentials.anon.Alt
import typings.maximMazurokGapiClientIamcredentials.anon.Callback
import typings.maximMazurokGapiClientIamcredentials.anon.Fields
import typings.maximMazurokGapiClientIamcredentials.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object iamcredentials {
      
      trait GenerateAccessTokenRequest extends StObject {
        
        /**
          * The sequence of service accounts in a delegation chain. This field is required for [delegated requests](https://cloud.google.com/iam/help/credentials/delegated-request). For [direct
          * requests](https://cloud.google.com/iam/help/credentials/direct-request), which are more common, do not specify this field. Each service account must be granted the
          * `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The last service account in the chain must be granted the
          * `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the request. The delegates must have the following format:
          * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * The desired lifetime duration of the access token in seconds. By default, the maximum allowed value is 1 hour. To set a lifetime of up to 12 hours, you can add the service account
          * as an allowed value in an Organization Policy that enforces the `constraints/iam.allowServiceAccountCredentialLifetimeExtension` constraint. See detailed instructions at
          * https://cloud.google.com/iam/help/credentials/lifetime If a value is not specified, the token's lifetime will be set to a default value of 1 hour.
          */
        var lifetime: js.UndefOr[String] = js.undefined
        
        /**
          * Required. Code to identify the scopes to be included in the OAuth 2.0 access token. See https://developers.google.com/identity/protocols/googlescopes for more information. At least
          * one value required.
          */
        var scope: js.UndefOr[js.Array[String]] = js.undefined
      }
      object GenerateAccessTokenRequest {
        
        inline def apply(): GenerateAccessTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateAccessTokenRequest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GenerateAccessTokenRequest] (val x: Self) extends AnyVal {
          
          inline def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          inline def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value*))
          
          inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
          
          inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
          
          inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
        }
      }
      
      trait GenerateAccessTokenResponse extends StObject {
        
        /** The OAuth 2.0 access token. */
        var accessToken: js.UndefOr[String] = js.undefined
        
        /** Token expiration time. The expiration time is always set. */
        var expireTime: js.UndefOr[String] = js.undefined
      }
      object GenerateAccessTokenResponse {
        
        inline def apply(): GenerateAccessTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateAccessTokenResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GenerateAccessTokenResponse] (val x: Self) extends AnyVal {
          
          inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
          
          inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
          
          inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
          
          inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
        }
      }
      
      trait GenerateIdTokenRequest extends StObject {
        
        /** Required. The audience for the token, such as the API or account that this token grants access to. */
        var audience: js.UndefOr[String] = js.undefined
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Include the service account email in the token. If set to `true`, the token will contain `email` and `email_verified` claims. */
        var includeEmail: js.UndefOr[Boolean] = js.undefined
      }
      object GenerateIdTokenRequest {
        
        inline def apply(): GenerateIdTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateIdTokenRequest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GenerateIdTokenRequest] (val x: Self) extends AnyVal {
          
          inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
          
          inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
          
          inline def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          inline def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value*))
          
          inline def setIncludeEmail(value: Boolean): Self = StObject.set(x, "includeEmail", value.asInstanceOf[js.Any])
          
          inline def setIncludeEmailUndefined: Self = StObject.set(x, "includeEmail", js.undefined)
        }
      }
      
      trait GenerateIdTokenResponse extends StObject {
        
        /** The OpenId Connect ID token. */
        var token: js.UndefOr[String] = js.undefined
      }
      object GenerateIdTokenResponse {
        
        inline def apply(): GenerateIdTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateIdTokenResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: GenerateIdTokenResponse] (val x: Self) extends AnyVal {
          
          inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      trait ProjectsResource extends StObject {
        
        var serviceAccounts: ServiceAccountsResource
      }
      object ProjectsResource {
        
        inline def apply(serviceAccounts: ServiceAccountsResource): ProjectsResource = {
          val __obj = js.Dynamic.literal(serviceAccounts = serviceAccounts.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProjectsResource]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
          
          inline def setServiceAccounts(value: ServiceAccountsResource): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ServiceAccountsResource extends StObject {
        
        /** Generates an OAuth 2.0 access token for a service account. */
        def generateAccessToken(request: Accesstoken): Request[GenerateAccessTokenResponse] = js.native
        def generateAccessToken(request: Alt, body: GenerateAccessTokenRequest): Request[GenerateAccessTokenResponse] = js.native
        
        def generateIdToken(request: Alt, body: GenerateIdTokenRequest): Request[GenerateIdTokenResponse] = js.native
        /** Generates an OpenID Connect ID token for a service account. */
        def generateIdToken(request: Callback): Request[GenerateIdTokenResponse] = js.native
        
        def signBlob(request: Alt, body: SignBlobRequest): Request[SignBlobResponse] = js.native
        /** Signs a blob using a service account's system-managed private key. */
        def signBlob(request: Fields): Request[SignBlobResponse] = js.native
        
        def signJwt(request: Alt, body: SignJwtRequest): Request[SignJwtResponse] = js.native
        /** Signs a JWT using a service account's system-managed private key. */
        def signJwt(request: Key): Request[SignJwtResponse] = js.native
      }
      
      trait SignBlobRequest extends StObject {
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Required. The bytes to sign. */
        var payload: js.UndefOr[String] = js.undefined
      }
      object SignBlobRequest {
        
        inline def apply(): SignBlobRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignBlobRequest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SignBlobRequest] (val x: Self) extends AnyVal {
          
          inline def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          inline def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value*))
          
          inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        }
      }
      
      trait SignBlobResponse extends StObject {
        
        /**
          * The ID of the key used to sign the blob. The key used for signing will remain valid for at least 12 hours after the blob is signed. To verify the signature, you can retrieve the
          * public key in several formats from the following endpoints: - RSA public key wrapped in an X.509 v3 certificate:
          * `https://www.googleapis.com/service_accounts/v1/metadata/x509/{ACCOUNT_EMAIL}` - Raw key in JSON format:
          * `https://www.googleapis.com/service_accounts/v1/metadata/raw/{ACCOUNT_EMAIL}` - JSON Web Key (JWK): `https://www.googleapis.com/service_accounts/v1/metadata/jwk/{ACCOUNT_EMAIL}`
          */
        var keyId: js.UndefOr[String] = js.undefined
        
        /**
          * The signature for the blob. Does not include the original blob. After the key pair referenced by the `key_id` response field expires, Google no longer exposes the public key that
          * can be used to verify the blob. As a result, the receiver can no longer verify the signature.
          */
        var signedBlob: js.UndefOr[String] = js.undefined
      }
      object SignBlobResponse {
        
        inline def apply(): SignBlobResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignBlobResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SignBlobResponse] (val x: Self) extends AnyVal {
          
          inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
          
          inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
          
          inline def setSignedBlob(value: String): Self = StObject.set(x, "signedBlob", value.asInstanceOf[js.Any])
          
          inline def setSignedBlobUndefined: Self = StObject.set(x, "signedBlob", js.undefined)
        }
      }
      
      trait SignJwtRequest extends StObject {
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * Required. The JWT payload to sign. Must be a serialized JSON object that contains a JWT Claims Set. For example: `{"sub": "user@example.com", "iat": 313435}` If the JWT Claims Set
          * contains an expiration time (`exp`) claim, it must be an integer timestamp that is not in the past and no more than 12 hours in the future.
          */
        var payload: js.UndefOr[String] = js.undefined
      }
      object SignJwtRequest {
        
        inline def apply(): SignJwtRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignJwtRequest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SignJwtRequest] (val x: Self) extends AnyVal {
          
          inline def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          inline def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value*))
          
          inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        }
      }
      
      trait SignJwtResponse extends StObject {
        
        /**
          * The ID of the key used to sign the JWT. The key used for signing will remain valid for at least 12 hours after the JWT is signed. To verify the signature, you can retrieve the
          * public key in several formats from the following endpoints: - RSA public key wrapped in an X.509 v3 certificate:
          * `https://www.googleapis.com/service_accounts/v1/metadata/x509/{ACCOUNT_EMAIL}` - Raw key in JSON format:
          * `https://www.googleapis.com/service_accounts/v1/metadata/raw/{ACCOUNT_EMAIL}` - JSON Web Key (JWK): `https://www.googleapis.com/service_accounts/v1/metadata/jwk/{ACCOUNT_EMAIL}`
          */
        var keyId: js.UndefOr[String] = js.undefined
        
        /**
          * The signed JWT. Contains the automatically generated header; the client-supplied payload; and the signature, which is generated using the key referenced by the `kid` field in the
          * header. After the key pair referenced by the `key_id` response field expires, Google no longer exposes the public key that can be used to verify the JWT. As a result, the receiver
          * can no longer verify the signature.
          */
        var signedJwt: js.UndefOr[String] = js.undefined
      }
      object SignJwtResponse {
        
        inline def apply(): SignJwtResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignJwtResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SignJwtResponse] (val x: Self) extends AnyVal {
          
          inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
          
          inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
          
          inline def setSignedJwt(value: String): Self = StObject.set(x, "signedJwt", value.asInstanceOf[js.Any])
          
          inline def setSignedJwtUndefined: Self = StObject.set(x, "signedJwt", js.undefined)
        }
      }
    }
  }
}
