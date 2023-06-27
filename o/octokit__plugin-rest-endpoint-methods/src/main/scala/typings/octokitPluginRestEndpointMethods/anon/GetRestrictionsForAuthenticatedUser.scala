package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRestrictionsForAuthenticatedUser extends StObject {
  
  /**
    * Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
    */
  def getRestrictionsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/interaction-limits']['response'] */ js.Any
  ]
  def getRestrictionsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
    */
  @JSName("getRestrictionsForAuthenticatedUser")
  var getRestrictionsForAuthenticatedUser_Original: `330`
  
  /**
    * Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.
    */
  def getRestrictionsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/interaction-limits']['response'] */ js.Any
  ]
  def getRestrictionsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForOrg")
  var getRestrictionsForOrg_Original: `331`
  
  /**
    * Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/interaction-limits']['response'] */ js.Any
  ]
  def getRestrictionsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForRepo")
  var getRestrictionsForRepo_Original: `332`
  
  /**
    * Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
    * @deprecated octokit.rest.interactions.getRestrictionsForYourPublicRepos() has been renamed to octokit.rest.interactions.getRestrictionsForAuthenticatedUser() (2021-02-02)
    */
  def getRestrictionsForYourPublicRepos(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/interaction-limits']['response'] */ js.Any
  ]
  def getRestrictionsForYourPublicRepos(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
    * @deprecated octokit.rest.interactions.getRestrictionsForYourPublicRepos() has been renamed to octokit.rest.interactions.getRestrictionsForAuthenticatedUser() (2021-02-02)
    */
  @JSName("getRestrictionsForYourPublicRepos")
  var getRestrictionsForYourPublicRepos_Original: `330`
  
  /**
    * Removes any interaction restrictions from your public repositories.
    */
  def removeRestrictionsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/interaction-limits']['response'] */ js.Any
  ]
  def removeRestrictionsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Removes any interaction restrictions from your public repositories.
    */
  @JSName("removeRestrictionsForAuthenticatedUser")
  var removeRestrictionsForAuthenticatedUser_Original: `333`
  
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  def removeRestrictionsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/interaction-limits']['response'] */ js.Any
  ]
  def removeRestrictionsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  @JSName("removeRestrictionsForOrg")
  var removeRestrictionsForOrg_Original: `334`
  
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.
    */
  def removeRestrictionsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/interaction-limits']['response'] */ js.Any
  ]
  def removeRestrictionsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.
    */
  @JSName("removeRestrictionsForRepo")
  var removeRestrictionsForRepo_Original: `335`
  
  /**
    * Removes any interaction restrictions from your public repositories.
    * @deprecated octokit.rest.interactions.removeRestrictionsForYourPublicRepos() has been renamed to octokit.rest.interactions.removeRestrictionsForAuthenticatedUser() (2021-02-02)
    */
  def removeRestrictionsForYourPublicRepos(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/interaction-limits']['response'] */ js.Any
  ]
  def removeRestrictionsForYourPublicRepos(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Removes any interaction restrictions from your public repositories.
    * @deprecated octokit.rest.interactions.removeRestrictionsForYourPublicRepos() has been renamed to octokit.rest.interactions.removeRestrictionsForAuthenticatedUser() (2021-02-02)
    */
  @JSName("removeRestrictionsForYourPublicRepos")
  var removeRestrictionsForYourPublicRepos_Original: `333`
  
  /**
    * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
    */
  def setRestrictionsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/interaction-limits']['response'] */ js.Any
  ]
  def setRestrictionsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
    */
  @JSName("setRestrictionsForAuthenticatedUser")
  var setRestrictionsForAuthenticatedUser_Original: `336`
  
  /**
    * Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.
    */
  def setRestrictionsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/interaction-limits']['response'] */ js.Any
  ]
  def setRestrictionsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.
    */
  @JSName("setRestrictionsForOrg")
  var setRestrictionsForOrg_Original: `337`
  
  /**
    * Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.
    */
  def setRestrictionsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/interaction-limits']['response'] */ js.Any
  ]
  def setRestrictionsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.
    */
  @JSName("setRestrictionsForRepo")
  var setRestrictionsForRepo_Original: `338`
  
  /**
    * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
    * @deprecated octokit.rest.interactions.setRestrictionsForYourPublicRepos() has been renamed to octokit.rest.interactions.setRestrictionsForAuthenticatedUser() (2021-02-02)
    */
  def setRestrictionsForYourPublicRepos(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/interaction-limits']['response'] */ js.Any
  ]
  def setRestrictionsForYourPublicRepos(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
    * @deprecated octokit.rest.interactions.setRestrictionsForYourPublicRepos() has been renamed to octokit.rest.interactions.setRestrictionsForAuthenticatedUser() (2021-02-02)
    */
  @JSName("setRestrictionsForYourPublicRepos")
  var setRestrictionsForYourPublicRepos_Original: `336`
}
object GetRestrictionsForAuthenticatedUser {
  
