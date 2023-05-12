package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEmailForAuthenticated extends StObject {
  
  /**
    * This endpoint is accessible with the `user` scope.
    * @deprecated octokit.rest.users.addEmailForAuthenticated() has been renamed to octokit.rest.users.addEmailForAuthenticatedUser() (2021-10-05)
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
  def addEmailForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/emails']['response'] */ js.Any
  ]
  def addEmailForAuthenticatedUser(
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
  @JSName("addEmailForAuthenticatedUser")
  var addEmailForAuthenticatedUser_Original: `764`
  
  /**
    * This endpoint is accessible with the `user` scope.
    * @deprecated octokit.rest.users.addEmailForAuthenticated() has been renamed to octokit.rest.users.addEmailForAuthenticatedUser() (2021-10-05)
    */
  @JSName("addEmailForAuthenticated")
  var addEmailForAuthenticated_Original: `764`
  
  def block(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/blocks/{username}']['response'] */ js.Any
  ]
  def block(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/blocks/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/blocks/{username}']['response'] */ js.Any
  ]
  @JSName("block")
  var block_Original: `765`
  
  def checkBlocked(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks/{username}']['response'] */ js.Any
  ]
  def checkBlocked(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks/{username}']['response'] */ js.Any
  ]
  @JSName("checkBlocked")
  var checkBlocked_Original: `766`
  
  def checkFollowingForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/following/{target_user}']['response'] */ js.Any
  ]
  def checkFollowingForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/following/{target_user}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/following/{target_user}']['response'] */ js.Any
  ]
  @JSName("checkFollowingForUser")
  var checkFollowingForUser_Original: `767`
  
  def checkPersonIsFollowedByAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following/{username}']['response'] */ js.Any
  ]
  def checkPersonIsFollowedByAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following/{username}']['response'] */ js.Any
  ]
  @JSName("checkPersonIsFollowedByAuthenticated")
  var checkPersonIsFollowedByAuthenticated_Original: `768`
  
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.createGpgKeyForAuthenticated() has been renamed to octokit.rest.users.createGpgKeyForAuthenticatedUser() (2021-10-05)
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
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createGpgKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/gpg_keys']['response'] */ js.Any
  ]
  def createGpgKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/gpg_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/gpg_keys']['response'] */ js.Any
  ]
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createGpgKeyForAuthenticatedUser")
  var createGpgKeyForAuthenticatedUser_Original: `769`
  
  /**
    * Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.createGpgKeyForAuthenticated() has been renamed to octokit.rest.users.createGpgKeyForAuthenticatedUser() (2021-10-05)
    */
  @JSName("createGpgKeyForAuthenticated")
  var createGpgKeyForAuthenticated_Original: `769`
  
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.createPublicSshKeyForAuthenticated() has been renamed to octokit.rest.users.createPublicSshKeyForAuthenticatedUser() (2021-10-05)
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
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def createPublicSshKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/keys']['response'] */ js.Any
  ]
  def createPublicSshKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/keys']['response'] */ js.Any
  ]
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("createPublicSshKeyForAuthenticatedUser")
  var createPublicSshKeyForAuthenticatedUser_Original: `770`
  
  /**
    * Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.createPublicSshKeyForAuthenticated() has been renamed to octokit.rest.users.createPublicSshKeyForAuthenticatedUser() (2021-10-05)
    */
  @JSName("createPublicSshKeyForAuthenticated")
  var createPublicSshKeyForAuthenticated_Original: `770`
  
  /**
    * Creates an SSH signing key for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `write:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  def createSshSigningKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/ssh_signing_keys']['response'] */ js.Any
  ]
  def createSshSigningKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/ssh_signing_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/ssh_signing_keys']['response'] */ js.Any
  ]
  /**
    * Creates an SSH signing key for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `write:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  @JSName("createSshSigningKeyForAuthenticatedUser")
  var createSshSigningKeyForAuthenticatedUser_Original: `771`
  
  /**
    * This endpoint is accessible with the `user` scope.
    * @deprecated octokit.rest.users.deleteEmailForAuthenticated() has been renamed to octokit.rest.users.deleteEmailForAuthenticatedUser() (2021-10-05)
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
  def deleteEmailForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/emails']['response'] */ js.Any
  ]
  def deleteEmailForAuthenticatedUser(
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
  @JSName("deleteEmailForAuthenticatedUser")
  var deleteEmailForAuthenticatedUser_Original: `772`
  
  /**
    * This endpoint is accessible with the `user` scope.
    * @deprecated octokit.rest.users.deleteEmailForAuthenticated() has been renamed to octokit.rest.users.deleteEmailForAuthenticatedUser() (2021-10-05)
    */
  @JSName("deleteEmailForAuthenticated")
  var deleteEmailForAuthenticated_Original: `772`
  
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.deleteGpgKeyForAuthenticated() has been renamed to octokit.rest.users.deleteGpgKeyForAuthenticatedUser() (2021-10-05)
    */
  def deleteGpgKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  def deleteGpgKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/{gpg_key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deleteGpgKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  def deleteGpgKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/{gpg_key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deleteGpgKeyForAuthenticatedUser")
  var deleteGpgKeyForAuthenticatedUser_Original: `773`
  
  /**
    * Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.deleteGpgKeyForAuthenticated() has been renamed to octokit.rest.users.deleteGpgKeyForAuthenticatedUser() (2021-10-05)
    */
  @JSName("deleteGpgKeyForAuthenticated")
  var deleteGpgKeyForAuthenticated_Original: `773`
  
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.deletePublicSshKeyForAuthenticated() has been renamed to octokit.rest.users.deletePublicSshKeyForAuthenticatedUser() (2021-10-05)
    */
  def deletePublicSshKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/{key_id}']['response'] */ js.Any
  ]
  def deletePublicSshKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/{key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/{key_id}']['response'] */ js.Any
  ]
  
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def deletePublicSshKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/{key_id}']['response'] */ js.Any
  ]
  def deletePublicSshKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/{key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/keys/{key_id}']['response'] */ js.Any
  ]
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("deletePublicSshKeyForAuthenticatedUser")
  var deletePublicSshKeyForAuthenticatedUser_Original: `774`
  
  /**
    * Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.deletePublicSshKeyForAuthenticated() has been renamed to octokit.rest.users.deletePublicSshKeyForAuthenticatedUser() (2021-10-05)
    */
  @JSName("deletePublicSshKeyForAuthenticated")
  var deletePublicSshKeyForAuthenticated_Original: `774`
  
  /**
    * Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  def deleteSshSigningKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/ssh_signing_keys/{ssh_signing_key_id}']['response'] */ js.Any
  ]
  def deleteSshSigningKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/ssh_signing_keys/{ssh_signing_key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/ssh_signing_keys/{ssh_signing_key_id}']['response'] */ js.Any
  ]
  /**
    * Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  @JSName("deleteSshSigningKeyForAuthenticatedUser")
  var deleteSshSigningKeyForAuthenticatedUser_Original: `775`
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def follow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/following/{username}']['response'] */ js.Any
  ]
  def follow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/following/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/following/{username}']['response'] */ js.Any
  ]
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("follow")
  var follow_Original: `776`
  
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
  var getAuthenticated_Original: `777`
  
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see 'Response with GitHub plan information' below"
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://docs.github.com/rest/overview/resources-in-the-rest-api#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://docs.github.com/rest/reference/users#emails)".
    */
  def getByUsername(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}']['response'] */ js.Any
  ]
  def getByUsername(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}']['response'] */ js.Any
  ]
  /**
    * Provides publicly available information about someone with a GitHub account.
    *
    * GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see 'Response with GitHub plan information' below"
    *
    * The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://docs.github.com/rest/overview/resources-in-the-rest-api#authentication).
    *
    * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://docs.github.com/rest/reference/users#emails)".
    */
  @JSName("getByUsername")
  var getByUsername_Original: `778`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/hovercard']['response'] */ js.Any
  ]
  def getContextForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/hovercard']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/hovercard']['response'] */ js.Any
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
  var getContextForUser_Original: `779`
  
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.getGpgKeyForAuthenticated() has been renamed to octokit.rest.users.getGpgKeyForAuthenticatedUser() (2021-10-05)
    */
  def getGpgKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  def getGpgKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/{gpg_key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getGpgKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  def getGpgKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/{gpg_key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys/{gpg_key_id}']['response'] */ js.Any
  ]
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getGpgKeyForAuthenticatedUser")
  var getGpgKeyForAuthenticatedUser_Original: `780`
  
  /**
    * View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.getGpgKeyForAuthenticated() has been renamed to octokit.rest.users.getGpgKeyForAuthenticatedUser() (2021-10-05)
    */
  @JSName("getGpgKeyForAuthenticated")
  var getGpgKeyForAuthenticated_Original: `780`
  
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.getPublicSshKeyForAuthenticated() has been renamed to octokit.rest.users.getPublicSshKeyForAuthenticatedUser() (2021-10-05)
    */
  def getPublicSshKeyForAuthenticated(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/{key_id}']['response'] */ js.Any
  ]
  def getPublicSshKeyForAuthenticated(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/{key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/{key_id}']['response'] */ js.Any
  ]
  
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def getPublicSshKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/{key_id}']['response'] */ js.Any
  ]
  def getPublicSshKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/{key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys/{key_id}']['response'] */ js.Any
  ]
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("getPublicSshKeyForAuthenticatedUser")
  var getPublicSshKeyForAuthenticatedUser_Original: `781`
  
  /**
    * View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.getPublicSshKeyForAuthenticated() has been renamed to octokit.rest.users.getPublicSshKeyForAuthenticatedUser() (2021-10-05)
    */
  @JSName("getPublicSshKeyForAuthenticated")
  var getPublicSshKeyForAuthenticated_Original: `781`
  
  /**
    * Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  def getSshSigningKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/ssh_signing_keys/{ssh_signing_key_id}']['response'] */ js.Any
  ]
  def getSshSigningKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/ssh_signing_keys/{ssh_signing_key_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/ssh_signing_keys/{ssh_signing_key_id}']['response'] */ js.Any
  ]
  /**
    * Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  @JSName("getSshSigningKeyForAuthenticatedUser")
  var getSshSigningKeyForAuthenticatedUser_Original: `782`
  
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of users.
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
    * @deprecated octokit.rest.users.listBlockedByAuthenticated() has been renamed to octokit.rest.users.listBlockedByAuthenticatedUser() (2021-10-05)
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
  def listBlockedByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/blocks']['response'] */ js.Any
  ]
  def listBlockedByAuthenticatedUser(
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
  @JSName("listBlockedByAuthenticatedUser")
  var listBlockedByAuthenticatedUser_Original: `784`
  
  /**
    * List the users you've blocked on your personal account.
    * @deprecated octokit.rest.users.listBlockedByAuthenticated() has been renamed to octokit.rest.users.listBlockedByAuthenticatedUser() (2021-10-05)
    */
  @JSName("listBlockedByAuthenticated")
  var listBlockedByAuthenticated_Original: `784`
  
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    * @deprecated octokit.rest.users.listEmailsForAuthenticated() has been renamed to octokit.rest.users.listEmailsForAuthenticatedUser() (2021-10-05)
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
  def listEmailsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/emails']['response'] */ js.Any
  ]
  def listEmailsForAuthenticatedUser(
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
  @JSName("listEmailsForAuthenticatedUser")
  var listEmailsForAuthenticatedUser_Original: `785`
  
  /**
    * Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    * @deprecated octokit.rest.users.listEmailsForAuthenticated() has been renamed to octokit.rest.users.listEmailsForAuthenticatedUser() (2021-10-05)
    */
  @JSName("listEmailsForAuthenticated")
  var listEmailsForAuthenticated_Original: `785`
  
  /**
    * Lists the people who the authenticated user follows.
    * @deprecated octokit.rest.users.listFollowedByAuthenticated() has been renamed to octokit.rest.users.listFollowedByAuthenticatedUser() (2021-10-05)
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
  def listFollowedByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/following']['response'] */ js.Any
  ]
  def listFollowedByAuthenticatedUser(
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
  @JSName("listFollowedByAuthenticatedUser")
  var listFollowedByAuthenticatedUser_Original: `786`
  
  /**
    * Lists the people who the authenticated user follows.
    * @deprecated octokit.rest.users.listFollowedByAuthenticated() has been renamed to octokit.rest.users.listFollowedByAuthenticatedUser() (2021-10-05)
    */
  @JSName("listFollowedByAuthenticated")
  var listFollowedByAuthenticated_Original: `786`
  
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
  var listFollowersForAuthenticatedUser_Original: `787`
  
  /**
    * Lists the people following the specified user.
    */
  def listFollowersForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/followers']['response'] */ js.Any
  ]
  def listFollowersForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/followers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/followers']['response'] */ js.Any
  ]
  /**
    * Lists the people following the specified user.
    */
  @JSName("listFollowersForUser")
  var listFollowersForUser_Original: `788`
  
  /**
    * Lists the people who the specified user follows.
    */
  def listFollowingForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/following']['response'] */ js.Any
  ]
  def listFollowingForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/following']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/following']['response'] */ js.Any
  ]
  /**
    * Lists the people who the specified user follows.
    */
  @JSName("listFollowingForUser")
  var listFollowingForUser_Original: `789`
  
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.listGpgKeysForAuthenticated() has been renamed to octokit.rest.users.listGpgKeysForAuthenticatedUser() (2021-10-05)
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
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listGpgKeysForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys']['response'] */ js.Any
  ]
  def listGpgKeysForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/gpg_keys']['response'] */ js.Any
  ]
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listGpgKeysForAuthenticatedUser")
  var listGpgKeysForAuthenticatedUser_Original: `790`
  
  /**
    * Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.listGpgKeysForAuthenticated() has been renamed to octokit.rest.users.listGpgKeysForAuthenticatedUser() (2021-10-05)
    */
  @JSName("listGpgKeysForAuthenticated")
  var listGpgKeysForAuthenticated_Original: `790`
  
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  def listGpgKeysForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/gpg_keys']['response'] */ js.Any
  ]
  def listGpgKeysForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/gpg_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/gpg_keys']['response'] */ js.Any
  ]
  /**
    * Lists the GPG keys for a user. This information is accessible by anyone.
    */
  @JSName("listGpgKeysForUser")
  var listGpgKeysForUser_Original: `791`
  
  /**
    * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    * @deprecated octokit.rest.users.listPublicEmailsForAuthenticated() has been renamed to octokit.rest.users.listPublicEmailsForAuthenticatedUser() (2021-10-05)
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
    * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  def listPublicEmailsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/public_emails']['response'] */ js.Any
  ]
  def listPublicEmailsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/public_emails']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/public_emails']['response'] */ js.Any
  ]
  /**
    * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    */
  @JSName("listPublicEmailsForAuthenticatedUser")
  var listPublicEmailsForAuthenticatedUser_Original: `792`
  
  /**
    * Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.
    * @deprecated octokit.rest.users.listPublicEmailsForAuthenticated() has been renamed to octokit.rest.users.listPublicEmailsForAuthenticatedUser() (2021-10-05)
    */
  @JSName("listPublicEmailsForAuthenticated")
  var listPublicEmailsForAuthenticated_Original: `792`
  
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  def listPublicKeysForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/keys']['response'] */ js.Any
  ]
  def listPublicKeysForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/keys']['response'] */ js.Any
  ]
  /**
    * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
    */
  @JSName("listPublicKeysForUser")
  var listPublicKeysForUser_Original: `793`
  
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.listPublicSshKeysForAuthenticated() has been renamed to octokit.rest.users.listPublicSshKeysForAuthenticatedUser() (2021-10-05)
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
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listPublicSshKeysForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys']['response'] */ js.Any
  ]
  def listPublicSshKeysForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/keys']['response'] */ js.Any
  ]
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listPublicSshKeysForAuthenticatedUser")
  var listPublicSshKeysForAuthenticatedUser_Original: `794`
  
  /**
    * Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.rest.users.listPublicSshKeysForAuthenticated() has been renamed to octokit.rest.users.listPublicSshKeysForAuthenticatedUser() (2021-10-05)
    */
  @JSName("listPublicSshKeysForAuthenticated")
  var listPublicSshKeysForAuthenticated_Original: `794`
  
  /**
    * Lists the SSH signing keys for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  def listSshSigningKeysForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/ssh_signing_keys']['response'] */ js.Any
  ]
  def listSshSigningKeysForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/ssh_signing_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/ssh_signing_keys']['response'] */ js.Any
  ]
  /**
    * Lists the SSH signing keys for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  @JSName("listSshSigningKeysForAuthenticatedUser")
  var listSshSigningKeysForAuthenticatedUser_Original: `795`
  
  /**
    * Lists the SSH signing keys for a user. This operation is accessible by anyone.
    */
  def listSshSigningKeysForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/ssh_signing_keys']['response'] */ js.Any
  ]
  def listSshSigningKeysForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/ssh_signing_keys']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/ssh_signing_keys']['response'] */ js.Any
  ]
  /**
    * Lists the SSH signing keys for a user. This operation is accessible by anyone.
    */
  @JSName("listSshSigningKeysForUser")
  var listSshSigningKeysForUser_Original: `796`
  
  /**
    * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of users.
    */
  @JSName("list")
  var list_Original: `783`
  
  /**
    * Sets the visibility for your primary email addresses.
    * @deprecated octokit.rest.users.setPrimaryEmailVisibilityForAuthenticated() has been renamed to octokit.rest.users.setPrimaryEmailVisibilityForAuthenticatedUser() (2021-10-05)
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
  def setPrimaryEmailVisibilityForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/email/visibility']['response'] */ js.Any
  ]
  def setPrimaryEmailVisibilityForAuthenticatedUser(
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
  @JSName("setPrimaryEmailVisibilityForAuthenticatedUser")
  var setPrimaryEmailVisibilityForAuthenticatedUser_Original: `797`
  
  /**
    * Sets the visibility for your primary email addresses.
    * @deprecated octokit.rest.users.setPrimaryEmailVisibilityForAuthenticated() has been renamed to octokit.rest.users.setPrimaryEmailVisibilityForAuthenticatedUser() (2021-10-05)
    */
  @JSName("setPrimaryEmailVisibilityForAuthenticated")
  var setPrimaryEmailVisibilityForAuthenticated_Original: `797`
  
  def unblock(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/blocks/{username}']['response'] */ js.Any
  ]
  def unblock(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/blocks/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/blocks/{username}']['response'] */ js.Any
  ]
  @JSName("unblock")
  var unblock_Original: `798`
  
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  def unfollow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/following/{username}']['response'] */ js.Any
  ]
  def unfollow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/following/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/following/{username}']['response'] */ js.Any
  ]
  /**
    * Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.
    */
  @JSName("unfollow")
  var unfollow_Original: `799`
  
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
  var updateAuthenticated_Original: `800`
}
object AddEmailForAuthenticated {
  
