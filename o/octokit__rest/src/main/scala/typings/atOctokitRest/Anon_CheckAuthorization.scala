package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsDeleteAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsDeleteAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsDeleteGrantParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsDeleteGrantResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetGrantParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetGrantResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListAuthorizationsParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListAuthorizationsResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListGrantsParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListGrantsResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsResetAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsResetAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsRevokeAuthorizationForApplicationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsRevokeAuthorizationForApplicationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsRevokeGrantForApplicationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsRevokeGrantForApplicationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CheckAuthorization extends js.Object {
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without running afoul of normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  @JSName("checkAuthorization")
  var checkAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsCheckAuthorizationParams = js.native
  /**
    * Creates OAuth tokens using [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication). If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    *
    * You can use this endpoint to create multiple OAuth tokens instead of implementing the [web flow](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/).
    *
    * To create tokens for a particular OAuth application using this endpoint, you must authenticate as the user you want to create an authorization for and provide the app's client ID and secret, found on your OAuth application's settings page. If your OAuth application intends to create multiple tokens for one user, use `fingerprint` to differentiate between them.
    *
    * You can also create tokens on GitHub from the [personal access tokens settings](https://github.com/settings/tokens) page. Read more about these tokens in [the GitHub Help documentation](https://help.github.com/articles/creating-an-access-token-for-command-line-use).
    *
    * Organizations that enforce SAML SSO require personal access tokens to be whitelisted. Read more about whitelisting tokens in [the GitHub Help documentation](https://help.github.com/articles/about-identity-and-access-management-with-saml-single-sign-on).
    */
  @JSName("createAuthorization")
  var createAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsCreateAuthorizationParams = js.native
  @JSName("deleteAuthorization")
  var deleteAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsDeleteAuthorizationParams = js.native
  /**
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for your user. Once deleted, the application has no access to your account and is no longer listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("deleteGrant")
  var deleteGrant_Original: Anon_EndpointParamsOauthAuthorizationsDeleteGrantParams = js.native
  @JSName("getAuthorization")
  var getAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsGetAuthorizationParams = js.native
  @JSName("getGrant")
  var getGrant_Original: Anon_EndpointParamsOauthAuthorizationsGetGrantParams = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  @JSName("getOrCreateAuthorizationForAppAndFingerprint")
  var getOrCreateAuthorizationForAppAndFingerprint_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  @JSName("getOrCreateAuthorizationForAppFingerprint")
  var getOrCreateAuthorizationForAppFingerprint_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams = js.native
  /**
    * Creates a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  @JSName("getOrCreateAuthorizationForApp")
  var getOrCreateAuthorizationForApp_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsGetOrCreateAuthorizationForAppParams = js.native
  @JSName("listAuthorizations")
  var listAuthorizations_Original: Anon_EndpointParamsOauthAuthorizationsListAuthorizationsParams = js.native
  /**
    * You can use this API to list the set of OAuth applications that have been granted access to your account. Unlike the [list your authorizations](https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations) API, this API does not manage individual tokens. This API will return one entry for each OAuth application that has been granted access to your account, regardless of the number of tokens an application has generated for your user. The list of OAuth applications returned matches what is shown on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized). The `scopes` returned are the union of scopes authorized for the application. For example, if an application has one token with `repo` scope and another token with `user` scope, the grant will return `["repo", "user"]`.
    */
  @JSName("listGrants")
  var listGrants_Original: Anon_EndpointParamsOauthAuthorizationsListGrantsParams = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end user involvement. Applications must save the "token" property in the response, because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  @JSName("resetAuthorization")
  var resetAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsResetAuthorizationParams = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`.
    */
  @JSName("revokeAuthorizationForApplication")
  var revokeAuthorizationForApplication_Original: Anon_EndpointParamsOauthAuthorizationsRevokeAuthorizationForApplicationParams = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("revokeGrantForApplication")
  var revokeGrantForApplication_Original: Anon_EndpointParamsOauthAuthorizationsRevokeGrantForApplicationParams = js.native
  /**
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    *
    * You can only send one of these scope keys at a time.
    */
  @JSName("updateAuthorization")
  var updateAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsUpdateAuthorizationParams = js.native
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without running afoul of normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def checkAuthorization(): js.Promise[Response[OauthAuthorizationsCheckAuthorizationResponse]] = js.native
  def checkAuthorization(params: OauthAuthorizationsCheckAuthorizationParams): js.Promise[Response[OauthAuthorizationsCheckAuthorizationResponse]] = js.native
  /**
    * Creates OAuth tokens using [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication). If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    *
    * You can use this endpoint to create multiple OAuth tokens instead of implementing the [web flow](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/).
    *
    * To create tokens for a particular OAuth application using this endpoint, you must authenticate as the user you want to create an authorization for and provide the app's client ID and secret, found on your OAuth application's settings page. If your OAuth application intends to create multiple tokens for one user, use `fingerprint` to differentiate between them.
    *
    * You can also create tokens on GitHub from the [personal access tokens settings](https://github.com/settings/tokens) page. Read more about these tokens in [the GitHub Help documentation](https://help.github.com/articles/creating-an-access-token-for-command-line-use).
    *
    * Organizations that enforce SAML SSO require personal access tokens to be whitelisted. Read more about whitelisting tokens in [the GitHub Help documentation](https://help.github.com/articles/about-identity-and-access-management-with-saml-single-sign-on).
    */
  def createAuthorization(): js.Promise[Response[OauthAuthorizationsCreateAuthorizationResponse]] = js.native
  def createAuthorization(params: OauthAuthorizationsCreateAuthorizationParams): js.Promise[Response[OauthAuthorizationsCreateAuthorizationResponse]] = js.native
  def deleteAuthorization(): js.Promise[Response[OauthAuthorizationsDeleteAuthorizationResponse]] = js.native
  def deleteAuthorization(params: OauthAuthorizationsDeleteAuthorizationParams): js.Promise[Response[OauthAuthorizationsDeleteAuthorizationResponse]] = js.native
  /**
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for your user. Once deleted, the application has no access to your account and is no longer listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def deleteGrant(): js.Promise[Response[OauthAuthorizationsDeleteGrantResponse]] = js.native
  def deleteGrant(params: OauthAuthorizationsDeleteGrantParams): js.Promise[Response[OauthAuthorizationsDeleteGrantResponse]] = js.native
  def getAuthorization(): js.Promise[Response[OauthAuthorizationsGetAuthorizationResponse]] = js.native
  def getAuthorization(params: OauthAuthorizationsGetAuthorizationParams): js.Promise[Response[OauthAuthorizationsGetAuthorizationResponse]] = js.native
  def getGrant(): js.Promise[Response[OauthAuthorizationsGetGrantResponse]] = js.native
  def getGrant(params: OauthAuthorizationsGetGrantParams): js.Promise[Response[OauthAuthorizationsGetGrantResponse]] = js.native
  /**
    * Creates a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  def getOrCreateAuthorizationForApp(): js.Promise[AnyResponse] = js.native
  def getOrCreateAuthorizationForApp(params: OauthAuthorizationsGetOrCreateAuthorizationForAppParams): js.Promise[AnyResponse] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  def getOrCreateAuthorizationForAppAndFingerprint(): js.Promise[AnyResponse] = js.native
  def getOrCreateAuthorizationForAppAndFingerprint(params: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams): js.Promise[AnyResponse] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  def getOrCreateAuthorizationForAppFingerprint(): js.Promise[AnyResponse] = js.native
  def getOrCreateAuthorizationForAppFingerprint(params: OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams): js.Promise[AnyResponse] = js.native
  def listAuthorizations(): js.Promise[Response[OauthAuthorizationsListAuthorizationsResponse]] = js.native
  def listAuthorizations(params: OauthAuthorizationsListAuthorizationsParams): js.Promise[Response[OauthAuthorizationsListAuthorizationsResponse]] = js.native
  /**
    * You can use this API to list the set of OAuth applications that have been granted access to your account. Unlike the [list your authorizations](https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations) API, this API does not manage individual tokens. This API will return one entry for each OAuth application that has been granted access to your account, regardless of the number of tokens an application has generated for your user. The list of OAuth applications returned matches what is shown on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized). The `scopes` returned are the union of scopes authorized for the application. For example, if an application has one token with `repo` scope and another token with `user` scope, the grant will return `["repo", "user"]`.
    */
  def listGrants(): js.Promise[Response[OauthAuthorizationsListGrantsResponse]] = js.native
  def listGrants(params: OauthAuthorizationsListGrantsParams): js.Promise[Response[OauthAuthorizationsListGrantsResponse]] = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end user involvement. Applications must save the "token" property in the response, because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def resetAuthorization(): js.Promise[Response[OauthAuthorizationsResetAuthorizationResponse]] = js.native
  def resetAuthorization(params: OauthAuthorizationsResetAuthorizationParams): js.Promise[Response[OauthAuthorizationsResetAuthorizationResponse]] = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`.
    */
  def revokeAuthorizationForApplication(): js.Promise[Response[OauthAuthorizationsRevokeAuthorizationForApplicationResponse]] = js.native
  def revokeAuthorizationForApplication(params: OauthAuthorizationsRevokeAuthorizationForApplicationParams): js.Promise[Response[OauthAuthorizationsRevokeAuthorizationForApplicationResponse]] = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def revokeGrantForApplication(): js.Promise[Response[OauthAuthorizationsRevokeGrantForApplicationResponse]] = js.native
  def revokeGrantForApplication(params: OauthAuthorizationsRevokeGrantForApplicationParams): js.Promise[Response[OauthAuthorizationsRevokeGrantForApplicationResponse]] = js.native
  /**
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Woking with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    *
    * You can only send one of these scope keys at a time.
    */
  def updateAuthorization(): js.Promise[Response[OauthAuthorizationsUpdateAuthorizationResponse]] = js.native
  def updateAuthorization(params: OauthAuthorizationsUpdateAuthorizationParams): js.Promise[Response[OauthAuthorizationsUpdateAuthorizationResponse]] = js.native
}

