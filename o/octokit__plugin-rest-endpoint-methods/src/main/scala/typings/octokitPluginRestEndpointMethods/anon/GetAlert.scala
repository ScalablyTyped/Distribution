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
  var getAlert_Original: `725`
  
  /**
    * Gets code security and analysis settings for the specified enterprise.
    * To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.
    */
  def getSecurityAnalysisSettingsForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/code_security_and_analysis']['response'] */ js.Any
  ]
  def getSecurityAnalysisSettingsForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/code_security_and_analysis']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/code_security_and_analysis']['response'] */ js.Any
  ]
  /**
    * Gets code security and analysis settings for the specified enterprise.
    * To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.
    */
  @JSName("getSecurityAnalysisSettingsForEnterprise")
  var getSecurityAnalysisSettingsForEnterprise_Original: `726`
  
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
  var listAlertsForEnterprise_Original: `727`
  
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
  var listAlertsForOrg_Original: `728`
  
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
  var listAlertsForRepo_Original: `729`
  
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
  var listLocationsForAlert_Original: `730`
  
  /**
    * Updates the settings for advanced security, secret scanning, and push protection for new repositories in an enterprise.
    * To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.
    */
  def patchSecurityAnalysisSettingsForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /enterprises/{enterprise}/code_security_and_analysis']['response'] */ js.Any
  ]
  def patchSecurityAnalysisSettingsForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /enterprises/{enterprise}/code_security_and_analysis']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /enterprises/{enterprise}/code_security_and_analysis']['response'] */ js.Any
  ]
  /**
    * Updates the settings for advanced security, secret scanning, and push protection for new repositories in an enterprise.
    * To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.
    */
  @JSName("patchSecurityAnalysisSettingsForEnterprise")
  var patchSecurityAnalysisSettingsForEnterprise_Original: `731`
  
  /**
    * Enables or disables the specified security feature for all repositories in an enterprise.
    *
    * To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.
    */
  def postSecurityProductEnablementForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/{security_product}/{enablement}']['response'] */ js.Any
  ]
  def postSecurityProductEnablementForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/{security_product}/{enablement}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /enterprises/{enterprise}/{security_product}/{enablement}']['response'] */ js.Any
  ]
  /**
    * Enables or disables the specified security feature for all repositories in an enterprise.
    *
    * To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.
    */
  @JSName("postSecurityProductEnablementForEnterprise")
  var postSecurityProductEnablementForEnterprise_Original: `732`
  
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
  var updateAlert_Original: `733`
}
object GetAlert {
  
  inline def apply(
    getAlert: `725`,
    getSecurityAnalysisSettingsForEnterprise: `726`,
    listAlertsForEnterprise: `727`,
    listAlertsForOrg: `728`,
    listAlertsForRepo: `729`,
    listLocationsForAlert: `730`,
    patchSecurityAnalysisSettingsForEnterprise: `731`,
    postSecurityProductEnablementForEnterprise: `732`,
    updateAlert: `733`
  ): GetAlert = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], getSecurityAnalysisSettingsForEnterprise = getSecurityAnalysisSettingsForEnterprise.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listLocationsForAlert = listLocationsForAlert.asInstanceOf[js.Any], patchSecurityAnalysisSettingsForEnterprise = patchSecurityAnalysisSettingsForEnterprise.asInstanceOf[js.Any], postSecurityProductEnablementForEnterprise = postSecurityProductEnablementForEnterprise.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAlert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAlert] (val x: Self) extends AnyVal {
    
    inline def setGetAlert(value: `725`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetSecurityAnalysisSettingsForEnterprise(value: `726`): Self = StObject.set(x, "getSecurityAnalysisSettingsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `727`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `728`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `729`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListLocationsForAlert(value: `730`): Self = StObject.set(x, "listLocationsForAlert", value.asInstanceOf[js.Any])
    
    inline def setPatchSecurityAnalysisSettingsForEnterprise(value: `731`): Self = StObject.set(x, "patchSecurityAnalysisSettingsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setPostSecurityProductEnablementForEnterprise(value: `732`): Self = StObject.set(x, "postSecurityProductEnablementForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `733`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