  inline def apply(
    getRestrictionsForAuthenticatedUser: `330`,
    getRestrictionsForOrg: `331`,
    getRestrictionsForRepo: `332`,
    getRestrictionsForYourPublicRepos: `330`,
    removeRestrictionsForAuthenticatedUser: `333`,
    removeRestrictionsForOrg: `334`,
    removeRestrictionsForRepo: `335`,
    removeRestrictionsForYourPublicRepos: `333`,
    setRestrictionsForAuthenticatedUser: `336`,
    setRestrictionsForOrg: `337`,
    setRestrictionsForRepo: `338`,
    setRestrictionsForYourPublicRepos: `336`
  ): GetRestrictionsForAuthenticatedUser = {
    val __obj = js.Dynamic.literal(getRestrictionsForAuthenticatedUser = getRestrictionsForAuthenticatedUser.asInstanceOf[js.Any], getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], getRestrictionsForYourPublicRepos = getRestrictionsForYourPublicRepos.asInstanceOf[js.Any], removeRestrictionsForAuthenticatedUser = removeRestrictionsForAuthenticatedUser.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForYourPublicRepos = removeRestrictionsForYourPublicRepos.asInstanceOf[js.Any], setRestrictionsForAuthenticatedUser = setRestrictionsForAuthenticatedUser.asInstanceOf[js.Any], setRestrictionsForOrg = setRestrictionsForOrg.asInstanceOf[js.Any], setRestrictionsForRepo = setRestrictionsForRepo.asInstanceOf[js.Any], setRestrictionsForYourPublicRepos = setRestrictionsForYourPublicRepos.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestrictionsForAuthenticatedUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRestrictionsForAuthenticatedUser] (val x: Self) extends AnyVal {
    
    inline def setGetRestrictionsForAuthenticatedUser(value: `330`): Self = StObject.set(x, "getRestrictionsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetRestrictionsForOrg(value: `331`): Self = StObject.set(x, "getRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetRestrictionsForRepo(value: `332`): Self = StObject.set(x, "getRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetRestrictionsForYourPublicRepos(value: `330`): Self = StObject.set(x, "getRestrictionsForYourPublicRepos", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestrictionsForAuthenticatedUser(value: `333`): Self = StObject.set(x, "removeRestrictionsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestrictionsForOrg(value: `334`): Self = StObject.set(x, "removeRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestrictionsForRepo(value: `335`): Self = StObject.set(x, "removeRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestrictionsForYourPublicRepos(value: `333`): Self = StObject.set(x, "removeRestrictionsForYourPublicRepos", value.asInstanceOf[js.Any])
    
    inline def setSetRestrictionsForAuthenticatedUser(value: `336`): Self = StObject.set(x, "setRestrictionsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setSetRestrictionsForOrg(value: `337`): Self = StObject.set(x, "setRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetRestrictionsForRepo(value: `338`): Self = StObject.set(x, "setRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetRestrictionsForYourPublicRepos(value: `336`): Self = StObject.set(x, "setRestrictionsForYourPublicRepos", value.asInstanceOf[js.Any])
  }
}
