package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddEmails extends js.Object {
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("addEmails")
  var addEmails_Original: Anon_EndpointParamsPromiseResponseUsersAddEmailsParams = js.native
  @JSName("block")
  var block_Original: Anon_EndpointParamsPromiseResponseUsersBlockParams = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlocked")
  var checkBlocked_Original: Anon_EndpointParamsPromiseResponseUsersCheckBlockedParams = js.native
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: Anon_EndpointParamsAnyResponsePromiseUsersCheckFollowingForUserParams = js.native
  @JSName("checkFollowing")
  var checkFollowing_Original: Anon_EndpointParamsAnyResponsePromiseUsersCheckFollowingParams = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKey")
  var createGpgKey_Original: Anon_EndpointParamsPromiseResponseUsersCreateGpgKeyParams = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicKey")
  var createPublicKey_Original: Anon_EndpointParamsPromiseResponseUsersCreatePublicKeyParams = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("deleteEmails")
  var deleteEmails_Original: Anon_EndpointParamsPromiseResponseUsersDeleteEmailsParams = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKey")
  var deleteGpgKey_Original: Anon_EndpointParamsPromiseResponseUsersDeleteGpgKeyParams = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicKey")
  var deletePublicKey_Original: Anon_EndpointParamsPromiseResponseUsersDeletePublicKeyParams = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: Anon_EndpointParamsPromiseResponseUsersFollowParams = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: Anon_EndpointParamsAnyResponseEmptyParams = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  @JSName("getByUsername")
  var getByUsername_Original: Anon_EndpointParamsPromiseResponseUsersGetByUsernameParams = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  @JSName("getContextForUser")
  var getContextForUser_Original: Anon_EndpointParamsPromiseResponseUsersGetContextForUserParams = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKey")
  var getGpgKey_Original: Anon_EndpointParamsPromiseResponseUsersGetGpgKeyParams = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: Anon_EndpointParamsPromiseResponseUsersGetPublicKeyParams = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  @JSName("listBlocked")
  var listBlocked_Original: Anon_EndpointParamsEmptyParamsPromiseResponse = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listEmails")
  var listEmails_Original: Anon_EndpointParamsPromiseResponseUsersListEmailsParams = js.native
  @JSName("listFollowersForAuthenticatedUser")
  var listFollowersForAuthenticatedUser_Original: Anon_EndpointParamsPromiseResponseUsersListFollowersForAuthenticatedUserParams = js.native
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: Anon_EndpointParamsPromiseResponseUsersListFollowersForUserParams = js.native
  @JSName("listFollowingForAuthenticatedUser")
  var listFollowingForAuthenticatedUser_Original: Anon_EndpointParamsPromiseResponseUsersListFollowingForAuthenticatedUserParams = js.native
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: Anon_EndpointParamsPromiseResponseUsersListFollowingForUserParams = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: Anon_EndpointParamsPromiseResponseUsersListGpgKeysForUserParams = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeys")
  var listGpgKeys_Original: Anon_EndpointParamsPromiseResponseUsersListGpgKeysParams = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmails")
  var listPublicEmails_Original: Anon_EndpointParamsPromiseResponseUsersListPublicEmailsParams = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: Anon_EndpointParamsPromiseResponseUsersListPublicKeysForUserParams = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicKeys")
  var listPublicKeys_Original: Anon_EndpointParamsPromiseResponseUsersListPublicKeysParams = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: Anon_EndpointParamsPromiseResponseUsersListParams = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  @JSName("togglePrimaryEmailVisibility")
  var togglePrimaryEmailVisibility_Original: Anon_EndpointParamsPromiseResponseUsersTogglePrimaryEmailVisibilityParams = js.native
  @JSName("unblock")
  var unblock_Original: Anon_EndpointParamsPromiseResponseUsersUnblockParams = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: Anon_EndpointParamsPromiseResponseUsersUnfollowParams = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  @JSName("updateAuthenticated")
  var updateAuthenticated_Original: Anon_EndpointParamsPromiseResponseUsersUpdateAuthenticatedParams = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def addEmails(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersAddEmailsResponse]
  ] = js.native
  def addEmails(params: atOctokitRestLib.atOctokitRestMod.UsersAddEmailsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersAddEmailsResponse]
  ] = js.native
  def block(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersBlockResponse]
  ] = js.native
  def block(params: atOctokitRestLib.atOctokitRestMod.UsersBlockParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersBlockResponse]
  ] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlocked(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersCheckBlockedResponse]
  ] = js.native
  def checkBlocked(params: atOctokitRestLib.atOctokitRestMod.UsersCheckBlockedParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersCheckBlockedResponse]
  ] = js.native
  def checkFollowing(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkFollowing(params: atOctokitRestLib.atOctokitRestMod.UsersCheckFollowingParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkFollowingForUser(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkFollowingForUser(params: atOctokitRestLib.atOctokitRestMod.UsersCheckFollowingForUserParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersCreateGpgKeyResponse]
  ] = js.native
  def createGpgKey(params: atOctokitRestLib.atOctokitRestMod.UsersCreateGpgKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersCreateGpgKeyResponse]
  ] = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersCreatePublicKeyResponse]
  ] = js.native
  def createPublicKey(params: atOctokitRestLib.atOctokitRestMod.UsersCreatePublicKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersCreatePublicKeyResponse]
  ] = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def deleteEmails(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersDeleteEmailsResponse]
  ] = js.native
  def deleteEmails(params: atOctokitRestLib.atOctokitRestMod.UsersDeleteEmailsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersDeleteEmailsResponse]
  ] = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersDeleteGpgKeyResponse]
  ] = js.native
  def deleteGpgKey(params: atOctokitRestLib.atOctokitRestMod.UsersDeleteGpgKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersDeleteGpgKeyResponse]
  ] = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersDeletePublicKeyResponse]
  ] = js.native
  def deletePublicKey(params: atOctokitRestLib.atOctokitRestMod.UsersDeletePublicKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersDeletePublicKeyResponse]
  ] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersFollowResponse]
  ] = js.native
  def follow(params: atOctokitRestLib.atOctokitRestMod.UsersFollowParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersFollowResponse]
  ] = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  def getAuthenticated(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getAuthenticated(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  def getByUsername(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetByUsernameResponse]
  ] = js.native
  def getByUsername(params: atOctokitRestLib.atOctokitRestMod.UsersGetByUsernameParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetByUsernameResponse]
  ] = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  def getContextForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetContextForUserResponse]
  ] = js.native
  def getContextForUser(params: atOctokitRestLib.atOctokitRestMod.UsersGetContextForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetContextForUserResponse]
  ] = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetGpgKeyResponse]
  ] = js.native
  def getGpgKey(params: atOctokitRestLib.atOctokitRestMod.UsersGetGpgKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetGpgKeyResponse]
  ] = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetPublicKeyResponse]
  ] = js.native
  def getPublicKey(params: atOctokitRestLib.atOctokitRestMod.UsersGetPublicKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersGetPublicKeyResponse]
  ] = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  def list(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListResponse]
  ] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.UsersListParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListResponse]
  ] = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  def listBlocked(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListBlockedResponse]
  ] = js.native
  def listBlocked(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListBlockedResponse]
  ] = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  def listEmails(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListEmailsResponse]
  ] = js.native
  def listEmails(params: atOctokitRestLib.atOctokitRestMod.UsersListEmailsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListEmailsResponse]
  ] = js.native
  def listFollowersForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowersForAuthenticatedUserResponse]
  ] = js.native
  def listFollowersForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.UsersListFollowersForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowersForAuthenticatedUserResponse]
  ] = js.native
  def listFollowersForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowersForUserResponse]
  ] = js.native
  def listFollowersForUser(params: atOctokitRestLib.atOctokitRestMod.UsersListFollowersForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowersForUserResponse]
  ] = js.native
  def listFollowingForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowingForAuthenticatedUserResponse]
  ] = js.native
  def listFollowingForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.UsersListFollowingForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowingForAuthenticatedUserResponse]
  ] = js.native
  def listFollowingForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowingForUserResponse]
  ] = js.native
  def listFollowingForUser(params: atOctokitRestLib.atOctokitRestMod.UsersListFollowingForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListFollowingForUserResponse]
  ] = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeys(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListGpgKeysResponse]
  ] = js.native
  def listGpgKeys(params: atOctokitRestLib.atOctokitRestMod.UsersListGpgKeysParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListGpgKeysResponse]
  ] = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListGpgKeysForUserResponse]
  ] = js.native
  def listGpgKeysForUser(params: atOctokitRestLib.atOctokitRestMod.UsersListGpgKeysForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListGpgKeysForUserResponse]
  ] = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmails(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListPublicEmailsResponse]
  ] = js.native
  def listPublicEmails(params: atOctokitRestLib.atOctokitRestMod.UsersListPublicEmailsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListPublicEmailsResponse]
  ] = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicKeys(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListPublicKeysResponse]
  ] = js.native
  def listPublicKeys(params: atOctokitRestLib.atOctokitRestMod.UsersListPublicKeysParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListPublicKeysResponse]
  ] = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListPublicKeysForUserResponse]
  ] = js.native
  def listPublicKeysForUser(params: atOctokitRestLib.atOctokitRestMod.UsersListPublicKeysForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersListPublicKeysForUserResponse]
  ] = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  def togglePrimaryEmailVisibility(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityResponse]
  ] = js.native
  def togglePrimaryEmailVisibility(params: atOctokitRestLib.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityResponse]
  ] = js.native
  def unblock(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersUnblockResponse]
  ] = js.native
  def unblock(params: atOctokitRestLib.atOctokitRestMod.UsersUnblockParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersUnblockResponse]
  ] = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersUnfollowResponse]
  ] = js.native
  def unfollow(params: atOctokitRestLib.atOctokitRestMod.UsersUnfollowParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersUnfollowResponse]
  ] = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  def updateAuthenticated(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersUpdateAuthenticatedResponse]
  ] = js.native
  def updateAuthenticated(params: atOctokitRestLib.atOctokitRestMod.UsersUpdateAuthenticatedParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.UsersUpdateAuthenticatedResponse]
  ] = js.native
}

