package typings.octokitRest

import typings.octokitRest.mod.AnyResponse
import typings.octokitRest.mod.EmptyParams
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import typings.octokitRest.mod.UsersAddEmailsParams
import typings.octokitRest.mod.UsersAddEmailsResponse
import typings.octokitRest.mod.UsersBlockParams
import typings.octokitRest.mod.UsersCheckBlockedParams
import typings.octokitRest.mod.UsersCheckFollowingForUserParams
import typings.octokitRest.mod.UsersCheckFollowingParams
import typings.octokitRest.mod.UsersCreateGpgKeyParams
import typings.octokitRest.mod.UsersCreateGpgKeyResponse
import typings.octokitRest.mod.UsersCreatePublicKeyParams
import typings.octokitRest.mod.UsersCreatePublicKeyResponse
import typings.octokitRest.mod.UsersDeleteEmailsParams
import typings.octokitRest.mod.UsersDeleteGpgKeyParams
import typings.octokitRest.mod.UsersDeletePublicKeyParams
import typings.octokitRest.mod.UsersFollowParams
import typings.octokitRest.mod.UsersGetAuthenticatedResponse
import typings.octokitRest.mod.UsersGetByUsernameParams
import typings.octokitRest.mod.UsersGetByUsernameResponse
import typings.octokitRest.mod.UsersGetContextForUserParams
import typings.octokitRest.mod.UsersGetContextForUserResponse
import typings.octokitRest.mod.UsersGetGpgKeyParams
import typings.octokitRest.mod.UsersGetGpgKeyResponse
import typings.octokitRest.mod.UsersGetPublicKeyParams
import typings.octokitRest.mod.UsersGetPublicKeyResponse
import typings.octokitRest.mod.UsersListBlockedResponse
import typings.octokitRest.mod.UsersListEmailsParams
import typings.octokitRest.mod.UsersListEmailsResponse
import typings.octokitRest.mod.UsersListFollowersForAuthenticatedUserParams
import typings.octokitRest.mod.UsersListFollowersForAuthenticatedUserResponse
import typings.octokitRest.mod.UsersListFollowersForUserParams
import typings.octokitRest.mod.UsersListFollowersForUserResponse
import typings.octokitRest.mod.UsersListFollowingForAuthenticatedUserParams
import typings.octokitRest.mod.UsersListFollowingForAuthenticatedUserResponse
import typings.octokitRest.mod.UsersListFollowingForUserParams
import typings.octokitRest.mod.UsersListFollowingForUserResponse
import typings.octokitRest.mod.UsersListGpgKeysForUserParams
import typings.octokitRest.mod.UsersListGpgKeysForUserResponse
import typings.octokitRest.mod.UsersListGpgKeysParams
import typings.octokitRest.mod.UsersListGpgKeysResponse
import typings.octokitRest.mod.UsersListParams
import typings.octokitRest.mod.UsersListPublicEmailsParams
import typings.octokitRest.mod.UsersListPublicEmailsResponse
import typings.octokitRest.mod.UsersListPublicKeysForUserParams
import typings.octokitRest.mod.UsersListPublicKeysForUserResponse
import typings.octokitRest.mod.UsersListPublicKeysParams
import typings.octokitRest.mod.UsersListPublicKeysResponse
import typings.octokitRest.mod.UsersListResponse
import typings.octokitRest.mod.UsersTogglePrimaryEmailVisibilityParams
import typings.octokitRest.mod.UsersTogglePrimaryEmailVisibilityResponse
import typings.octokitRest.mod.UsersUnblockParams
import typings.octokitRest.mod.UsersUnfollowParams
import typings.octokitRest.mod.UsersUpdateAuthenticatedParams
import typings.octokitRest.mod.UsersUpdateAuthenticatedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddEmails extends js.Object {
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("addEmails")
  var addEmails_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersAddEmailsParams = js.native
  @JSName("block")
  var block_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersBlockParams = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlocked")
  var checkBlocked_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersCheckBlockedParams = js.native
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersCheckFollowingForUserParams = js.native
  @JSName("checkFollowing")
  var checkFollowing_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersCheckFollowingParams = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKey")
  var createGpgKey_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersCreateGpgKeyParams = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicKey")
  var createPublicKey_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersCreatePublicKeyParams = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("deleteEmails")
  var deleteEmails_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersDeleteEmailsParams = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKey")
  var deleteGpgKey_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersDeleteGpgKeyParams = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicKey")
  var deletePublicKey_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersDeletePublicKeyParams = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersFollowParams = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: AnonEndpointParamsEmptyParamsPromiseRequestOptions = js.native
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
  var getByUsername_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersGetByUsernameParams = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  @JSName("getContextForUser")
  var getContextForUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersGetContextForUserParams = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKey")
  var getGpgKey_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersGetGpgKeyParams = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersGetPublicKeyParams = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  @JSName("listBlocked")
  var listBlocked_Original: AnonEndpointParamsEmptyParamsPromiseRequestOptionsResponse = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listEmails")
  var listEmails_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListEmailsParams = js.native
  @JSName("listFollowersForAuthenticatedUser")
  var listFollowersForAuthenticatedUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListFollowersForAuthenticatedUserParams = js.native
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListFollowersForUserParams = js.native
  @JSName("listFollowingForAuthenticatedUser")
  var listFollowingForAuthenticatedUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListFollowingForAuthenticatedUserParams = js.native
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListFollowingForUserParams = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListGpgKeysForUserParams = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeys")
  var listGpgKeys_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListGpgKeysParams = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmails")
  var listPublicEmails_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListPublicEmailsParams = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListPublicKeysForUserParams = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicKeys")
  var listPublicKeys_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListPublicKeysParams = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersListParams = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  @JSName("togglePrimaryEmailVisibility")
  var togglePrimaryEmailVisibility_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersTogglePrimaryEmailVisibilityParams = js.native
  @JSName("unblock")
  var unblock_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersUnblockParams = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: AnonEndpointParamsAnyResponsePromiseRequestOptionsUsersUnfollowParams = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  @JSName("updateAuthenticated")
  var updateAuthenticated_Original: AnonEndpointParamsPromiseRequestOptionsResponseUsersUpdateAuthenticatedParams = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def addEmails(): js.Promise[Response[UsersAddEmailsResponse]] = js.native
  def addEmails(params: RequestOptions with UsersAddEmailsParams): js.Promise[Response[UsersAddEmailsResponse]] = js.native
  def block(): js.Promise[AnyResponse] = js.native
  def block(params: RequestOptions with UsersBlockParams): js.Promise[AnyResponse] = js.native
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlocked(): js.Promise[AnyResponse] = js.native
  def checkBlocked(params: RequestOptions with UsersCheckBlockedParams): js.Promise[AnyResponse] = js.native
  def checkFollowing(): js.Promise[AnyResponse] = js.native
  def checkFollowing(params: RequestOptions with UsersCheckFollowingParams): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(): js.Promise[AnyResponse] = js.native
  def checkFollowingForUser(params: RequestOptions with UsersCheckFollowingForUserParams): js.Promise[AnyResponse] = js.native
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKey(): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  def createGpgKey(params: RequestOptions with UsersCreateGpgKeyParams): js.Promise[Response[UsersCreateGpgKeyResponse]] = js.native
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicKey(): js.Promise[Response[UsersCreatePublicKeyResponse]] = js.native
  def createPublicKey(params: RequestOptions with UsersCreatePublicKeyParams): js.Promise[Response[UsersCreatePublicKeyResponse]] = js.native
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def deleteEmails(): js.Promise[AnyResponse] = js.native
  def deleteEmails(params: RequestOptions with UsersDeleteEmailsParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKey(): js.Promise[AnyResponse] = js.native
  def deleteGpgKey(params: RequestOptions with UsersDeleteGpgKeyParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicKey(): js.Promise[AnyResponse] = js.native
  def deletePublicKey(params: RequestOptions with UsersDeletePublicKeyParams): js.Promise[AnyResponse] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[AnyResponse] = js.native
  def follow(params: RequestOptions with UsersFollowParams): js.Promise[AnyResponse] = js.native
  /**
    * Lists public and private profile information when authenticated through basic auth or OAuth with the `user` scope.
    *
    * Lists public profile information when authenticated through OAuth without the `user` scope.
    */
  def getAuthenticated(): js.Promise[Response[UsersGetAuthenticatedResponse]] = js.native
  def getAuthenticated(params: RequestOptions with EmptyParams): js.Promise[Response[UsersGetAuthenticatedResponse]] = js.native
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
  def getByUsername(params: RequestOptions with UsersGetByUsernameParams): js.Promise[Response[UsersGetByUsernameResponse]] = js.native
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    */
  def getContextForUser(): js.Promise[Response[UsersGetContextForUserResponse]] = js.native
  def getContextForUser(params: RequestOptions with UsersGetContextForUserParams): js.Promise[Response[UsersGetContextForUserResponse]] = js.native
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKey(): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  def getGpgKey(params: RequestOptions with UsersGetGpgKeyParams): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicKey(): js.Promise[Response[UsersGetPublicKeyResponse]] = js.native
  def getPublicKey(params: RequestOptions with UsersGetPublicKeyParams): js.Promise[Response[UsersGetPublicKeyResponse]] = js.native
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  def list(): js.Promise[Response[UsersListResponse]] = js.native
  def list(params: RequestOptions with UsersListParams): js.Promise[Response[UsersListResponse]] = js.native
  /**
    * List the users you've blocked on your personal account.
    */
  def listBlocked(): js.Promise[Response[UsersListBlockedResponse]] = js.native
  def listBlocked(params: RequestOptions with EmptyParams): js.Promise[Response[UsersListBlockedResponse]] = js.native
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  def listEmails(): js.Promise[Response[UsersListEmailsResponse]] = js.native
  def listEmails(params: RequestOptions with UsersListEmailsParams): js.Promise[Response[UsersListEmailsResponse]] = js.native
  def listFollowersForAuthenticatedUser(): js.Promise[Response[UsersListFollowersForAuthenticatedUserResponse]] = js.native
  def listFollowersForAuthenticatedUser(params: RequestOptions with UsersListFollowersForAuthenticatedUserParams): js.Promise[Response[UsersListFollowersForAuthenticatedUserResponse]] = js.native
  def listFollowersForUser(): js.Promise[Response[UsersListFollowersForUserResponse]] = js.native
  def listFollowersForUser(params: RequestOptions with UsersListFollowersForUserParams): js.Promise[Response[UsersListFollowersForUserResponse]] = js.native
  def listFollowingForAuthenticatedUser(): js.Promise[Response[UsersListFollowingForAuthenticatedUserResponse]] = js.native
  def listFollowingForAuthenticatedUser(params: RequestOptions with UsersListFollowingForAuthenticatedUserParams): js.Promise[Response[UsersListFollowingForAuthenticatedUserResponse]] = js.native
  def listFollowingForUser(): js.Promise[Response[UsersListFollowingForUserResponse]] = js.native
  def listFollowingForUser(params: RequestOptions with UsersListFollowingForUserParams): js.Promise[Response[UsersListFollowingForUserResponse]] = js.native
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeys(): js.Promise[Response[UsersListGpgKeysResponse]] = js.native
  def listGpgKeys(params: RequestOptions with UsersListGpgKeysParams): js.Promise[Response[UsersListGpgKeysResponse]] = js.native
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[Response[UsersListGpgKeysForUserResponse]] = js.native
  def listGpgKeysForUser(params: RequestOptions with UsersListGpgKeysForUserParams): js.Promise[Response[UsersListGpgKeysForUserResponse]] = js.native
  /**
    * Lists your publicly visible email address, which you can set with the [Toggle primary email visibility](https://developer.github.com/v3/users/emails/#toggle-primary-email-visibility) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmails(): js.Promise[Response[UsersListPublicEmailsResponse]] = js.native
  def listPublicEmails(params: RequestOptions with UsersListPublicEmailsParams): js.Promise[Response[UsersListPublicEmailsResponse]] = js.native
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicKeys(): js.Promise[Response[UsersListPublicKeysResponse]] = js.native
  def listPublicKeys(params: RequestOptions with UsersListPublicKeysParams): js.Promise[Response[UsersListPublicKeysResponse]] = js.native
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[Response[UsersListPublicKeysForUserResponse]] = js.native
  def listPublicKeysForUser(params: RequestOptions with UsersListPublicKeysForUserParams): js.Promise[Response[UsersListPublicKeysForUserResponse]] = js.native
  /**
    * Sets the visibility for your primary email addresses.
    */
  def togglePrimaryEmailVisibility(): js.Promise[Response[UsersTogglePrimaryEmailVisibilityResponse]] = js.native
  def togglePrimaryEmailVisibility(params: RequestOptions with UsersTogglePrimaryEmailVisibilityParams): js.Promise[Response[UsersTogglePrimaryEmailVisibilityResponse]] = js.native
  def unblock(): js.Promise[AnyResponse] = js.native
  def unblock(params: RequestOptions with UsersUnblockParams): js.Promise[AnyResponse] = js.native
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[AnyResponse] = js.native
  def unfollow(params: RequestOptions with UsersUnfollowParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  def updateAuthenticated(): js.Promise[Response[UsersUpdateAuthenticatedResponse]] = js.native
  def updateAuthenticated(params: RequestOptions with UsersUpdateAuthenticatedParams): js.Promise[Response[UsersUpdateAuthenticatedResponse]] = js.native
}

