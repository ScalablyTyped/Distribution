package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAlert extends StObject {
  
  /**
    * Gets a single secret scanning alert detected in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  def getAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  def getAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  /**
    * Gets a single secret scanning alert detected in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  @JSName("getAlert")
  var getAlert_Original: `708`
  
  /**
    * Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.
    * To use this endpoint, you must be a member of the enterprise, and you must use an access token with the `repo` scope or `security_events` scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).
    */
  def listAlertsForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/secret-scanning/alerts']['response'] */ js.Any
  ]
  def listAlertsForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/secret-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/secret-scanning/alerts']['response'] */ js.Any
  ]
  /**
    * Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.
    * To use this endpoint, you must be a member of the enterprise, and you must use an access token with the `repo` scope or `security_events` scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).
    */
  @JSName("listAlertsForEnterprise")
  var listAlertsForEnterprise_Original: `709`
  
  /**
    * Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  def listAlertsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/secret-scanning/alerts']['response'] */ js.Any
  ]
  def listAlertsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/secret-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/secret-scanning/alerts']['response'] */ js.Any
  ]
  /**
    * Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  @JSName("listAlertsForOrg")
  var listAlertsForOrg_Original: `710`
  
  /**
    * Lists secret scanning alerts for an eligible repository, from newest to oldest.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  def listAlertsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts']['response'] */ js.Any
  ]
  def listAlertsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts']['response'] */ js.Any
  ]
  /**
    * Lists secret scanning alerts for an eligible repository, from newest to oldest.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  @JSName("listAlertsForRepo")
  var listAlertsForRepo_Original: `711`
  
  /**
    * Lists all locations for a given secret scanning alert for an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  def listLocationsForAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations']['response'] */ js.Any
  ]
  def listLocationsForAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations']['response'] */ js.Any
  ]
  /**
    * Lists all locations for a given secret scanning alert for an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  @JSName("listLocationsForAlert")
  var listLocationsForAlert_Original: `712`
  
  /**
    * Updates the status of a secret scanning alert in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` write permission to use this endpoint.
    */
  def updateAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  def updateAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  /**
    * Updates the status of a secret scanning alert in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` write permission to use this endpoint.
    */
  @JSName("updateAlert")
  var updateAlert_Original: `713`
}
object GetAlert {
  
  inline def apply(
    getAlert: `708`,
    listAlertsForEnterprise: `709`,
    listAlertsForOrg: `710`,
    listAlertsForRepo: `711`,
    listLocationsForAlert: `712`,
    updateAlert: `713`
  ): GetAlert = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAlert]
  }
  
  extension [Self <: GetAlert](x: Self) {
    
    inline def setGetAlert(value: `708`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `709`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `710`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `711`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `712`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `713`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
