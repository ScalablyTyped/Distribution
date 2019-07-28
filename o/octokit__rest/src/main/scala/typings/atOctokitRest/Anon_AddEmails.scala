package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.Response
import typings.atOctokitRest.atOctokitRestMod.UsersAddEmailsParams
import typings.atOctokitRest.atOctokitRestMod.UsersAddEmailsResponse
import typings.atOctokitRest.atOctokitRestMod.UsersBlockParams
import typings.atOctokitRest.atOctokitRestMod.UsersBlockResponse
import typings.atOctokitRest.atOctokitRestMod.UsersCheckBlockedParams
import typings.atOctokitRest.atOctokitRestMod.UsersCheckBlockedResponse
import typings.atOctokitRest.atOctokitRestMod.UsersCheckFollowingForUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersCheckFollowingParams
import typings.atOctokitRest.atOctokitRestMod.UsersCreateGpgKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersCreateGpgKeyResponse
import typings.atOctokitRest.atOctokitRestMod.UsersCreatePublicKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersCreatePublicKeyResponse
import typings.atOctokitRest.atOctokitRestMod.UsersDeleteEmailsParams
import typings.atOctokitRest.atOctokitRestMod.UsersDeleteEmailsResponse
import typings.atOctokitRest.atOctokitRestMod.UsersDeleteGpgKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersDeleteGpgKeyResponse
import typings.atOctokitRest.atOctokitRestMod.UsersDeletePublicKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersDeletePublicKeyResponse
import typings.atOctokitRest.atOctokitRestMod.UsersFollowParams
import typings.atOctokitRest.atOctokitRestMod.UsersFollowResponse
import typings.atOctokitRest.atOctokitRestMod.UsersGetByUsernameParams
import typings.atOctokitRest.atOctokitRestMod.UsersGetByUsernameResponse
import typings.atOctokitRest.atOctokitRestMod.UsersGetContextForUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersGetContextForUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersGetGpgKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersGetGpgKeyResponse
import typings.atOctokitRest.atOctokitRestMod.UsersGetPublicKeyParams
import typings.atOctokitRest.atOctokitRestMod.UsersGetPublicKeyResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListBlockedResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListEmailsParams
import typings.atOctokitRest.atOctokitRestMod.UsersListEmailsResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowersForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowersForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowersForUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowersForUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowingForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowingForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowingForUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersListFollowingForUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListGpgKeysForUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersListGpgKeysForUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListGpgKeysParams
import typings.atOctokitRest.atOctokitRestMod.UsersListGpgKeysResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListParams
import typings.atOctokitRest.atOctokitRestMod.UsersListPublicEmailsParams
import typings.atOctokitRest.atOctokitRestMod.UsersListPublicEmailsResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListPublicKeysForUserParams
import typings.atOctokitRest.atOctokitRestMod.UsersListPublicKeysForUserResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListPublicKeysParams
import typings.atOctokitRest.atOctokitRestMod.UsersListPublicKeysResponse
import typings.atOctokitRest.atOctokitRestMod.UsersListResponse
import typings.atOctokitRest.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityParams
import typings.atOctokitRest.atOctokitRestMod.UsersTogglePrimaryEmailVisibilityResponse
import typings.atOctokitRest.atOctokitRestMod.UsersUnblockParams
import typings.atOctokitRest.atOctokitRestMod.UsersUnblockResponse
import typings.atOctokitRest.atOctokitRestMod.UsersUnfollowParams
import typings.atOctokitRest.atOctokitRestMod.UsersUnfollowResponse
import typings.atOctokitRest.atOctokitRestMod.UsersUpdateAuthenticatedParams
import typings.atOctokitRest.atOctokitRestMod.UsersUpdateAuthenticatedResponse
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
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
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
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
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
  def addEmails(): js.Promise[Response[UsersAddEmailsResponse]] = js.native
  def addEmails(params: UsersAddEmailsParams): js.Promise[Response[UsersAddEmailsResponse]] = js.native
  def block(): js.Promise[Response[UsersBlockResponse]] = js.native
  def block(params: UsersBlockParams): js.Promise[Response[UsersBlockResponse]] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlocked(): js.Promise[Response[UsersCheckBlockedResponse]] = js.native
  def checkBlocked(params: UsersCheckBlockedParams): js.Promise[Response[UsersCheckBlockedResponse]] = js.native
  def checkFollowing(): js.Promise[AnyResponse] = js.native
  def checkFollowing(params: UsersCheckFollowingParams): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(params: UsersCheckFollowingForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKey(): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  def createGpgKey(params: UsersCreateGpgKeyParams): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicKey(): js.Promise[Response[UsersCreatePublicKeyResponse]] = js.native
  def createPublicKey(params: UsersCreatePublicKeyParams): js.Promise[Response[UsersCreatePublicKeyResponse]] = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def deleteEmails(): js.Promise[Response[UsersDeleteEmailsResponse]] = js.native
  def deleteEmails(params: UsersDeleteEmailsParams): js.Promise[Response[UsersDeleteEmailsResponse]] = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKey(): js.Promise[Response[UsersDeleteGpgKeyResponse]] = js.native
  def deleteGpgKey(params: UsersDeleteGpgKeyParams): js.Promise[Response[UsersDeleteGpgKeyResponse]] = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicKey(): js.Promise[Response[UsersDeletePublicKeyResponse]] = js.native
  def deletePublicKey(params: UsersDeletePublicKeyParams): js.Promise[Response[UsersDeletePublicKeyResponse]] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[Response[UsersFollowResponse]] = js.native
  def follow(params: UsersFollowParams): js.Promise[Response[UsersFollowResponse]] = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  def getAuthenticated(): js.Promise[AnyResponse] = js.native
  def getAuthenticated(params: EmptyParams): js.Promise[AnyResponse] = js.native
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  def getByUsername(): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  def getByUsername(params: UsersGetByUsernameParams): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  def getContextForUser(): js.Promise[Response[UsersGetContextForUserResponse]] = js.native
  def getContextForUser(params: UsersGetContextForUserParams): js.Promise[Response[UsersGetContextForUserResponse]] = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKey(): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  def getGpgKey(params: UsersGetGpgKeyParams): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicKey(): js.Promise[Response[UsersGetPublicKeyResponse]] = js.native
  def getPublicKey(params: UsersGetPublicKeyParams): js.Promise[Response[UsersGetPublicKeyResponse]] = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  def list(): js.Promise[Response[UsersListResponse]] = js.native
  def list(params: UsersListParams): js.Promise[Response[UsersListResponse]] = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  def listBlocked(): js.Promise[Response[UsersListBlockedResponse]] = js.native
  def listBlocked(params: EmptyParams): js.Promise[Response[UsersListBlockedResponse]] = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  def listEmails(): js.Promise[Response[UsersListEmailsResponse]] = js.native
  def listEmails(params: UsersListEmailsParams): js.Promise[Response[UsersListEmailsResponse]] = js.native
  def listFollowersForAuthenticatedUser(): js.Promise[Response[UsersListFollowersForAuthenticatedUserResponse]] = js.native
  def listFollowersForAuthenticatedUser(params: UsersListFollowersForAuthenticatedUserParams): js.Promise[Response[UsersListFollowersForAuthenticatedUserResponse]] = js.native
  def listFollowersForUser(): js.Promise[Response[UsersListFollowersForUserResponse]] = js.native
  def listFollowersForUser(params: UsersListFollowersForUserParams): js.Promise[Response[UsersListFollowersForUserResponse]] = js.native
  def listFollowingForAuthenticatedUser(): js.Promise[Response[UsersListFollowingForAuthenticatedUserResponse]] = js.native
  def listFollowingForAuthenticatedUser(params: UsersListFollowingForAuthenticatedUserParams): js.Promise[Response[UsersListFollowingForAuthenticatedUserResponse]] = js.native
  def listFollowingForUser(): js.Promise[Response[UsersListFollowingForUserResponse]] = js.native
  def listFollowingForUser(params: UsersListFollowingForUserParams): js.Promise[Response[UsersListFollowingForUserResponse]] = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeys(): js.Promise[Response[UsersListGpgKeysResponse]] = js.native
  def listGpgKeys(params: UsersListGpgKeysParams): js.Promise[Response[UsersListGpgKeysResponse]] = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[Response[UsersListGpgKeysForUserResponse]] = js.native
  def listGpgKeysForUser(params: UsersListGpgKeysForUserParams): js.Promise[Response[UsersListGpgKeysForUserResponse]] = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmails(): js.Promise[Response[UsersListPublicEmailsResponse]] = js.native
  def listPublicEmails(params: UsersListPublicEmailsParams): js.Promise[Response[UsersListPublicEmailsResponse]] = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicKeys(): js.Promise[Response[UsersListPublicKeysResponse]] = js.native
  def listPublicKeys(params: UsersListPublicKeysParams): js.Promise[Response[UsersListPublicKeysResponse]] = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[Response[UsersListPublicKeysForUserResponse]] = js.native
  def listPublicKeysForUser(params: UsersListPublicKeysForUserParams): js.Promise[Response[UsersListPublicKeysForUserResponse]] = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  def togglePrimaryEmailVisibility(): js.Promise[Response[UsersTogglePrimaryEmailVisibilityResponse]] = js.native
  def togglePrimaryEmailVisibility(params: UsersTogglePrimaryEmailVisibilityParams): js.Promise[Response[UsersTogglePrimaryEmailVisibilityResponse]] = js.native
  def unblock(): js.Promise[Response[UsersUnblockResponse]] = js.native
  def unblock(params: UsersUnblockParams): js.Promise[Response[UsersUnblockResponse]] = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[Response[UsersUnfollowResponse]] = js.native
  def unfollow(params: UsersUnfollowParams): js.Promise[Response[UsersUnfollowResponse]] = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  def updateAuthenticated(): js.Promise[Response[UsersUpdateAuthenticatedResponse]] = js.native
  def updateAuthenticated(params: UsersUpdateAuthenticatedParams): js.Promise[Response[UsersUpdateAuthenticatedResponse]] = js.native
}

