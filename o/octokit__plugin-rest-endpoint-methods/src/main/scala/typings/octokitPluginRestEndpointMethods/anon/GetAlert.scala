package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAlert extends StObject {
  
  /**
    * Gets a single code scanning alert. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def getAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts/:alert_number']['response'] */ js.Any
  ]
  def getAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts/:alert_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts/:alert_number']['response'] */ js.Any
  ]
  /**
    * Gets a single code scanning alert. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("getAlert")
  var getAlert_Original: `115`
  
  /**
    * Lists all open code scanning alerts for the default branch (usually `master`) and protected branches in a repository. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def listAlertsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts']['response'] */ js.Any
  ]
  def listAlertsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts']['response'] */ js.Any
  ]
  /**
    * Lists all open code scanning alerts for the default branch (usually `master`) and protected branches in a repository. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("listAlertsForRepo")
  var listAlertsForRepo_Original: `116`
  
  /**
    * List the details of recent code scanning analyses for a repository. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def listRecentAnalyses(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/analyses']['response'] */ js.Any
  ]
  def listRecentAnalyses(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/analyses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/analyses']['response'] */ js.Any
  ]
  /**
    * List the details of recent code scanning analyses for a repository. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("listRecentAnalyses")
  var listRecentAnalyses_Original: `117`
  
  /**
    * Updates the status of a single code scanning alert. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes.
    * GitHub Apps must have the `security_events` write permission to use this endpoint.
    */
  def updateAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/code-scanning/alerts/:alert_number']['response'] */ js.Any
  ]
  def updateAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/code-scanning/alerts/:alert_number']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/:owner/:repo/code-scanning/alerts/:alert_number']['response'] */ js.Any
  ]
  /**
    * Updates the status of a single code scanning alert. For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes.
    * GitHub Apps must have the `security_events` write permission to use this endpoint.
    */
  @JSName("updateAlert")
  var updateAlert_Original: `118`
  
  /**
    * Upload a SARIF file containing the results of a code scanning analysis to make the results available in a repository.
    * For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes. GitHub Apps must have the `security_events` write permission to use this endpoint.
    */
  def uploadSarif(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/code-scanning/sarifs']['response'] */ js.Any
  ]
  def uploadSarif(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/code-scanning/sarifs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/code-scanning/sarifs']['response'] */ js.Any
  ]
  /**
    * Upload a SARIF file containing the results of a code scanning analysis to make the results available in a repository.
    * For private repos, you must use an access token with the `repo` scope. For public repos, you must use an access token with `public_repo` and `repo:security_events` scopes. GitHub Apps must have the `security_events` write permission to use this endpoint.
    */
  @JSName("uploadSarif")
  var uploadSarif_Original: `119`
}
object GetAlert {
  
  @scala.inline
  def apply(
    getAlert: `115`,
    listAlertsForRepo: `116`,
    listRecentAnalyses: `117`,
    updateAlert: `118`,
    uploadSarif: `119`
  ): GetAlert = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listRecentAnalyses = listRecentAnalyses.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any], uploadSarif = uploadSarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAlert]
  }
  
  @scala.inline
  implicit class GetAlertMutableBuilder[Self <: GetAlert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAlert(value: `115`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAlertsForRepo(value: `116`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRecentAnalyses(value: `117`): Self = StObject.set(x, "listRecentAnalyses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAlert(value: `118`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSarif(value: `119`): Self = StObject.set(x, "uploadSarif", value.asInstanceOf[js.Any])
  }
}
