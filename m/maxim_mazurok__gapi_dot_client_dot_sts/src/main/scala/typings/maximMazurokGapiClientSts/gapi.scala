package typings.maximMazurokGapiClientSts

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSts.anon.Accesstoken
import typings.maximMazurokGapiClientSts.anon.Alt
import typings.maximMazurokGapiClientSts.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object sts {
      
      trait GoogleIamV1Binding extends StObject {
        
        /**
          * The condition that is associated with this binding. If the condition evaluates to `true`, then this binding applies to the current request. If the condition evaluates to `false`,
          * then this binding does not apply to the current request. However, a different role binding might grant the same role to one or more of the principals in this binding. To learn which
          * resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
          */
        var condition: js.UndefOr[GoogleTypeExpr] = js.undefined
        
        /**
          * Specifies the principals requesting access for a Google Cloud resource. `members` can have the following values: * `allUsers`: A special identifier that represents anyone who is on
          * the internet; with or without a Google account. * `allAuthenticatedUsers`: A special identifier that represents anyone who is authenticated with a Google account or a service
          * account. * `user:{emailid}`: An email address that represents a specific Google account. For example, `alice@example.com` . * `serviceAccount:{emailid}`: An email address that
          * represents a Google service account. For example, `my-other-app@appspot.gserviceaccount.com`. * `serviceAccount:{projectid}.svc.id.goog[{namespace}/{kubernetes-sa}]`: An identifier
          * for a [Kubernetes service account](https://cloud.google.com/kubernetes-engine/docs/how-to/kubernetes-service-accounts). For example,
          * `my-project.svc.id.goog[my-namespace/my-kubernetes-sa]`. * `group:{emailid}`: An email address that represents a Google group. For example, `admins@example.com`. *
          * `deleted:user:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a user that has been recently deleted. For example,
          * `alice@example.com?uid=123456789012345678901`. If the user is recovered, this value reverts to `user:{emailid}` and the recovered user retains the role in the binding. *
          * `deleted:serviceAccount:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a service account that has been recently deleted. For example,
          * `my-other-app@appspot.gserviceaccount.com?uid=123456789012345678901`. If the service account is undeleted, this value reverts to `serviceAccount:{emailid}` and the undeleted service
          * account retains the role in the binding. * `deleted:group:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a Google group that has been recently
          * deleted. For example, `admins@example.com?uid=123456789012345678901`. If the group is recovered, this value reverts to `group:{emailid}` and the recovered group retains the role in
          * the binding. * `domain:{domain}`: The G Suite domain (primary) that represents all the users of that domain. For example, `google.com` or `example.com`.
          */
        var members: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Role that is assigned to the list of `members`, or principals. For example, `roles/viewer`, `roles/editor`, or `roles/owner`. */
        var role: js.UndefOr[String] = js.undefined
      }
      object GoogleIamV1Binding {
        
        inline def apply(): GoogleIamV1Binding = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIamV1Binding]
        }
        
        extension [Self <: GoogleIamV1Binding](x: Self) {
          
          inline def setCondition(value: GoogleTypeExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
          
          inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
          
          inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
          
          inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
          
          inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
          
          inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
          
          inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1AccessBoundary extends StObject {
        
        /**
          * A list of access boundary rules which defines the upper bound of the permission a principal may carry. If multiple rules are specified, the effective access boundary is the union of
          * all the access boundary rules attached. One access boundary can contain at most 10 rules.
          */
        var accessBoundaryRules: js.UndefOr[js.Array[GoogleIdentityStsV1AccessBoundaryRule]] = js.undefined
      }
      object GoogleIdentityStsV1AccessBoundary {
        
        inline def apply(): GoogleIdentityStsV1AccessBoundary = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1AccessBoundary]
        }
        
        extension [Self <: GoogleIdentityStsV1AccessBoundary](x: Self) {
          
          inline def setAccessBoundaryRules(value: js.Array[GoogleIdentityStsV1AccessBoundaryRule]): Self = StObject.set(x, "accessBoundaryRules", value.asInstanceOf[js.Any])
          
          inline def setAccessBoundaryRulesUndefined: Self = StObject.set(x, "accessBoundaryRules", js.undefined)
          
          inline def setAccessBoundaryRulesVarargs(value: GoogleIdentityStsV1AccessBoundaryRule*): Self = StObject.set(x, "accessBoundaryRules", js.Array(value*))
        }
      }
      
      trait GoogleIdentityStsV1AccessBoundaryRule extends StObject {
        
        /**
          * The availability condition further constrains the access allowed by the access boundary rule. If the condition evaluates to `true`, then this access boundary rule will provide
          * access to the specified resource, assuming the principal has the required permissions for the resource. If the condition does not evaluate to `true`, then access to the specified
          * resource will not be available. Note that all access boundary rules in an access boundary are evaluated together as a union. As such, another access boundary rule may allow access
          * to the resource, even if this access boundary rule does not allow access. To learn which resources support conditions in their IAM policies, see the [IAM
          * documentation](https://cloud.google.com/iam/help/conditions/resource-policies). The maximum length of the `expression` field is 2048 characters.
          */
        var availabilityCondition: js.UndefOr[GoogleTypeExpr] = js.undefined
        
        /**
          * A list of permissions that may be allowed for use on the specified resource. The only supported values in the list are IAM roles, following the format of google.iam.v1.Binding.role.
          * Example value: `inRole:roles/logging.viewer` for predefined roles and `inRole:organizations/{ORGANIZATION_ID}/roles/logging.viewer` for custom roles.
          */
        var availablePermissions: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * The full resource name of a Google Cloud resource entity. The format definition is at https://cloud.google.com/apis/design/resource_names. Example value:
          * `//cloudresourcemanager.googleapis.com/projects/my-project`.
          */
        var availableResource: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1AccessBoundaryRule {
        
        inline def apply(): GoogleIdentityStsV1AccessBoundaryRule = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1AccessBoundaryRule]
        }
        
        extension [Self <: GoogleIdentityStsV1AccessBoundaryRule](x: Self) {
          
          inline def setAvailabilityCondition(value: GoogleTypeExpr): Self = StObject.set(x, "availabilityCondition", value.asInstanceOf[js.Any])
          
          inline def setAvailabilityConditionUndefined: Self = StObject.set(x, "availabilityCondition", js.undefined)
          
          inline def setAvailablePermissions(value: js.Array[String]): Self = StObject.set(x, "availablePermissions", value.asInstanceOf[js.Any])
          
          inline def setAvailablePermissionsUndefined: Self = StObject.set(x, "availablePermissions", js.undefined)
          
          inline def setAvailablePermissionsVarargs(value: String*): Self = StObject.set(x, "availablePermissions", js.Array(value*))
          
          inline def setAvailableResource(value: String): Self = StObject.set(x, "availableResource", value.asInstanceOf[js.Any])
          
          inline def setAvailableResourceUndefined: Self = StObject.set(x, "availableResource", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1ExchangeTokenRequest extends StObject {
        
        /**
          * The full resource name of the identity provider; for example: `//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/`. Required when exchanging an
          * external credential for a Google access token.
          */
        var audience: js.UndefOr[String] = js.undefined
        
        /** Required. The grant type. Must be `urn:ietf:params:oauth:grant-type:token-exchange`, which indicates a token exchange. */
        var grantType: js.UndefOr[String] = js.undefined
        
        /**
          * A set of features that Security Token Service supports, in addition to the standard OAuth 2.0 token exchange, formatted as a serialized JSON object of Options. The size of the
          * parameter value must not exceed 4096 characters.
          */
        var options: js.UndefOr[String] = js.undefined
        
        /** Required. An identifier for the type of requested security token. Must be `urn:ietf:params:oauth:token-type:access_token`. */
        var requestedTokenType: js.UndefOr[String] = js.undefined
        
        /**
          * The OAuth 2.0 scopes to include on the resulting access token, formatted as a list of space-delimited, case-sensitive strings. Required when exchanging an external credential for a
          * Google access token.
          */
        var scope: js.UndefOr[String] = js.undefined
        
        /**
          * Required. The input token. This token is either an external credential issued by a workload identity pool provider, or a short-lived access token issued by Google. If the token is
          * an OIDC JWT, it must use the JWT format defined in [RFC 7523](https://tools.ietf.org/html/rfc7523), and the `subject_token_type` must be either
          * `urn:ietf:params:oauth:token-type:jwt` or `urn:ietf:params:oauth:token-type:id_token`. The following headers are required: - `kid`: The identifier of the signing key securing the
          * JWT. - `alg`: The cryptographic algorithm securing the JWT. Must be `RS256` or `ES256`. The following payload fields are required. For more information, see [RFC 7523, Section
          * 3](https://tools.ietf.org/html/rfc7523#section-3): - `iss`: The issuer of the token. The issuer must provide a discovery document at the URL `/.well-known/openid-configuration`,
          * where `` is the value of this field. The document must be formatted according to section 4.2 of the [OIDC 1.0 Discovery
          * specification](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderConfigurationResponse). - `iat`: The issue time, in seconds, since the Unix epoch. Must be in the
          * past. - `exp`: The expiration time, in seconds, since the Unix epoch. Must be less than 48 hours after `iat`. Shorter expiration times are more secure. If possible, we recommend
          * setting an expiration time less than 6 hours. - `sub`: The identity asserted in the JWT. - `aud`: For workload identity pools, this must be a value specified in the allowed
          * audiences for the workload identity pool provider, or one of the audiences allowed by default if no audiences were specified. See
          * https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.providers#oidc Example header: ``` { "alg": "RS256", "kid": "us-east-11" } ``` Example
          * payload: ``` { "iss": "https://accounts.google.com", "iat": 1517963104, "exp": 1517966704, "aud":
          * "//iam.googleapis.com/projects/1234567890123/locations/global/workloadIdentityPools/my-pool/providers/my-provider", "sub": "113475438248934895348", "my_claims": {
          * "additional_claim": "value" } } ``` If `subject_token` is for AWS, it must be a serialized `GetCallerIdentity` token. This token contains the same information as a request to the
          * AWS [`GetCallerIdentity()`](https://docs.aws.amazon.com/STS/latest/APIReference/API_GetCallerIdentity) method, as well as the AWS
          * [signature](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) for the request information. Use Signature Version 4. Format the request as URL-encoded
          * JSON, and set the `subject_token_type` parameter to `urn:ietf:params:aws:token-type:aws4_request`. The following parameters are required: - `url`: The URL of the AWS STS endpoint
          * for `GetCallerIdentity()`, such as `https://sts.amazonaws.com?Action=GetCallerIdentity&Version=2011-06-15`. Regional endpoints are also supported. - `method`: The HTTP request
          * method: `POST`. - `headers`: The HTTP request headers, which must include: - `Authorization`: The request signature. - `x-amz-date`: The time you will send the request, formatted as
          * an [ISO8601 Basic](https://docs.aws.amazon.com/general/latest/gr/sigv4_elements.html#sigv4_elements_date) string. This value is typically set to the current time and is used to help
          * prevent replay attacks. - `host`: The hostname of the `url` field; for example, `sts.amazonaws.com`. - `x-goog-cloud-target-resource`: The full, canonical resource name of the
          * workload identity pool provider, with or without an `https:` prefix. To help ensure data integrity, we recommend including this header in the `SignedHeaders` field of the signed
          * request. For example: //iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/
          * https://iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/ If you are using temporary security credentials provided by AWS, you must also include the
          * header `x-amz-security-token`, with the value set to the session token. The following example shows a `GetCallerIdentity` token: ``` { "headers": [ {"key": "x-amz-date", "value":
          * "20200815T015049Z"}, {"key": "Authorization", "value": "AWS4-HMAC-SHA256+Credential=$credential,+SignedHeaders=host;x-amz-date;x-goog-cloud-target-resource,+Signature=$signature"},
          * {"key": "x-goog-cloud-target-resource", "value": "//iam.googleapis.com/projects//locations/global/workloadIdentityPools//providers/"}, {"key": "host", "value": "sts.amazonaws.com"}
          * . ], "method": "POST", "url": "https://sts.amazonaws.com?Action=GetCallerIdentity&Version=2011-06-15" } ``` If the token is a SAML 2.0 assertion, it must use the format defined in
          * [the SAML 2.0 spec](https://www.oasis-open.org/committees/download.php/56776/sstc-saml-core-errata-2.0-wd-07.pdf), and the `subject_token_type` must be
          * `urn:ietf:params:oauth:token-type:saml2`. See [Verification of external
          * credentials](https://cloud.google.com/iam/docs/using-workload-identity-federation#verification_of_external_credentials) for details on how SAML 2.0 assertions are validated during
          * token exchanges. You can also use a Google-issued OAuth 2.0 access token with this field to obtain an access token with new security attributes applied, such as a Credential Access
          * Boundary. In this case, set `subject_token_type` to `urn:ietf:params:oauth:token-type:access_token`. If an access token already contains security attributes, you cannot apply
          * additional security attributes.
          */
        var subjectToken: js.UndefOr[String] = js.undefined
        
        /**
          * Required. An identifier that indicates the type of the security token in the `subject_token` parameter. Supported values are `urn:ietf:params:oauth:token-type:jwt`,
          * `urn:ietf:params:oauth:token-type:id_token`, `urn:ietf:params:aws:token-type:aws4_request`, `urn:ietf:params:oauth:token-type:access_token`, and
          * `urn:ietf:params:oauth:token-type:saml2`.
          */
        var subjectTokenType: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1ExchangeTokenRequest {
        
        inline def apply(): GoogleIdentityStsV1ExchangeTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1ExchangeTokenRequest]
        }
        
        extension [Self <: GoogleIdentityStsV1ExchangeTokenRequest](x: Self) {
          
          inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
          
          inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
          
          inline def setGrantType(value: String): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
          
          inline def setGrantTypeUndefined: Self = StObject.set(x, "grantType", js.undefined)
          
          inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
          
          inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
          
          inline def setRequestedTokenType(value: String): Self = StObject.set(x, "requestedTokenType", value.asInstanceOf[js.Any])
          
          inline def setRequestedTokenTypeUndefined: Self = StObject.set(x, "requestedTokenType", js.undefined)
          
          inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          inline def setSubjectToken(value: String): Self = StObject.set(x, "subjectToken", value.asInstanceOf[js.Any])
          
          inline def setSubjectTokenType(value: String): Self = StObject.set(x, "subjectTokenType", value.asInstanceOf[js.Any])
          
          inline def setSubjectTokenTypeUndefined: Self = StObject.set(x, "subjectTokenType", js.undefined)
          
          inline def setSubjectTokenUndefined: Self = StObject.set(x, "subjectToken", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1ExchangeTokenResponse extends StObject {
        
        /**
          * An OAuth 2.0 security token, issued by Google, in response to the token exchange request. Tokens can vary in size, depending in part on the size of mapped claims, up to a maximum of
          * 12288 bytes (12 KB). Google reserves the right to change the token size and the maximum length at any time.
          */
        var access_token: js.UndefOr[String] = js.undefined
        
        /**
          * The amount of time, in seconds, between the time when the access token was issued and the time when the access token will expire. This field is absent when the `subject_token` in
          * the request is a Google-issued, short-lived access token. In this case, the access token has the same expiration time as the `subject_token`.
          */
        var expires_in: js.UndefOr[Double] = js.undefined
        
        /** The token type. Always matches the value of `requested_token_type` from the request. */
        var issued_token_type: js.UndefOr[String] = js.undefined
        
        /** The type of access token. Always has the value `Bearer`. */
        var token_type: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1ExchangeTokenResponse {
        
        inline def apply(): GoogleIdentityStsV1ExchangeTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1ExchangeTokenResponse]
        }
        
        extension [Self <: GoogleIdentityStsV1ExchangeTokenResponse](x: Self) {
          
          inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
          
          inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
          
          inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
          
          inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
          
          inline def setIssued_token_type(value: String): Self = StObject.set(x, "issued_token_type", value.asInstanceOf[js.Any])
          
          inline def setIssued_token_typeUndefined: Self = StObject.set(x, "issued_token_type", js.undefined)
          
          inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
          
          inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1IntrospectTokenRequest extends StObject {
        
        /** Required. The OAuth 2.0 security token issued by the Security Token Service API. */
        var token: js.UndefOr[String] = js.undefined
        
        /** Optional. The type of the given token. Supported values are `urn:ietf:params:oauth:token-type:access_token` and `access_token`. */
        var tokenTypeHint: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1IntrospectTokenRequest {
        
        inline def apply(): GoogleIdentityStsV1IntrospectTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1IntrospectTokenRequest]
        }
        
        extension [Self <: GoogleIdentityStsV1IntrospectTokenRequest](x: Self) {
          
          inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          inline def setTokenTypeHint(value: String): Self = StObject.set(x, "tokenTypeHint", value.asInstanceOf[js.Any])
          
          inline def setTokenTypeHintUndefined: Self = StObject.set(x, "tokenTypeHint", js.undefined)
          
          inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1IntrospectTokenResponse extends StObject {
        
        /** A boolean value that indicates whether the provided access token is currently active. */
        var active: js.UndefOr[Boolean] = js.undefined
        
        /** The client identifier for the OAuth 2.0 client that requested the provided token. */
        var client_id: js.UndefOr[String] = js.undefined
        
        /** The expiration timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire. */
        var exp: js.UndefOr[String] = js.undefined
        
        /** The issued timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued. */
        var iat: js.UndefOr[String] = js.undefined
        
        /** The issuer of the provided token. */
        var iss: js.UndefOr[String] = js.undefined
        
        /** A list of scopes associated with the provided token. */
        var scope: js.UndefOr[String] = js.undefined
        
        /**
          * The unique user ID associated with the provided token. For Google Accounts, this value is based on the Google Account's user ID. For federated identities, this value is based on the
          * identity pool ID and the value of the mapped `google.subject` attribute.
          */
        var sub: js.UndefOr[String] = js.undefined
        
        /**
          * The human-readable identifier for the token principal subject. For example, if the provided token is associated with a workload identity pool, this field contains a value in the
          * following format: `principal://iam.googleapis.com/projects//locations/global/workloadIdentityPools//subject/`
          */
        var username: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1IntrospectTokenResponse {
        
        inline def apply(): GoogleIdentityStsV1IntrospectTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1IntrospectTokenResponse]
        }
        
        extension [Self <: GoogleIdentityStsV1IntrospectTokenResponse](x: Self) {
          
          inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
          
          inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
          
          inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
          
          inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
          
          inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
          
          inline def setIat(value: String): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
          
          inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
          
          inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
          
          inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
          
          inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
          
          inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
          
          inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
          
          inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1Options extends StObject {
        
        /**
          * An access boundary that defines the upper bound of permissions the credential may have. The value should be a JSON object of AccessBoundary. The access boundary can include up to 10
          * rules. The size of the parameter value should not exceed 2048 characters.
          */
        var accessBoundary: js.UndefOr[GoogleIdentityStsV1AccessBoundary] = js.undefined
        
        /**
          * The intended audience(s) of the credential. The audience value(s) should be the name(s) of services intended to receive the credential. Example: `["https://pubsub.googleapis.com/",
          * "https://storage.googleapis.com/"]`. A maximum of 5 audiences can be included. For each provided audience, the maximum length is 262 characters.
          */
        var audiences: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * A Google project used for quota and billing purposes when the credential is used to access Google APIs. The provided project overrides the project bound to the credential. The value
          * must be a project number or a project ID. Example: `my-sample-project-191923`. The maximum length is 32 characters.
          */
        var userProject: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1Options {
        
        inline def apply(): GoogleIdentityStsV1Options = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1Options]
        }
        
        extension [Self <: GoogleIdentityStsV1Options](x: Self) {
          
          inline def setAccessBoundary(value: GoogleIdentityStsV1AccessBoundary): Self = StObject.set(x, "accessBoundary", value.asInstanceOf[js.Any])
          
          inline def setAccessBoundaryUndefined: Self = StObject.set(x, "accessBoundary", js.undefined)
          
          inline def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
          
          inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
          
          inline def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value*))
          
          inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
          
          inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1betaAccessBoundary extends StObject {
        
        /**
          * A list of access boundary rules which defines the upper bound of the permission a principal may carry. If multiple rules are specified, the effective access boundary is the union of
          * all the access boundary rules attached. One access boundary can contain at most 10 rules.
          */
        var accessBoundaryRules: js.UndefOr[js.Array[GoogleIdentityStsV1betaAccessBoundaryRule]] = js.undefined
      }
      object GoogleIdentityStsV1betaAccessBoundary {
        
        inline def apply(): GoogleIdentityStsV1betaAccessBoundary = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1betaAccessBoundary]
        }
        
        extension [Self <: GoogleIdentityStsV1betaAccessBoundary](x: Self) {
          
          inline def setAccessBoundaryRules(value: js.Array[GoogleIdentityStsV1betaAccessBoundaryRule]): Self = StObject.set(x, "accessBoundaryRules", value.asInstanceOf[js.Any])
          
          inline def setAccessBoundaryRulesUndefined: Self = StObject.set(x, "accessBoundaryRules", js.undefined)
          
          inline def setAccessBoundaryRulesVarargs(value: GoogleIdentityStsV1betaAccessBoundaryRule*): Self = StObject.set(x, "accessBoundaryRules", js.Array(value*))
        }
      }
      
      trait GoogleIdentityStsV1betaAccessBoundaryRule extends StObject {
        
        /**
          * The availability condition further constrains the access allowed by the access boundary rule. If the condition evaluates to `true`, then this access boundary rule will provide
          * access to the specified resource, assuming the principal has the required permissions for the resource. If the condition does not evaluate to `true`, then access to the specified
          * resource will not be available. Note that all access boundary rules in an access boundary are evaluated together as a union. As such, another access boundary rule may allow access
          * to the resource, even if this access boundary rule does not allow access. To learn which resources support conditions in their IAM policies, see the [IAM
          * documentation](https://cloud.google.com/iam/help/conditions/resource-policies). The maximum length of the `expression` field is 2048 characters.
          */
        var availabilityCondition: js.UndefOr[GoogleTypeExpr] = js.undefined
        
        /**
          * A list of permissions that may be allowed for use on the specified resource. The only supported values in the list are IAM roles, following the format of google.iam.v1.Binding.role.
          * Example value: `inRole:roles/logging.viewer` for predefined roles and `inRole:organizations/{ORGANIZATION_ID}/roles/logging.viewer` for custom roles.
          */
        var availablePermissions: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * The full resource name of a Google Cloud resource entity. The format definition is at https://cloud.google.com/apis/design/resource_names. Example value:
          * `//cloudresourcemanager.googleapis.com/projects/my-project`.
          */
        var availableResource: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1betaAccessBoundaryRule {
        
        inline def apply(): GoogleIdentityStsV1betaAccessBoundaryRule = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1betaAccessBoundaryRule]
        }
        
        extension [Self <: GoogleIdentityStsV1betaAccessBoundaryRule](x: Self) {
          
          inline def setAvailabilityCondition(value: GoogleTypeExpr): Self = StObject.set(x, "availabilityCondition", value.asInstanceOf[js.Any])
          
          inline def setAvailabilityConditionUndefined: Self = StObject.set(x, "availabilityCondition", js.undefined)
          
          inline def setAvailablePermissions(value: js.Array[String]): Self = StObject.set(x, "availablePermissions", value.asInstanceOf[js.Any])
          
          inline def setAvailablePermissionsUndefined: Self = StObject.set(x, "availablePermissions", js.undefined)
          
          inline def setAvailablePermissionsVarargs(value: String*): Self = StObject.set(x, "availablePermissions", js.Array(value*))
          
          inline def setAvailableResource(value: String): Self = StObject.set(x, "availableResource", value.asInstanceOf[js.Any])
          
          inline def setAvailableResourceUndefined: Self = StObject.set(x, "availableResource", js.undefined)
        }
      }
      
      trait GoogleIdentityStsV1betaOptions extends StObject {
        
        /**
          * An access boundary that defines the upper bound of permissions the credential may have. The value should be a JSON object of AccessBoundary. The access boundary can include up to 10
          * rules. The size of the parameter value should not exceed 2048 characters.
          */
        var accessBoundary: js.UndefOr[GoogleIdentityStsV1betaAccessBoundary] = js.undefined
        
        /**
          * The intended audience(s) of the credential. The audience value(s) should be the name(s) of services intended to receive the credential. Example: `["https://pubsub.googleapis.com/",
          * "https://storage.googleapis.com/"]`. A maximum of 5 audiences can be included. For each provided audience, the maximum length is 262 characters.
          */
        var audiences: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * A Google project used for quota and billing purposes when the credential is used to access Google APIs. The provided project overrides the project bound to the credential. The value
          * must be a project number or a project ID. Example: `my-sample-project-191923`. The maximum length is 32 characters.
          */
        var userProject: js.UndefOr[String] = js.undefined
      }
      object GoogleIdentityStsV1betaOptions {
        
        inline def apply(): GoogleIdentityStsV1betaOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleIdentityStsV1betaOptions]
        }
        
        extension [Self <: GoogleIdentityStsV1betaOptions](x: Self) {
          
          inline def setAccessBoundary(value: GoogleIdentityStsV1betaAccessBoundary): Self = StObject.set(x, "accessBoundary", value.asInstanceOf[js.Any])
          
          inline def setAccessBoundaryUndefined: Self = StObject.set(x, "accessBoundary", js.undefined)
          
          inline def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
          
          inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
          
          inline def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value*))
          
          inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
          
          inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
        }
      }
      
      trait GoogleTypeExpr extends StObject {
        
        /** Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI. */
        var description: js.UndefOr[String] = js.undefined
        
        /** Textual representation of an expression in Common Expression Language syntax. */
        var expression: js.UndefOr[String] = js.undefined
        
        /** Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file. */
        var location: js.UndefOr[String] = js.undefined
        
        /** Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression. */
        var title: js.UndefOr[String] = js.undefined
      }
      object GoogleTypeExpr {
        
        inline def apply(): GoogleTypeExpr = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleTypeExpr]
        }
        
        extension [Self <: GoogleTypeExpr](x: Self) {
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
          
          inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
          
          inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      @js.native
      trait V1Resource extends StObject {
        
        /** Gets information about a Google OAuth 2.0 access token issued by the Google Cloud [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest). */
        def introspect(request: Accesstoken): Request[GoogleIdentityStsV1IntrospectTokenResponse] = js.native
        def introspect(request: Alt, body: GoogleIdentityStsV1IntrospectTokenRequest): Request[GoogleIdentityStsV1IntrospectTokenResponse] = js.native
        
        def token(request: Alt, body: GoogleIdentityStsV1ExchangeTokenRequest): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
        /**
          * Exchanges a credential for a Google OAuth 2.0 access token. The token asserts an external identity within an identity pool, or it applies a Credential Access Boundary to a Google
          * access token. When you call this method, do not send the `Authorization` HTTP header in the request. This method does not require the `Authorization` header, and using the header
          * can cause the request to fail.
          */
        def token(request: Callback): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
      }
    }
  }
}
