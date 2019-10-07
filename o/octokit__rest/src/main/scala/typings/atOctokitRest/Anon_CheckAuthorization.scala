package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsDeleteAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsDeleteGrantParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetGrantParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetGrantResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListAuthorizationsParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListAuthorizationsResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListGrantsParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsListGrantsResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsResetAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsResetAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsRevokeAuthorizationForApplicationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsRevokeGrantForApplicationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationParams
import typings.atOctokitRest.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
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
    * Creates OAuth tokens using [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication). If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
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
  var deleteAuthorization_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsDeleteAuthorizationParams = js.native
  /**
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for your user. Once deleted, the application has no access to your account and is no longer listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("deleteGrant")
  var deleteGrant_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsDeleteGrantParams = js.native
  @JSName("getAuthorization")
  var getAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsGetAuthorizationParams = js.native
  @JSName("getGrant")
  var getGrant_Original: Anon_EndpointParamsOauthAuthorizationsGetGrantParams = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  @JSName("getOrCreateAuthorizationForAppAndFingerprint")
  var getOrCreateAuthorizationForAppAndFingerprint_Original: Anon_EndpointParamsOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    * @deprecated octokit.oauthAuthorizations.getOrCreateAuthorizationForAppFingerprint() has been renamed to octokit.oauthAuthorizations.getOrCreateAuthorizationForAppAndFingerprint() (2018-12-27)
    */
  @JSName("getOrCreateAuthorizationForAppFingerprint")
  var getOrCreateAuthorizationForAppFingerprint_Original: Anon_EndpointParamsOauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams = js.native
  /**
    * Creates a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  @JSName("getOrCreateAuthorizationForApp")
  var getOrCreateAuthorizationForApp_Original: Anon_EndpointParamsOauthAuthorizationsGetOrCreateAuthorizationForAppParams = js.native
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
  var revokeAuthorizationForApplication_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsRevokeAuthorizationForApplicationParams = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("revokeGrantForApplication")
  var revokeGrantForApplication_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsRevokeGrantForApplicationParams = js.native
  /**
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    *
    * You can only send one of these scope keys at a time.
    */
  @JSName("updateAuthorization")
  var updateAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsUpdateAuthorizationParams = js.native
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without running afoul of normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def checkAuthorization(): js.Promise[Response[OauthAuthorizationsCheckAuthorizationResponse]] = js.native
  def checkAuthorization(params: RequestOptions with OauthAuthorizationsCheckAuthorizationParams): js.Promise[Response[OauthAuthorizationsCheckAuthorizationResponse]] = js.native
  /**
    * Creates OAuth tokens using [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication). If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
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
  def createAuthorization(params: RequestOptions with OauthAuthorizationsCreateAuthorizationParams): js.Promise[Response[OauthAuthorizationsCreateAuthorizationResponse]] = js.native
  def deleteAuthorization(): js.Promise[AnyResponse] = js.native
  def deleteAuthorization(params: RequestOptions with OauthAuthorizationsDeleteAuthorizationParams): js.Promise[AnyResponse] = js.native
  /**
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for your user. Once deleted, the application has no access to your account and is no longer listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def deleteGrant(): js.Promise[AnyResponse] = js.native
  def deleteGrant(params: RequestOptions with OauthAuthorizationsDeleteGrantParams): js.Promise[AnyResponse] = js.native
  def getAuthorization(): js.Promise[Response[OauthAuthorizationsGetAuthorizationResponse]] = js.native
  def getAuthorization(params: RequestOptions with OauthAuthorizationsGetAuthorizationParams): js.Promise[Response[OauthAuthorizationsGetAuthorizationResponse]] = js.native
  def getGrant(): js.Promise[Response[OauthAuthorizationsGetGrantResponse]] = js.native
  def getGrant(params: RequestOptions with OauthAuthorizationsGetGrantParams): js.Promise[Response[OauthAuthorizationsGetGrantResponse]] = js.native
  /**
    * Creates a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  def getOrCreateAuthorizationForApp(): js.Promise[Response[OauthAuthorizationsGetOrCreateAuthorizationForAppResponse]] = js.native
  def getOrCreateAuthorizationForApp(params: RequestOptions with OauthAuthorizationsGetOrCreateAuthorizationForAppParams): js.Promise[Response[OauthAuthorizationsGetOrCreateAuthorizationForAppResponse]] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    */
  def getOrCreateAuthorizationForAppAndFingerprint(): js.Promise[
    Response[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse]
  ] = js.native
  def getOrCreateAuthorizationForAppAndFingerprint(params: RequestOptions with OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams): js.Promise[
    Response[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse]
  ] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    *
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    * @deprecated octokit.oauthAuthorizations.getOrCreateAuthorizationForAppFingerprint() has been renamed to octokit.oauthAuthorizations.getOrCreateAuthorizationForAppAndFingerprint() (2018-12-27)
    */
  def getOrCreateAuthorizationForAppFingerprint(): js.Promise[Response[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse]] = js.native
  def getOrCreateAuthorizationForAppFingerprint(params: RequestOptions with OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams): js.Promise[Response[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse]] = js.native
  def listAuthorizations(): js.Promise[Response[OauthAuthorizationsListAuthorizationsResponse]] = js.native
  def listAuthorizations(params: RequestOptions with OauthAuthorizationsListAuthorizationsParams): js.Promise[Response[OauthAuthorizationsListAuthorizationsResponse]] = js.native
  /**
    * You can use this API to list the set of OAuth applications that have been granted access to your account. Unlike the [list your authorizations](https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations) API, this API does not manage individual tokens. This API will return one entry for each OAuth application that has been granted access to your account, regardless of the number of tokens an application has generated for your user. The list of OAuth applications returned matches what is shown on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized). The `scopes` returned are the union of scopes authorized for the application. For example, if an application has one token with `repo` scope and another token with `user` scope, the grant will return `["repo", "user"]`.
    */
  def listGrants(): js.Promise[Response[OauthAuthorizationsListGrantsResponse]] = js.native
  def listGrants(params: RequestOptions with OauthAuthorizationsListGrantsParams): js.Promise[Response[OauthAuthorizationsListGrantsResponse]] = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end user involvement. Applications must save the "token" property in the response, because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def resetAuthorization(): js.Promise[Response[OauthAuthorizationsResetAuthorizationResponse]] = js.native
  def resetAuthorization(params: RequestOptions with OauthAuthorizationsResetAuthorizationParams): js.Promise[Response[OauthAuthorizationsResetAuthorizationResponse]] = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`.
    */
  def revokeAuthorizationForApplication(): js.Promise[AnyResponse] = js.native
  def revokeAuthorizationForApplication(params: RequestOptions with OauthAuthorizationsRevokeAuthorizationForApplicationParams): js.Promise[AnyResponse] = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def revokeGrantForApplication(): js.Promise[AnyResponse] = js.native
  def revokeGrantForApplication(params: RequestOptions with OauthAuthorizationsRevokeGrantForApplicationParams): js.Promise[AnyResponse] = js.native
  /**
    * If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see "[Working with two-factor authentication](https://developer.github.com/v3/auth/#working-with-two-factor-authentication)."
    *
    * You can only send one of these scope keys at a time.
    */
  def updateAuthorization(): js.Promise[Response[OauthAuthorizationsUpdateAuthorizationResponse]] = js.native
  def updateAuthorization(params: RequestOptions with OauthAuthorizationsUpdateAuthorizationParams): js.Promise[Response[OauthAuthorizationsUpdateAuthorizationResponse]] = js.native
}

