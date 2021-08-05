package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEmailForAuthenticated extends StObject {
  
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def addEmailForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/emails']['response'] */ js.Any
  ]
  def addEmailForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/emails']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/emails']['response'] */ js.Any
  ]
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("addEmailForAuthenticated")
  var addEmailForAuthenticated_Original: `515`
  
  def block(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/blocks/:username']['response'] */ js.Any
  ]
  def block(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/blocks/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/blocks/:username']['response'] */ js.Any
  ]
  @JSName("block")
  var block_Original: `516`
  
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  def checkBlocked(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks/:username']['response'] */ js.Any
  ]
  def checkBlocked(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks/:username']['response'] */ js.Any
  ]
  /**
    * If the user is blocked:
    *
    * If the user is not blocked:
    */
  @JSName("checkBlocked")
  var checkBlocked_Original: `517`
  
  def checkFollowingForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/following/:target_user']['response'] */ js.Any
  ]
  def checkFollowingForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/following/:target_user']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/following/:target_user']['response'] */ js.Any
  ]
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: `518`
  
  def checkPersonIsFollowedByAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following/:username']['response'] */ js.Any
  ]
  def checkPersonIsFollowedByAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following/:username']['response'] */ js.Any
  ]
  @JSName("checkPersonIsFollowedByAuthenticated")
  var checkPersonIsFollowedByAuthenticated_Original: `519`
  
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/gpg_keys']['response'] */ js.Any
  ]
  def createGpgKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/gpg_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/gpg_keys']['response'] */ js.Any
  ]
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKeyForAuthenticated")
  var createGpgKeyForAuthenticated_Original: `520`
  
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicSshKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/keys']['response'] */ js.Any
  ]
  def createPublicSshKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/keys']['response'] */ js.Any
  ]
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicSshKeyForAuthenticated")
  var createPublicSshKeyForAuthenticated_Original: `521`
  
  /**
    * This endpoint is accessible with the `user` scope.
    */
  def deleteEmailForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/emails']['response'] */ js.Any
  ]
  def deleteEmailForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/emails']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/emails']['response'] */ js.Any
  ]
  /**
    * This endpoint is accessible with the `user` scope.
    */
  @JSName("deleteEmailForAuthenticated")
  var deleteEmailForAuthenticated_Original: `522`
  
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/:gpg_key_id']['response'] */ js.Any
  ]
  def deleteGpgKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/:gpg_key_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/:gpg_key_id']['response'] */ js.Any
  ]
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKeyForAuthenticated")
  var deleteGpgKeyForAuthenticated_Original: `523`
  
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicSshKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/:key_id']['response'] */ js.Any
  ]
  def deletePublicSshKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/:key_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/:key_id']['response'] */ js.Any
  ]
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicSshKeyForAuthenticated")
  var deletePublicSshKeyForAuthenticated_Original: `524`
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/following/:username']['response'] */ js.Any
  ]
  def follow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/following/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/following/:username']['response'] */ js.Any
  ]
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: `525`
  
  /**
    * If the authenticated user is authenticated through basic authentication or OAuth with the `user` scope, then the response lists public and private profile information.
    *
    * If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.
    */
  def getAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user']['response'] */ js.Any
  ]
  def getAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user']['response'] */ js.Any
  ]
  /**
    * If the authenticated user is authenticated through basic authentication or OAuth with the `user` scope, then the response lists public and private profile information.
    *
    * If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: `526`
  
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/users/#response-with-github-plan-information)."
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://developer.github.com/v3/#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://developer.github.com/v3/users/emails/)".
    */
  def getByUsername(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username']['response'] */ js.Any
  ]
  def getByUsername(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username']['response'] */ js.Any
  ]
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
  var getByUsername_Original: `527`
  
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    *
    * ```shell
    *  curl -u username:token
    *   https://api.github.com/users/octocat/hovercard?subject_type=repository&subject_id=1300192
    * ```
    */
  def getContextForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/hovercard']['response'] */ js.Any
  ]
  def getContextForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/hovercard']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/hovercard']['response'] */ js.Any
  ]
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    *
    * ```shell
    *  curl -u username:token
    *   https://api.github.com/users/octocat/hovercard?subject_type=repository&subject_id=1300192
    * ```
    */
  @JSName("getContextForUser")
  var getContextForUser_Original: `528`
  
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/:gpg_key_id']['response'] */ js.Any
  ]
  def getGpgKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/:gpg_key_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/:gpg_key_id']['response'] */ js.Any
  ]
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKeyForAuthenticated")
  var getGpgKeyForAuthenticated_Original: `529`
  
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicSshKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/:key_id']['response'] */ js.Any
  ]
  def getPublicSshKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/:key_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/:key_id']['response'] */ js.Any
  ]
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicSshKeyForAuthenticated")
  var getPublicSshKeyForAuthenticated_Original: `530`
  
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  def list(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users']['response'] */ js.Any
  ]
  def list(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users']['response'] */ js.Any
  ]
  
  /**
    * List the users you've blocked on your personal account.
    */
  def listBlockedByAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks']['response'] */ js.Any
  ]
  def listBlockedByAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks']['response'] */ js.Any
  ]
  /**
    * List the users you've blocked on your personal account.
    */
  @JSName("listBlockedByAuthenticated")
  var listBlockedByAuthenticated_Original: `532`
  
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  def listEmailsForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/emails']['response'] */ js.Any
  ]
  def listEmailsForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/emails']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/emails']['response'] */ js.Any
  ]
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listEmailsForAuthenticated")
  var listEmailsForAuthenticated_Original: `533`
  
  /**
    * Lists the people who the authenticated user follows.
    */
  def listFollowedByAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following']['response'] */ js.Any
  ]
  def listFollowedByAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following']['response'] */ js.Any
  ]
  /**
    * Lists the people who the authenticated user follows.
    */
  @JSName("listFollowedByAuthenticated")
  var listFollowedByAuthenticated_Original: `534`
  
  /**
    * Lists the people following the authenticated user.
    */
  def listFollowersForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/followers']['response'] */ js.Any
  ]
  def listFollowersForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/followers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/followers']['response'] */ js.Any
  ]
  /**
    * Lists the people following the authenticated user.
    */
  @JSName("listFollowersForAuthenticatedUser")
  var listFollowersForAuthenticatedUser_Original: `535`
  
  /**
    * Lists the people following the specified user.
    */
  def listFollowersForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/followers']['response'] */ js.Any
  ]
  def listFollowersForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/followers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/followers']['response'] */ js.Any
  ]
  /**
    * Lists the people following the specified user.
    */
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: `536`
  
  /**
    * Lists the people who the specified user follows.
    */
  def listFollowingForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/following']['response'] */ js.Any
  ]
  def listFollowingForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/following']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/following']['response'] */ js.Any
  ]
  /**
    * Lists the people who the specified user follows.
    */
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: `537`
  
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeysForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys']['response'] */ js.Any
  ]
  def listGpgKeysForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys']['response'] */ js.Any
  ]
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeysForAuthenticated")
  var listGpgKeysForAuthenticated_Original: `538`
  
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/gpg_keys']['response'] */ js.Any
  ]
  def listGpgKeysForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/gpg_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/gpg_keys']['response'] */ js.Any
  ]
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: `539`
  
  /**
    * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://developer.github.com/v3/users/emails/#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmailsForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/public_emails']['response'] */ js.Any
  ]
  def listPublicEmailsForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/public_emails']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/public_emails']['response'] */ js.Any
  ]
  /**
    * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://developer.github.com/v3/users/emails/#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmailsForAuthenticated")
  var listPublicEmailsForAuthenticated_Original: `540`
  
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/keys']['response'] */ js.Any
  ]
  def listPublicKeysForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/keys']['response'] */ js.Any
  ]
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: `541`
  
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicSshKeysForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys']['response'] */ js.Any
  ]
  def listPublicSshKeysForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys']['response'] */ js.Any
  ]
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicSshKeysForAuthenticated")
  var listPublicSshKeysForAuthenticated_Original: `542`
  
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: `531`
  
  /**
    * Sets the visibility for your primary email addresses.
    */
  def setPrimaryEmailVisibilityForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/email/visibility']['response'] */ js.Any
  ]
  def setPrimaryEmailVisibilityForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/email/visibility']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/email/visibility']['response'] */ js.Any
  ]
  /**
    * Sets the visibility for your primary email addresses.
    */
  @JSName("setPrimaryEmailVisibilityForAuthenticated")
  var setPrimaryEmailVisibilityForAuthenticated_Original: `543`
  
  def unblock(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/blocks/:username']['response'] */ js.Any
  ]
  def unblock(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/blocks/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/blocks/:username']['response'] */ js.Any
  ]
  @JSName("unblock")
  var unblock_Original: `544`
  
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/following/:username']['response'] */ js.Any
  ]
  def unfollow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/following/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/following/:username']['response'] */ js.Any
  ]
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: `545`
  
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  def updateAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user']['response'] */ js.Any
  ]
  def updateAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user']['response'] */ js.Any
  ]
  /**
    * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  @JSName("updateAuthenticated")
  var updateAuthenticated_Original: `546`
}
object AddEmailForAuthenticated {
  
  inline def apply(
    addEmailForAuthenticated: `515`,
    block: `516`,
    checkBlocked: `517`,
    checkFollowingForUser: `518`,
    checkPersonIsFollowedByAuthenticated: `519`,
    createGpgKeyForAuthenticated: `520`,
    createPublicSshKeyForAuthenticated: `521`,
    deleteEmailForAuthenticated: `522`,
    deleteGpgKeyForAuthenticated: `523`,
    deletePublicSshKeyForAuthenticated: `524`,
    follow: `525`,
    getAuthenticated: `526`,
    getByUsername: `527`,
    getContextForUser: `528`,
    getGpgKeyForAuthenticated: `529`,
    getPublicSshKeyForAuthenticated: `530`,
    list: `531`,
    listBlockedByAuthenticated: `532`,
    listEmailsForAuthenticated: `533`,
    listFollowedByAuthenticated: `534`,
    listFollowersForAuthenticatedUser: `535`,
    listFollowersForUser: `536`,
    listFollowingForUser: `537`,
    listGpgKeysForAuthenticated: `538`,
    listGpgKeysForUser: `539`,
    listPublicEmailsForAuthenticated: `540`,
    listPublicKeysForUser: `541`,
    listPublicSshKeysForAuthenticated: `542`,
    setPrimaryEmailVisibilityForAuthenticated: `543`,
    unblock: `544`,
    unfollow: `545`,
    updateAuthenticated: `546`
  ): AddEmailForAuthenticated = {
    val __obj = js.Dynamic.literal(addEmailForAuthenticated = addEmailForAuthenticated.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], checkBlocked = checkBlocked.asInstanceOf[js.Any], checkFollowingForUser = checkFollowingForUser.asInstanceOf[js.Any], checkPersonIsFollowedByAuthenticated = checkPersonIsFollowedByAuthenticated.asInstanceOf[js.Any], createGpgKeyForAuthenticated = createGpgKeyForAuthenticated.asInstanceOf[js.Any], createPublicSshKeyForAuthenticated = createPublicSshKeyForAuthenticated.asInstanceOf[js.Any], deleteEmailForAuthenticated = deleteEmailForAuthenticated.asInstanceOf[js.Any], deleteGpgKeyForAuthenticated = deleteGpgKeyForAuthenticated.asInstanceOf[js.Any], deletePublicSshKeyForAuthenticated = deletePublicSshKeyForAuthenticated.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getByUsername = getByUsername.asInstanceOf[js.Any], getContextForUser = getContextForUser.asInstanceOf[js.Any], getGpgKeyForAuthenticated = getGpgKeyForAuthenticated.asInstanceOf[js.Any], getPublicSshKeyForAuthenticated = getPublicSshKeyForAuthenticated.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlockedByAuthenticated = listBlockedByAuthenticated.asInstanceOf[js.Any], listEmailsForAuthenticated = listEmailsForAuthenticated.asInstanceOf[js.Any], listFollowedByAuthenticated = listFollowedByAuthenticated.asInstanceOf[js.Any], listFollowersForAuthenticatedUser = listFollowersForAuthenticatedUser.asInstanceOf[js.Any], listFollowersForUser = listFollowersForUser.asInstanceOf[js.Any], listFollowingForUser = listFollowingForUser.asInstanceOf[js.Any], listGpgKeysForAuthenticated = listGpgKeysForAuthenticated.asInstanceOf[js.Any], listGpgKeysForUser = listGpgKeysForUser.asInstanceOf[js.Any], listPublicEmailsForAuthenticated = listPublicEmailsForAuthenticated.asInstanceOf[js.Any], listPublicKeysForUser = listPublicKeysForUser.asInstanceOf[js.Any], listPublicSshKeysForAuthenticated = listPublicSshKeysForAuthenticated.asInstanceOf[js.Any], setPrimaryEmailVisibilityForAuthenticated = setPrimaryEmailVisibilityForAuthenticated.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unfollow = unfollow.asInstanceOf[js.Any], updateAuthenticated = updateAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEmailForAuthenticated]
  }
  
  extension [Self <: AddEmailForAuthenticated](x: Self) {
    
    inline def setAddEmailForAuthenticated(value: `515`): Self = StObject.set(x, "addEmailForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: `516`): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setCheckBlocked(value: `517`): Self = StObject.set(x, "checkBlocked", value.asInstanceOf[js.Any])
    
    inline def setCheckFollowingForUser(value: `518`): Self = StObject.set(x, "checkFollowingForUser", value.asInstanceOf[js.Any])
    
    inline def setCheckPersonIsFollowedByAuthenticated(value: `519`): Self = StObject.set(x, "checkPersonIsFollowedByAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setCreateGpgKeyForAuthenticated(value: `520`): Self = StObject.set(x, "createGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setCreatePublicSshKeyForAuthenticated(value: `521`): Self = StObject.set(x, "createPublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDeleteEmailForAuthenticated(value: `522`): Self = StObject.set(x, "deleteEmailForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDeleteGpgKeyForAuthenticated(value: `523`): Self = StObject.set(x, "deleteGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDeletePublicSshKeyForAuthenticated(value: `524`): Self = StObject.set(x, "deletePublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setFollow(value: `525`): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setGetAuthenticated(value: `526`): Self = StObject.set(x, "getAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setGetByUsername(value: `527`): Self = StObject.set(x, "getByUsername", value.asInstanceOf[js.Any])
    
    inline def setGetContextForUser(value: `528`): Self = StObject.set(x, "getContextForUser", value.asInstanceOf[js.Any])
    
    inline def setGetGpgKeyForAuthenticated(value: `529`): Self = StObject.set(x, "getGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setGetPublicSshKeyForAuthenticated(value: `530`): Self = StObject.set(x, "getPublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setList(value: `531`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListBlockedByAuthenticated(value: `532`): Self = StObject.set(x, "listBlockedByAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListEmailsForAuthenticated(value: `533`): Self = StObject.set(x, "listEmailsForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListFollowedByAuthenticated(value: `534`): Self = StObject.set(x, "listFollowedByAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListFollowersForAuthenticatedUser(value: `535`): Self = StObject.set(x, "listFollowersForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListFollowersForUser(value: `536`): Self = StObject.set(x, "listFollowersForUser", value.asInstanceOf[js.Any])
    
    inline def setListFollowingForUser(value: `537`): Self = StObject.set(x, "listFollowingForUser", value.asInstanceOf[js.Any])
    
    inline def setListGpgKeysForAuthenticated(value: `538`): Self = StObject.set(x, "listGpgKeysForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListGpgKeysForUser(value: `539`): Self = StObject.set(x, "listGpgKeysForUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicEmailsForAuthenticated(value: `540`): Self = StObject.set(x, "listPublicEmailsForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListPublicKeysForUser(value: `541`): Self = StObject.set(x, "listPublicKeysForUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicSshKeysForAuthenticated(value: `542`): Self = StObject.set(x, "listPublicSshKeysForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setSetPrimaryEmailVisibilityForAuthenticated(value: `543`): Self = StObject.set(x, "setPrimaryEmailVisibilityForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setUnblock(value: `544`): Self = StObject.set(x, "unblock", value.asInstanceOf[js.Any])
    
    inline def setUnfollow(value: `545`): Self = StObject.set(x, "unfollow", value.asInstanceOf[js.Any])
    
    inline def setUpdateAuthenticated(value: `546`): Self = StObject.set(x, "updateAuthenticated", value.asInstanceOf[js.Any])
  }
}
