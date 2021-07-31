package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRestrictionsForOrg extends StObject {
  
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/interaction-limits']['response'] */ js.Any
  ]
  def getRestrictionsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForOrg")
  var getRestrictionsForOrg_Original: `159`
  
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/interaction-limits']['response'] */ js.Any
  ]
  def getRestrictionsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForRepo")
  var getRestrictionsForRepo_Original: `160`
  
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  def removeRestrictionsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/interaction-limits']['response'] */ js.Any
  ]
  def removeRestrictionsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  @JSName("removeRestrictionsForOrg")
  var removeRestrictionsForOrg_Original: `161`
  
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  def removeRestrictionsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/interaction-limits']['response'] */ js.Any
  ]
  def removeRestrictionsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  @JSName("removeRestrictionsForRepo")
  var removeRestrictionsForRepo_Original: `162`
  
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  def setRestrictionsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/interaction-limits']['response'] */ js.Any
  ]
  def setRestrictionsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  @JSName("setRestrictionsForOrg")
  var setRestrictionsForOrg_Original: `163`
  
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  def setRestrictionsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/interaction-limits']['response'] */ js.Any
  ]
  def setRestrictionsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/interaction-limits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/interaction-limits']['response'] */ js.Any
  ]
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  @JSName("setRestrictionsForRepo")
  var setRestrictionsForRepo_Original: `164`
}
object GetRestrictionsForOrg {
  
  @scala.inline
  def apply(
    getRestrictionsForOrg: `159`,
    getRestrictionsForRepo: `160`,
    removeRestrictionsForOrg: `161`,
    removeRestrictionsForRepo: `162`,
    setRestrictionsForOrg: `163`,
    setRestrictionsForRepo: `164`
  ): GetRestrictionsForOrg = {
    val __obj = js.Dynamic.literal(getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any], setRestrictionsForOrg = setRestrictionsForOrg.asInstanceOf[js.Any], setRestrictionsForRepo = setRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestrictionsForOrg]
  }
  
  @scala.inline
  implicit class GetRestrictionsForOrgMutableBuilder[Self <: GetRestrictionsForOrg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRestrictionsForOrg(value: `159`): Self = StObject.set(x, "getRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRestrictionsForRepo(value: `160`): Self = StObject.set(x, "getRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestrictionsForOrg(value: `161`): Self = StObject.set(x, "removeRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRestrictionsForRepo(value: `162`): Self = StObject.set(x, "removeRestrictionsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRestrictionsForOrg(value: `163`): Self = StObject.set(x, "setRestrictionsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRestrictionsForRepo(value: `164`): Self = StObject.set(x, "setRestrictionsForRepo", value.asInstanceOf[js.Any])
  }
}
