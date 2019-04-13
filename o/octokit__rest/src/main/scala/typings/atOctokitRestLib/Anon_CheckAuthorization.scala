package typings
package atOctokitRestLib

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
    * If you need a small number of personal access tokens, implementing the [web flow](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/) can be cumbersome. Instead, tokens can be created using the OAuth Authorizations API using [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication). To create personal access tokens for a particular OAuth application, you must provide its client ID and secret, found on the OAuth application settings page, linked from your [OAuth applications listing on GitHub](https://github.com/settings/developers).,* ,* If your OAuth application intends to create multiple tokens for one user, use `fingerprint` to differentiate between them.,* ,* You can also create OAuth tokens through the web UI via the [personal access tokens settings](https://github.com/settings/tokens). Read more about these tokens on the [GitHub Help site](https://help.github.com/articles/creating-an-access-token-for-command-line-use).,* ,* Organizations that enforce SAML SSO require personal access tokens to be whitelisted. Read more about whitelisting tokens on the [GitHub Help site](https://help.github.com/articles/about-identity-and-access-management-with-saml-single-sign-on).
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
    */
  @JSName("getOrCreateAuthorizationForAppAndFingerprint")
  var getOrCreateAuthorizationForAppAndFingerprint_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    */
  @JSName("getOrCreateAuthorizationForAppFingerprint")
  var getOrCreateAuthorizationForAppFingerprint_Original: Anon_EndpointParamsAnyResponseOauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
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
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.,* ,* Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("revokeGrantForApplication")
  var revokeGrantForApplication_Original: Anon_EndpointParamsOauthAuthorizationsRevokeGrantForApplicationParams = js.native
  /**
    * You can only send one of these scope keys at a time.
    */
  @JSName("updateAuthorization")
  var updateAuthorization_Original: Anon_EndpointParamsOauthAuthorizationsUpdateAuthorizationParams = js.native
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without running afoul of normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def checkAuthorization(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationResponse]
  ] = js.native
  def checkAuthorization(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsCheckAuthorizationResponse]
  ] = js.native
  /**
    * If you need a small number of personal access tokens, implementing the [web flow](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/) can be cumbersome. Instead, tokens can be created using the OAuth Authorizations API using [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication). To create personal access tokens for a particular OAuth application, you must provide its client ID and secret, found on the OAuth application settings page, linked from your [OAuth applications listing on GitHub](https://github.com/settings/developers).,* ,* If your OAuth application intends to create multiple tokens for one user, use `fingerprint` to differentiate between them.,* ,* You can also create OAuth tokens through the web UI via the [personal access tokens settings](https://github.com/settings/tokens). Read more about these tokens on the [GitHub Help site](https://help.github.com/articles/creating-an-access-token-for-command-line-use).,* ,* Organizations that enforce SAML SSO require personal access tokens to be whitelisted. Read more about whitelisting tokens on the [GitHub Help site](https://help.github.com/articles/about-identity-and-access-management-with-saml-single-sign-on).
    */
  def createAuthorization(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationResponse]
  ] = js.native
  def createAuthorization(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsCreateAuthorizationResponse]
  ] = js.native
  def deleteAuthorization(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsDeleteAuthorizationResponse]
  ] = js.native
  def deleteAuthorization(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsDeleteAuthorizationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsDeleteAuthorizationResponse]
  ] = js.native
  /**
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for your user. Once deleted, the application has no access to your account and is no longer listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def deleteGrant(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsDeleteGrantResponse]
  ] = js.native
  def deleteGrant(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsDeleteGrantParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsDeleteGrantResponse]
  ] = js.native
  def getAuthorization(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetAuthorizationResponse]
  ] = js.native
  def getAuthorization(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetAuthorizationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetAuthorizationResponse]
  ] = js.native
  def getGrant(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetGrantResponse]
  ] = js.native
  def getGrant(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetGrantParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetGrantResponse]
  ] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    */
  def getOrCreateAuthorizationForApp(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getOrCreateAuthorizationForApp(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    */
  def getOrCreateAuthorizationForAppAndFingerprint(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getOrCreateAuthorizationForAppAndFingerprint(
    params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintParams
  ): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.
    */
  def getOrCreateAuthorizationForAppFingerprint(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getOrCreateAuthorizationForAppFingerprint(
    params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams
  ): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listAuthorizations(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsListAuthorizationsResponse]
  ] = js.native
  def listAuthorizations(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsListAuthorizationsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsListAuthorizationsResponse]
  ] = js.native
  /**
    * You can use this API to list the set of OAuth applications that have been granted access to your account. Unlike the [list your authorizations](https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations) API, this API does not manage individual tokens. This API will return one entry for each OAuth application that has been granted access to your account, regardless of the number of tokens an application has generated for your user. The list of OAuth applications returned matches what is shown on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized). The `scopes` returned are the union of scopes authorized for the application. For example, if an application has one token with `repo` scope and another token with `user` scope, the grant will return `["repo", "user"]`.
    */
  def listGrants(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsListGrantsResponse]
  ] = js.native
  def listGrants(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsListGrantsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsListGrantsResponse]
  ] = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end user involvement. Applications must save the "token" property in the response, because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing it, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def resetAuthorization(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsResetAuthorizationResponse]
  ] = js.native
  def resetAuthorization(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsResetAuthorizationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsResetAuthorizationResponse]
  ] = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`.
    */
  def revokeAuthorizationForApplication(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsRevokeAuthorizationForApplicationResponse
    ]
  ] = js.native
  def revokeAuthorizationForApplication(
    params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsRevokeAuthorizationForApplicationParams
  ): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsRevokeAuthorizationForApplicationResponse
    ]
  ] = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) for this method, where the username is the OAuth application `client_id` and the password is its `client_secret`. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.,* ,* Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def revokeGrantForApplication(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsRevokeGrantForApplicationResponse
    ]
  ] = js.native
  def revokeGrantForApplication(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsRevokeGrantForApplicationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsRevokeGrantForApplicationResponse
    ]
  ] = js.native
  /**
    * You can only send one of these scope keys at a time.
    */
  def updateAuthorization(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationResponse]
  ] = js.native
  def updateAuthorization(params: atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.OauthAuthorizationsUpdateAuthorizationResponse]
  ] = js.native
}

