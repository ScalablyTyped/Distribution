package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomLabelsToSelfHostedRunnerForEnterprise extends StObject {
  
  /**
    * Add custom labels to a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  def addCustomLabelsToSelfHostedRunnerForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def addCustomLabelsToSelfHostedRunnerForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Add custom labels to a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  @JSName("addCustomLabelsToSelfHostedRunnerForEnterprise")
  var addCustomLabelsToSelfHostedRunnerForEnterprise_Original: `284`
  
  /**
    * Adds an organization to the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def enableSelectedOrganizationGithubActionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/organizations/{org_id}']['response'] */ js.Any
  ]
  def enableSelectedOrganizationGithubActionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/organizations/{org_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/organizations/{org_id}']['response'] */ js.Any
  ]
  /**
    * Adds an organization to the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("enableSelectedOrganizationGithubActionsEnterprise")
  var enableSelectedOrganizationGithubActionsEnterprise_Original: `285`
  
  /**
    * Lists all labels for a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  def listLabelsForSelfHostedRunnerForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def listLabelsForSelfHostedRunnerForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Lists all labels for a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  @JSName("listLabelsForSelfHostedRunnerForEnterprise")
  var listLabelsForSelfHostedRunnerForEnterprise_Original: `286`
}
object AddCustomLabelsToSelfHostedRunnerForEnterprise {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForEnterprise: `284`,
    enableSelectedOrganizationGithubActionsEnterprise: `285`,
    listLabelsForSelfHostedRunnerForEnterprise: `286`
  ): AddCustomLabelsToSelfHostedRunnerForEnterprise = {
    val __obj = js.Dynamic.literal(addCustomLabelsToSelfHostedRunnerForEnterprise = addCustomLabelsToSelfHostedRunnerForEnterprise.asInstanceOf[js.Any], enableSelectedOrganizationGithubActionsEnterprise = enableSelectedOrganizationGithubActionsEnterprise.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForEnterprise = listLabelsForSelfHostedRunnerForEnterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLabelsToSelfHostedRunnerForEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCustomLabelsToSelfHostedRunnerForEnterprise] (val x: Self) extends AnyVal {
    
    inline def setAddCustomLabelsToSelfHostedRunnerForEnterprise(value: `284`): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedOrganizationGithubActionsEnterprise(value: `285`): Self = StObject.set(x, "enableSelectedOrganizationGithubActionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForEnterprise(value: `286`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
  }
}
