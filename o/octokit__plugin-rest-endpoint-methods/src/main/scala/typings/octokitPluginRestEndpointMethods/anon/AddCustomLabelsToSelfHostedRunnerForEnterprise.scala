package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
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
  var addCustomLabelsToSelfHostedRunnerForEnterprise_Original: `239`
  
  /**
    * Removes an organization from the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def disableSelectedOrganizationGithubActionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/permissions/organizations/{org_id}']['response'] */ js.Any
  ]
  def disableSelectedOrganizationGithubActionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/permissions/organizations/{org_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/permissions/organizations/{org_id}']['response'] */ js.Any
  ]
  /**
    * Removes an organization from the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("disableSelectedOrganizationGithubActionsEnterprise")
  var disableSelectedOrganizationGithubActionsEnterprise_Original: `240`
  
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
  var enableSelectedOrganizationGithubActionsEnterprise_Original: `241`
  
  /**
    * Gets the selected actions and reusable workflows that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def getAllowedActionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  def getAllowedActionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions/selected-actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  /**
    * Gets the selected actions and reusable workflows that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("getAllowedActionsEnterprise")
  var getAllowedActionsEnterprise_Original: `242`
  
  /**
    * Gets the GitHub Actions permissions policy for organizations and allowed actions and reusable workflows in an enterprise.
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def getGithubActionsPermissionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions']['response'] */ js.Any
  ]
  def getGithubActionsPermissionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Gets the GitHub Actions permissions policy for organizations and allowed actions and reusable workflows in an enterprise.
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("getGithubActionsPermissionsEnterprise")
  var getGithubActionsPermissionsEnterprise_Original: `243`
  
  /**
    * Returns aggregate usage metrics for your GitHub Enterprise Server 3.5+ instance for a specified time period up to 365 days.
    *
    * To use this endpoint, your GitHub Enterprise Server instance must be connected to GitHub Enterprise Cloud using GitHub Connect. You must enable Server Statistics, and for the API request provide your enterprise account name or organization name connected to the GitHub Enterprise Server. For more information, see "[Enabling Server Statistics for your enterprise](/admin/configuration/configuring-github-connect/enabling-server-statistics-for-your-enterprise)" in the GitHub Enterprise Server documentation.
    *
    * You'll need to use a personal access token:
    *   - If you connected your GitHub Enterprise Server to an enterprise account and enabled Server Statistics, you'll need a personal access token with the `read:enterprise` permission.
    *   - If you connected your GitHub Enterprise Server to an organization account and enabled Server Statistics, you'll need a personal access token with the `read:org` permission.
    *
    * For more information on creating a personal access token, see "[Creating a personal access token](/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token)."
    */
  def getServerStatistics(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprise-installation/{enterprise_or_org}/server-statistics']['response'] */ js.Any
  ]
  def getServerStatistics(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprise-installation/{enterprise_or_org}/server-statistics']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprise-installation/{enterprise_or_org}/server-statistics']['response'] */ js.Any
  ]
  /**
    * Returns aggregate usage metrics for your GitHub Enterprise Server 3.5+ instance for a specified time period up to 365 days.
    *
    * To use this endpoint, your GitHub Enterprise Server instance must be connected to GitHub Enterprise Cloud using GitHub Connect. You must enable Server Statistics, and for the API request provide your enterprise account name or organization name connected to the GitHub Enterprise Server. For more information, see "[Enabling Server Statistics for your enterprise](/admin/configuration/configuring-github-connect/enabling-server-statistics-for-your-enterprise)" in the GitHub Enterprise Server documentation.
    *
    * You'll need to use a personal access token:
    *   - If you connected your GitHub Enterprise Server to an enterprise account and enabled Server Statistics, you'll need a personal access token with the `read:enterprise` permission.
    *   - If you connected your GitHub Enterprise Server to an organization account and enabled Server Statistics, you'll need a personal access token with the `read:org` permission.
    *
    * For more information on creating a personal access token, see "[Creating a personal access token](/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token)."
    */
  @JSName("getServerStatistics")
  var getServerStatistics_Original: `244`
  
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
  var listLabelsForSelfHostedRunnerForEnterprise_Original: `245`
  
  /**
    * Lists the organizations that are selected to have GitHub Actions enabled in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def listSelectedOrganizationsEnabledGithubActionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions/organizations']['response'] */ js.Any
  ]
  def listSelectedOrganizationsEnabledGithubActionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions/organizations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/actions/permissions/organizations']['response'] */ js.Any
  ]
  /**
    * Lists the organizations that are selected to have GitHub Actions enabled in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("listSelectedOrganizationsEnabledGithubActionsEnterprise")
  var listSelectedOrganizationsEnabledGithubActionsEnterprise_Original: `246`
  
  /**
    * Remove all custom labels from a self-hosted runner configured in an
    * enterprise. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  def removeAllCustomLabelsFromSelfHostedRunnerForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def removeAllCustomLabelsFromSelfHostedRunnerForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Remove all custom labels from a self-hosted runner configured in an
    * enterprise. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  @JSName("removeAllCustomLabelsFromSelfHostedRunnerForEnterprise")
  var removeAllCustomLabelsFromSelfHostedRunnerForEnterprise_Original: `247`
  
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an enterprise. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  def removeCustomLabelFromSelfHostedRunnerForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/runners/{runner_id}/labels/{name}']['response'] */ js.Any
  ]
  def removeCustomLabelFromSelfHostedRunnerForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/runners/{runner_id}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /enterprises/{enterprise}/actions/runners/{runner_id}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an enterprise. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  @JSName("removeCustomLabelFromSelfHostedRunnerForEnterprise")
  var removeCustomLabelFromSelfHostedRunnerForEnterprise_Original: `248`
  
  /**
    * Sets the actions and reusable workflows that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def setAllowedActionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  def setAllowedActionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/selected-actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  /**
    * Sets the actions and reusable workflows that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("setAllowedActionsEnterprise")
  var setAllowedActionsEnterprise_Original: `249`
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  def setCustomLabelsForSelfHostedRunnerForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def setCustomLabelsForSelfHostedRunnerForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  @JSName("setCustomLabelsForSelfHostedRunnerForEnterprise")
  var setCustomLabelsForSelfHostedRunnerForEnterprise_Original: `250`
  
  /**
    * Sets the GitHub Actions permissions policy for organizations and allowed actions and reusable workflows in an enterprise.
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def setGithubActionsPermissionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions']['response'] */ js.Any
  ]
  def setGithubActionsPermissionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Sets the GitHub Actions permissions policy for organizations and allowed actions and reusable workflows in an enterprise.
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("setGithubActionsPermissionsEnterprise")
  var setGithubActionsPermissionsEnterprise_Original: `251`
  
  /**
    * Replaces the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  def setSelectedOrganizationsEnabledGithubActionsEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/organizations']['response'] */ js.Any
  ]
  def setSelectedOrganizationsEnabledGithubActionsEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/organizations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /enterprises/{enterprise}/actions/permissions/organizations']['response'] */ js.Any
  ]
  /**
    * Replaces the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  @JSName("setSelectedOrganizationsEnabledGithubActionsEnterprise")
  var setSelectedOrganizationsEnabledGithubActionsEnterprise_Original: `252`
}
object AddCustomLabelsToSelfHostedRunnerForEnterprise {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForEnterprise: `239`,
    disableSelectedOrganizationGithubActionsEnterprise: `240`,
    enableSelectedOrganizationGithubActionsEnterprise: `241`,
    getAllowedActionsEnterprise: `242`,
    getGithubActionsPermissionsEnterprise: `243`,
    getServerStatistics: `244`,
    listLabelsForSelfHostedRunnerForEnterprise: `245`,
    listSelectedOrganizationsEnabledGithubActionsEnterprise: `246`,
    removeAllCustomLabelsFromSelfHostedRunnerForEnterprise: `247`,
    removeCustomLabelFromSelfHostedRunnerForEnterprise: `248`,
    setAllowedActionsEnterprise: `249`,
    setCustomLabelsForSelfHostedRunnerForEnterprise: `250`,
    setGithubActionsPermissionsEnterprise: `251`,
    setSelectedOrganizationsEnabledGithubActionsEnterprise: `252`
  ): AddCustomLabelsToSelfHostedRunnerForEnterprise = {
    val __obj = js.Dynamic.literal(addCustomLabelsToSelfHostedRunnerForEnterprise = addCustomLabelsToSelfHostedRunnerForEnterprise.asInstanceOf[js.Any], disableSelectedOrganizationGithubActionsEnterprise = disableSelectedOrganizationGithubActionsEnterprise.asInstanceOf[js.Any], enableSelectedOrganizationGithubActionsEnterprise = enableSelectedOrganizationGithubActionsEnterprise.asInstanceOf[js.Any], getAllowedActionsEnterprise = getAllowedActionsEnterprise.asInstanceOf[js.Any], getGithubActionsPermissionsEnterprise = getGithubActionsPermissionsEnterprise.asInstanceOf[js.Any], getServerStatistics = getServerStatistics.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForEnterprise = listLabelsForSelfHostedRunnerForEnterprise.asInstanceOf[js.Any], listSelectedOrganizationsEnabledGithubActionsEnterprise = listSelectedOrganizationsEnabledGithubActionsEnterprise.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForEnterprise = removeAllCustomLabelsFromSelfHostedRunnerForEnterprise.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForEnterprise = removeCustomLabelFromSelfHostedRunnerForEnterprise.asInstanceOf[js.Any], setAllowedActionsEnterprise = setAllowedActionsEnterprise.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForEnterprise = setCustomLabelsForSelfHostedRunnerForEnterprise.asInstanceOf[js.Any], setGithubActionsPermissionsEnterprise = setGithubActionsPermissionsEnterprise.asInstanceOf[js.Any], setSelectedOrganizationsEnabledGithubActionsEnterprise = setSelectedOrganizationsEnabledGithubActionsEnterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLabelsToSelfHostedRunnerForEnterprise]
  }
  
  extension [Self <: AddCustomLabelsToSelfHostedRunnerForEnterprise](x: Self) {
    
    inline def setAddCustomLabelsToSelfHostedRunnerForEnterprise(value: `239`): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedOrganizationGithubActionsEnterprise(value: `240`): Self = StObject.set(x, "disableSelectedOrganizationGithubActionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedOrganizationGithubActionsEnterprise(value: `241`): Self = StObject.set(x, "enableSelectedOrganizationGithubActionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsEnterprise(value: `242`): Self = StObject.set(x, "getAllowedActionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsEnterprise(value: `243`): Self = StObject.set(x, "getGithubActionsPermissionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetServerStatistics(value: `244`): Self = StObject.set(x, "getServerStatistics", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForEnterprise(value: `245`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListSelectedOrganizationsEnabledGithubActionsEnterprise(value: `246`): Self = StObject.set(x, "listSelectedOrganizationsEnabledGithubActionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForEnterprise(value: `247`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForEnterprise(value: `248`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsEnterprise(value: `249`): Self = StObject.set(x, "setAllowedActionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForEnterprise(value: `250`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsEnterprise(value: `251`): Self = StObject.set(x, "setGithubActionsPermissionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedOrganizationsEnabledGithubActionsEnterprise(value: `252`): Self = StObject.set(x, "setSelectedOrganizationsEnabledGithubActionsEnterprise", value.asInstanceOf[js.Any])
  }
}