  inline def apply(
    addEmailForAuthenticated: `764`,
    addEmailForAuthenticatedUser: `764`,
    block: `765`,
    checkBlocked: `766`,
    checkFollowingForUser: `767`,
    checkPersonIsFollowedByAuthenticated: `768`,
    createGpgKeyForAuthenticated: `769`,
    createGpgKeyForAuthenticatedUser: `769`,
    createPublicSshKeyForAuthenticated: `770`,
    createPublicSshKeyForAuthenticatedUser: `770`,
    createSshSigningKeyForAuthenticatedUser: `771`,
    deleteEmailForAuthenticated: `772`,
    deleteEmailForAuthenticatedUser: `772`,
    deleteGpgKeyForAuthenticated: `773`,
    deleteGpgKeyForAuthenticatedUser: `773`,
    deletePublicSshKeyForAuthenticated: `774`,
    deletePublicSshKeyForAuthenticatedUser: `774`,
    deleteSshSigningKeyForAuthenticatedUser: `775`,
    follow: `776`,
    getAuthenticated: `777`,
    getByUsername: `778`,
    getContextForUser: `779`,
    getGpgKeyForAuthenticated: `780`,
    getGpgKeyForAuthenticatedUser: `780`,
    getPublicSshKeyForAuthenticated: `781`,
    getPublicSshKeyForAuthenticatedUser: `781`,
    getSshSigningKeyForAuthenticatedUser: `782`,
    list: `783`,
    listBlockedByAuthenticated: `784`,
    listBlockedByAuthenticatedUser: `784`,
    listEmailsForAuthenticated: `785`,
    listEmailsForAuthenticatedUser: `785`,
    listFollowedByAuthenticated: `786`,
    listFollowedByAuthenticatedUser: `786`,
    listFollowersForAuthenticatedUser: `787`,
    listFollowersForUser: `788`,
    listFollowingForUser: `789`,
    listGpgKeysForAuthenticated: `790`,
    listGpgKeysForAuthenticatedUser: `790`,
    listGpgKeysForUser: `791`,
    listPublicEmailsForAuthenticated: `792`,
    listPublicEmailsForAuthenticatedUser: `792`,
    listPublicKeysForUser: `793`,
    listPublicSshKeysForAuthenticated: `794`,
    listPublicSshKeysForAuthenticatedUser: `794`,
    listSshSigningKeysForAuthenticatedUser: `795`,
    listSshSigningKeysForUser: `796`,
    setPrimaryEmailVisibilityForAuthenticated: `797`,
    setPrimaryEmailVisibilityForAuthenticatedUser: `797`,
    unblock: `798`,
    unfollow: `799`,
    updateAuthenticated: `800`
  ): AddEmailForAuthenticated = {
    val __obj = js.Dynamic.literal(addEmailForAuthenticated = addEmailForAuthenticated.asInstanceOf[js.Any], addEmailForAuthenticatedUser = addEmailForAuthenticatedUser.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], checkBlocked = checkBlocked.asInstanceOf[js.Any], checkFollowingForUser = checkFollowingForUser.asInstanceOf[js.Any], checkPersonIsFollowedByAuthenticated = checkPersonIsFollowedByAuthenticated.asInstanceOf[js.Any], createGpgKeyForAuthenticated = createGpgKeyForAuthenticated.asInstanceOf[js.Any], createGpgKeyForAuthenticatedUser = createGpgKeyForAuthenticatedUser.asInstanceOf[js.Any], createPublicSshKeyForAuthenticated = createPublicSshKeyForAuthenticated.asInstanceOf[js.Any], createPublicSshKeyForAuthenticatedUser = createPublicSshKeyForAuthenticatedUser.asInstanceOf[js.Any], createSshSigningKeyForAuthenticatedUser = createSshSigningKeyForAuthenticatedUser.asInstanceOf[js.Any], deleteEmailForAuthenticated = deleteEmailForAuthenticated.asInstanceOf[js.Any], deleteEmailForAuthenticatedUser = deleteEmailForAuthenticatedUser.asInstanceOf[js.Any], deleteGpgKeyForAuthenticated = deleteGpgKeyForAuthenticated.asInstanceOf[js.Any], deleteGpgKeyForAuthenticatedUser = deleteGpgKeyForAuthenticatedUser.asInstanceOf[js.Any], deletePublicSshKeyForAuthenticated = deletePublicSshKeyForAuthenticated.asInstanceOf[js.Any], deletePublicSshKeyForAuthenticatedUser = deletePublicSshKeyForAuthenticatedUser.asInstanceOf[js.Any], deleteSshSigningKeyForAuthenticatedUser = deleteSshSigningKeyForAuthenticatedUser.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getByUsername = getByUsername.asInstanceOf[js.Any], getContextForUser = getContextForUser.asInstanceOf[js.Any], getGpgKeyForAuthenticated = getGpgKeyForAuthenticated.asInstanceOf[js.Any], getGpgKeyForAuthenticatedUser = getGpgKeyForAuthenticatedUser.asInstanceOf[js.Any], getPublicSshKeyForAuthenticated = getPublicSshKeyForAuthenticated.asInstanceOf[js.Any], getPublicSshKeyForAuthenticatedUser = getPublicSshKeyForAuthenticatedUser.asInstanceOf[js.Any], getSshSigningKeyForAuthenticatedUser = getSshSigningKeyForAuthenticatedUser.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlockedByAuthenticated = listBlockedByAuthenticated.asInstanceOf[js.Any], listBlockedByAuthenticatedUser = listBlockedByAuthenticatedUser.asInstanceOf[js.Any], listEmailsForAuthenticated = listEmailsForAuthenticated.asInstanceOf[js.Any], listEmailsForAuthenticatedUser = listEmailsForAuthenticatedUser.asInstanceOf[js.Any], listFollowedByAuthenticated = listFollowedByAuthenticated.asInstanceOf[js.Any], listFollowedByAuthenticatedUser = listFollowedByAuthenticatedUser.asInstanceOf[js.Any], listFollowersForAuthenticatedUser = listFollowersForAuthenticatedUser.asInstanceOf[js.Any], listFollowersForUser = listFollowersForUser.asInstanceOf[js.Any], listFollowingForUser = listFollowingForUser.asInstanceOf[js.Any], listGpgKeysForAuthenticated = listGpgKeysForAuthenticated.asInstanceOf[js.Any], listGpgKeysForAuthenticatedUser = listGpgKeysForAuthenticatedUser.asInstanceOf[js.Any], listGpgKeysForUser = listGpgKeysForUser.asInstanceOf[js.Any], listPublicEmailsForAuthenticated = listPublicEmailsForAuthenticated.asInstanceOf[js.Any], listPublicEmailsForAuthenticatedUser = listPublicEmailsForAuthenticatedUser.asInstanceOf[js.Any], listPublicKeysForUser = listPublicKeysForUser.asInstanceOf[js.Any], listPublicSshKeysForAuthenticated = listPublicSshKeysForAuthenticated.asInstanceOf[js.Any], listPublicSshKeysForAuthenticatedUser = listPublicSshKeysForAuthenticatedUser.asInstanceOf[js.Any], listSshSigningKeysForAuthenticatedUser = listSshSigningKeysForAuthenticatedUser.asInstanceOf[js.Any], listSshSigningKeysForUser = listSshSigningKeysForUser.asInstanceOf[js.Any], setPrimaryEmailVisibilityForAuthenticated = setPrimaryEmailVisibilityForAuthenticated.asInstanceOf[js.Any], setPrimaryEmailVisibilityForAuthenticatedUser = setPrimaryEmailVisibilityForAuthenticatedUser.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unfollow = unfollow.asInstanceOf[js.Any], updateAuthenticated = updateAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEmailForAuthenticated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddEmailForAuthenticated] (val x: Self) extends AnyVal {
    
    inline def setAddEmailForAuthenticated(value: `764`): Self = StObject.set(x, "addEmailForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setAddEmailForAuthenticatedUser(value: `764`): Self = StObject.set(x, "addEmailForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: `765`): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setCheckBlocked(value: `766`): Self = StObject.set(x, "checkBlocked", value.asInstanceOf[js.Any])
    
    inline def setCheckFollowingForUser(value: `767`): Self = StObject.set(x, "checkFollowingForUser", value.asInstanceOf[js.Any])
    
    inline def setCheckPersonIsFollowedByAuthenticated(value: `768`): Self = StObject.set(x, "checkPersonIsFollowedByAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setCreateGpgKeyForAuthenticated(value: `769`): Self = StObject.set(x, "createGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setCreateGpgKeyForAuthenticatedUser(value: `769`): Self = StObject.set(x, "createGpgKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreatePublicSshKeyForAuthenticated(value: `770`): Self = StObject.set(x, "createPublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setCreatePublicSshKeyForAuthenticatedUser(value: `770`): Self = StObject.set(x, "createPublicSshKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateSshSigningKeyForAuthenticatedUser(value: `771`): Self = StObject.set(x, "createSshSigningKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteEmailForAuthenticated(value: `772`): Self = StObject.set(x, "deleteEmailForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDeleteEmailForAuthenticatedUser(value: `772`): Self = StObject.set(x, "deleteEmailForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteGpgKeyForAuthenticated(value: `773`): Self = StObject.set(x, "deleteGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDeleteGpgKeyForAuthenticatedUser(value: `773`): Self = StObject.set(x, "deleteGpgKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePublicSshKeyForAuthenticated(value: `774`): Self = StObject.set(x, "deletePublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDeletePublicSshKeyForAuthenticatedUser(value: `774`): Self = StObject.set(x, "deletePublicSshKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteSshSigningKeyForAuthenticatedUser(value: `775`): Self = StObject.set(x, "deleteSshSigningKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setFollow(value: `776`): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setGetAuthenticated(value: `777`): Self = StObject.set(x, "getAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setGetByUsername(value: `778`): Self = StObject.set(x, "getByUsername", value.asInstanceOf[js.Any])
    
    inline def setGetContextForUser(value: `779`): Self = StObject.set(x, "getContextForUser", value.asInstanceOf[js.Any])
    
    inline def setGetGpgKeyForAuthenticated(value: `780`): Self = StObject.set(x, "getGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setGetGpgKeyForAuthenticatedUser(value: `780`): Self = StObject.set(x, "getGpgKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetPublicSshKeyForAuthenticated(value: `781`): Self = StObject.set(x, "getPublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setGetPublicSshKeyForAuthenticatedUser(value: `781`): Self = StObject.set(x, "getPublicSshKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetSshSigningKeyForAuthenticatedUser(value: `782`): Self = StObject.set(x, "getSshSigningKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setList(value: `783`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListBlockedByAuthenticated(value: `784`): Self = StObject.set(x, "listBlockedByAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListBlockedByAuthenticatedUser(value: `784`): Self = StObject.set(x, "listBlockedByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListEmailsForAuthenticated(value: `785`): Self = StObject.set(x, "listEmailsForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListEmailsForAuthenticatedUser(value: `785`): Self = StObject.set(x, "listEmailsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListFollowedByAuthenticated(value: `786`): Self = StObject.set(x, "listFollowedByAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListFollowedByAuthenticatedUser(value: `786`): Self = StObject.set(x, "listFollowedByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListFollowersForAuthenticatedUser(value: `787`): Self = StObject.set(x, "listFollowersForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListFollowersForUser(value: `788`): Self = StObject.set(x, "listFollowersForUser", value.asInstanceOf[js.Any])
    
    inline def setListFollowingForUser(value: `789`): Self = StObject.set(x, "listFollowingForUser", value.asInstanceOf[js.Any])
    
    inline def setListGpgKeysForAuthenticated(value: `790`): Self = StObject.set(x, "listGpgKeysForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListGpgKeysForAuthenticatedUser(value: `790`): Self = StObject.set(x, "listGpgKeysForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListGpgKeysForUser(value: `791`): Self = StObject.set(x, "listGpgKeysForUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicEmailsForAuthenticated(value: `792`): Self = StObject.set(x, "listPublicEmailsForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListPublicEmailsForAuthenticatedUser(value: `792`): Self = StObject.set(x, "listPublicEmailsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicKeysForUser(value: `793`): Self = StObject.set(x, "listPublicKeysForUser", value.asInstanceOf[js.Any])
    
    inline def setListPublicSshKeysForAuthenticated(value: `794`): Self = StObject.set(x, "listPublicSshKeysForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setListPublicSshKeysForAuthenticatedUser(value: `794`): Self = StObject.set(x, "listPublicSshKeysForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListSshSigningKeysForAuthenticatedUser(value: `795`): Self = StObject.set(x, "listSshSigningKeysForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListSshSigningKeysForUser(value: `796`): Self = StObject.set(x, "listSshSigningKeysForUser", value.asInstanceOf[js.Any])
    
    inline def setSetPrimaryEmailVisibilityForAuthenticated(value: `797`): Self = StObject.set(x, "setPrimaryEmailVisibilityForAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setSetPrimaryEmailVisibilityForAuthenticatedUser(value: `797`): Self = StObject.set(x, "setPrimaryEmailVisibilityForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUnblock(value: `798`): Self = StObject.set(x, "unblock", value.asInstanceOf[js.Any])
    
    inline def setUnfollow(value: `799`): Self = StObject.set(x, "unfollow", value.asInstanceOf[js.Any])
    
    inline def setUpdateAuthenticated(value: `800`): Self = StObject.set(x, "updateAuthenticated", value.asInstanceOf[js.Any])
  }
}
