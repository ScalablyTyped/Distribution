package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysis extends StObject {
  
  /**
    * Deletes a specified code scanning analysis from a repository. For
    * private repositories, you must use an access token with the `repo` scope. For public repositories,
    * you must use an access token with `public_repo` scope.
    * GitHub Apps must have the `security_events` write permission to use this endpoint.
    *
    * You can delete one analysis at a time.
    * To delete a series of analyses, start with the most recent analysis and work backwards.
    * Conceptually, the process is similar to the undo function in a text editor.
    *
    * When you list the analyses for a repository,
    * one or more will be identified as deletable in the response:
    *
    * ```
    * "deletable": true
    * ```
    *
    * An analysis is deletable when it's the most recent in a set of analyses.
    * Typically, a repository will have multiple sets of analyses
    * for each enabled code scanning tool,
    * where a set is determined by a unique combination of analysis values:
    *
    * * `ref`
    * * `tool`
    * * `category`
    *
    * If you attempt to delete an analysis that is not the most recent in a set,
    * you'll get a 400 response with the message:
    *
    * ```
    * Analysis specified is not deletable.
    * ```
    *
    * The response from a successful `DELETE` operation provides you with
    * two alternative URLs for deleting the next analysis in the set:
    * `next_analysis_url` and `confirm_delete_url`.
    * Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis
    * in a set. This is a useful option if you want to preserve at least one analysis
    * for the specified tool in your repository.
    * Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool.
    * When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url`
    * in the 200 response is `null`.
    *
    * As an example of the deletion process,
    * let's imagine that you added a workflow that configured a particular code scanning tool
    * to analyze the code in a repository. This tool has added 15 analyses:
    * 10 on the default branch, and another 5 on a topic branch.
    * You therefore have two separate sets of analyses for this tool.
    * You've now decided that you want to remove all of the analyses for the tool.
    * To do this you must make 15 separate deletion requests.
    * To start, you must find an analysis that's identified as deletable.
    * Each set of analyses always has one that's identified as deletable.
    * Having found the deletable analysis for one of the two sets,
    * delete this analysis and then continue deleting the next analysis in the set until they're all deleted.
    * Then repeat the process for the second set.
    * The procedure therefore consists of a nested loop:
    *
    * **Outer loop**:
    * * List the analyses for the repository, filtered by tool.
    * * Parse this list to find a deletable analysis. If found:
    *
    *   **Inner loop**:
    *   * Delete the identified analysis.
    *   * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.
    *
    * The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface, for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's analysis entirely.
    */
  def deleteAnalysis(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}{?confirm_delete}']['response'] */ js.Any
  ]
  def deleteAnalysis(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}{?confirm_delete}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}{?confirm_delete}']['response'] */ js.Any
  ]
  /**
    * Deletes a specified code scanning analysis from a repository. For
    * private repositories, you must use an access token with the `repo` scope. For public repositories,
    * you must use an access token with `public_repo` scope.
    * GitHub Apps must have the `security_events` write permission to use this endpoint.
    *
    * You can delete one analysis at a time.
    * To delete a series of analyses, start with the most recent analysis and work backwards.
    * Conceptually, the process is similar to the undo function in a text editor.
    *
    * When you list the analyses for a repository,
    * one or more will be identified as deletable in the response:
    *
    * ```
    * "deletable": true
    * ```
    *
    * An analysis is deletable when it's the most recent in a set of analyses.
    * Typically, a repository will have multiple sets of analyses
    * for each enabled code scanning tool,
    * where a set is determined by a unique combination of analysis values:
    *
    * * `ref`
    * * `tool`
    * * `category`
    *
    * If you attempt to delete an analysis that is not the most recent in a set,
    * you'll get a 400 response with the message:
    *
    * ```
    * Analysis specified is not deletable.
    * ```
    *
    * The response from a successful `DELETE` operation provides you with
    * two alternative URLs for deleting the next analysis in the set:
    * `next_analysis_url` and `confirm_delete_url`.
    * Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis
    * in a set. This is a useful option if you want to preserve at least one analysis
    * for the specified tool in your repository.
    * Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool.
    * When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url`
    * in the 200 response is `null`.
    *
    * As an example of the deletion process,
    * let's imagine that you added a workflow that configured a particular code scanning tool
    * to analyze the code in a repository. This tool has added 15 analyses:
    * 10 on the default branch, and another 5 on a topic branch.
    * You therefore have two separate sets of analyses for this tool.
    * You've now decided that you want to remove all of the analyses for the tool.
    * To do this you must make 15 separate deletion requests.
    * To start, you must find an analysis that's identified as deletable.
    * Each set of analyses always has one that's identified as deletable.
    * Having found the deletable analysis for one of the two sets,
    * delete this analysis and then continue deleting the next analysis in the set until they're all deleted.
    * Then repeat the process for the second set.
    * The procedure therefore consists of a nested loop:
    *
    * **Outer loop**:
    * * List the analyses for the repository, filtered by tool.
    * * Parse this list to find a deletable analysis. If found:
    *
    *   **Inner loop**:
    *   * Delete the identified analysis.
    *   * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.
    *
    * The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface, for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's analysis entirely.
    */
  @JSName("deleteAnalysis")
  var deleteAnalysis_Original: `209`
  
  /**
    * Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def getAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  def getAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  /**
    * Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("getAlert")
  var getAlert_Original: `210`
  
  /**
    * Gets a specified code scanning analysis for a repository.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * The default JSON response contains fields that describe the analysis.
    * This includes the Git reference and commit SHA to which the analysis relates,
    * the datetime of the analysis, the name of the code scanning tool,
    * and the number of alerts.
    *
    * The `rules_count` field in the default response give the number of rules
    * that were run in the analysis.
    * For very old analyses this data is not available,
    * and `0` is returned in this field.
    *
    * If you use the Accept header `application/sarif+json`,
    * the response contains the analysis data that was uploaded.
    * This is formatted as
    * [SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html).
    */
  def getAnalysis(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}']['response'] */ js.Any
  ]
  def getAnalysis(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specified code scanning analysis for a repository.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * The default JSON response contains fields that describe the analysis.
    * This includes the Git reference and commit SHA to which the analysis relates,
    * the datetime of the analysis, the name of the code scanning tool,
    * and the number of alerts.
    *
    * The `rules_count` field in the default response give the number of rules
    * that were run in the analysis.
    * For very old analyses this data is not available,
    * and `0` is returned in this field.
    *
    * If you use the Accept header `application/sarif+json`,
    * the response contains the analysis data that was uploaded.
    * This is formatted as
    * [SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html).
    */
  @JSName("getAnalysis")
  var getAnalysis_Original: `211`
  
  /**
    * Gets a CodeQL database for a language in a repository.
    *
    * By default this endpoint returns JSON metadata about the CodeQL database. To
    * download the CodeQL database binary content, set the `Accept` header of the request
    * to [`application/zip`](https://docs.github.com/rest/overview/media-types), and make sure
    * your HTTP client is configured to follow redirects or use the `Location` header
    * to make a second request to get the redirect URL.
    *
    * For private repositories, you must use an access token with the `security_events` scope.
    * For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
    * GitHub Apps must have the `contents` read permission to use this endpoint.
    */
  def getCodeqlDatabase(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/codeql/databases/{language}']['response'] */ js.Any
  ]
  def getCodeqlDatabase(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/codeql/databases/{language}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/codeql/databases/{language}']['response'] */ js.Any
  ]
  /**
    * Gets a CodeQL database for a language in a repository.
    *
    * By default this endpoint returns JSON metadata about the CodeQL database. To
    * download the CodeQL database binary content, set the `Accept` header of the request
    * to [`application/zip`](https://docs.github.com/rest/overview/media-types), and make sure
    * your HTTP client is configured to follow redirects or use the `Location` header
    * to make a second request to get the redirect URL.
    *
    * For private repositories, you must use an access token with the `security_events` scope.
    * For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
    * GitHub Apps must have the `contents` read permission to use this endpoint.
    */
  @JSName("getCodeqlDatabase")
  var getCodeqlDatabase_Original: `212`
  
  /**
    * Gets a code scanning default setup configuration.
    * You must use an access token with the `repo` scope to use this endpoint with private repos or the `public_repo`
    * scope for public repos. GitHub Apps must have the `repo` write permission to use this endpoint.
    */
  def getDefaultSetup(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/default-setup']['response'] */ js.Any
  ]
  def getDefaultSetup(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/default-setup']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/default-setup']['response'] */ js.Any
  ]
  /**
    * Gets a code scanning default setup configuration.
    * You must use an access token with the `repo` scope to use this endpoint with private repos or the `public_repo`
    * scope for public repos. GitHub Apps must have the `repo` write permission to use this endpoint.
    */
  @JSName("getDefaultSetup")
  var getDefaultSetup_Original: `213`
  
  /**
    * Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository)." You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def getSarif(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id}']['response'] */ js.Any
  ]
  def getSarif(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id}']['response'] */ js.Any
  ]
  /**
    * Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository)." You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("getSarif")
  var getSarif_Original: `214`
  
  /**
    * Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def listAlertInstances(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances']['response'] */ js.Any
  ]
  def listAlertInstances(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances']['response'] */ js.Any
  ]
  /**
    * Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("listAlertInstances")
  var listAlertInstances_Original: `215`
  
  /**
    * Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    *
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def listAlertsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/code-scanning/alerts']['response'] */ js.Any
  ]
  def listAlertsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/code-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/code-scanning/alerts']['response'] */ js.Any
  ]
  /**
    * Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    *
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("listAlertsForOrg")
  var listAlertsForOrg_Original: `216`
  
  /**
    * Lists all open code scanning alerts for the default branch (usually `main`
    * or `master`). You must use an access token with the `security_events` scope to use
    * this endpoint with private repos, the `public_repo` scope also grants permission to read
    * security events on public repos only. GitHub Apps must have the `security_events` read
    * permission to use this endpoint.
    *
    * The response includes a `most_recent_instance` object.
    * This provides details of the most recent instance of this alert
    * for the default branch or for the specified Git reference
    * (if you used `ref` in the request).
    */
  def listAlertsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts']['response'] */ js.Any
  ]
  def listAlertsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts']['response'] */ js.Any
  ]
  /**
    * Lists all open code scanning alerts for the default branch (usually `main`
    * or `master`). You must use an access token with the `security_events` scope to use
    * this endpoint with private repos, the `public_repo` scope also grants permission to read
    * security events on public repos only. GitHub Apps must have the `security_events` read
    * permission to use this endpoint.
    *
    * The response includes a `most_recent_instance` object.
    * This provides details of the most recent instance of this alert
    * for the default branch or for the specified Git reference
    * (if you used `ref` in the request).
    */
  @JSName("listAlertsForRepo")
  var listAlertsForRepo_Original: `217`
  
  /**
    * Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    * @deprecated octokit.rest.codeScanning.listAlertsInstances() has been renamed to octokit.rest.codeScanning.listAlertInstances() (2021-04-30)
    */
  def listAlertsInstances(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances']['response'] */ js.Any
  ]
  def listAlertsInstances(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances']['response'] */ js.Any
  ]
  /**
    * Lists all instances of the specified code scanning alert.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    * @deprecated octokit.rest.codeScanning.listAlertsInstances() has been renamed to octokit.rest.codeScanning.listAlertInstances() (2021-04-30)
    */
  @JSName("listAlertsInstances")
  var listAlertsInstances_Original: `215`
  
  /**
    * Lists the CodeQL databases that are available in a repository.
    *
    * For private repositories, you must use an access token with the `security_events` scope.
    * For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
    * GitHub Apps must have the `contents` read permission to use this endpoint.
    */
  def listCodeqlDatabases(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/codeql/databases']['response'] */ js.Any
  ]
  def listCodeqlDatabases(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/codeql/databases']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/codeql/databases']['response'] */ js.Any
  ]
  /**
    * Lists the CodeQL databases that are available in a repository.
    *
    * For private repositories, you must use an access token with the `security_events` scope.
    * For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
    * GitHub Apps must have the `contents` read permission to use this endpoint.
    */
  @JSName("listCodeqlDatabases")
  var listCodeqlDatabases_Original: `218`
  
  /**
    * Lists the details of all code scanning analyses for a repository,
    * starting with the most recent.
    * The response is paginated and you can use the `page` and `per_page` parameters
    * to list the analyses you're interested in.
    * By default 30 analyses are listed per page.
    *
    * The `rules_count` field in the response give the number of rules
    * that were run in the analysis.
    * For very old analyses this data is not available,
    * and `0` is returned in this field.
    *
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * **Deprecation notice**:
    * The `tool_name` field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the `tool` field.
    */
  def listRecentAnalyses(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/analyses']['response'] */ js.Any
  ]
  def listRecentAnalyses(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/analyses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/code-scanning/analyses']['response'] */ js.Any
  ]
  /**
    * Lists the details of all code scanning analyses for a repository,
    * starting with the most recent.
    * The response is paginated and you can use the `page` and `per_page` parameters
    * to list the analyses you're interested in.
    * By default 30 analyses are listed per page.
    *
    * The `rules_count` field in the response give the number of rules
    * that were run in the analysis.
    * For very old analyses this data is not available,
    * and `0` is returned in this field.
    *
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * **Deprecation notice**:
    * The `tool_name` field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the `tool` field.
    */
  @JSName("listRecentAnalyses")
  var listRecentAnalyses_Original: `219`
  
  /**
    * Updates the status of a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.
    */
  def updateAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  def updateAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}']['response'] */ js.Any
  ]
  /**
    * Updates the status of a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.
    */
  @JSName("updateAlert")
  var updateAlert_Original: `220`
  
  /**
    * Updates a code scanning default setup configuration.
    * You must use an access token with the `repo` scope to use this endpoint with private repos or the `public_repo`
    * scope for public repos. GitHub Apps must have the `repo` write permission to use this endpoint.
    */
  def updateDefaultSetup(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/code-scanning/default-setup']['response'] */ js.Any
  ]
  def updateDefaultSetup(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/code-scanning/default-setup']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/code-scanning/default-setup']['response'] */ js.Any
  ]
  /**
    * Updates a code scanning default setup configuration.
    * You must use an access token with the `repo` scope to use this endpoint with private repos or the `public_repo`
    * scope for public repos. GitHub Apps must have the `repo` write permission to use this endpoint.
    */
  @JSName("updateDefaultSetup")
  var updateDefaultSetup_Original: `221`
  
  /**
    * Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the `security_events` scope to use this endpoint for private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.
    *
    * There are two places where you can upload code scanning results.
    *  - If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the results appear as alerts in a pull request check. For more information, see "[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests)."
    *  - If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security** tab for your repository. For more information, see "[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository)."
    *
    * You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a Base64 format string. For example:
    *
    * ```
    * gzip -c analysis-data.sarif | base64 -w0
    * ```
    * <br>
    * SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable.
    * To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration. For example, for the CodeQL tool, identify and remove the most noisy queries.
    *
    *
    * | **SARIF data**                   | **Maximum values** | **Additional limits**                                                            |
    * |----------------------------------|:------------------:|----------------------------------------------------------------------------------|
    * | Runs per file                    |         20         |                                                                                  |
    * | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            |
    * | Rules per run                    |       25,000       |                                                                                  |
    * | Tool extensions per run          |        100         |                                                                                  |
    * | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. |
    * | Location per result	             |       1,000        | Only 100 locations will be included.                                             |
    * | Tags per rule	                   |         20         | Only 10 tags will be included.                                                   |
    *
    *
    * The `202 Accepted` response includes an `id` value.
    * You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint.
    * For more information, see "[Get information about a SARIF upload](/rest/reference/code-scanning#get-information-about-a-sarif-upload)."
    */
  def uploadSarif(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/code-scanning/sarifs']['response'] */ js.Any
  ]
  def uploadSarif(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/code-scanning/sarifs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/code-scanning/sarifs']['response'] */ js.Any
  ]
  /**
    * Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the `security_events` scope to use this endpoint for private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.
    *
    * There are two places where you can upload code scanning results.
    *  - If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the results appear as alerts in a pull request check. For more information, see "[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests)."
    *  - If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security** tab for your repository. For more information, see "[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository)."
    *
    * You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a Base64 format string. For example:
    *
    * ```
    * gzip -c analysis-data.sarif | base64 -w0
    * ```
    * <br>
    * SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable.
    * To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration. For example, for the CodeQL tool, identify and remove the most noisy queries.
    *
    *
    * | **SARIF data**                   | **Maximum values** | **Additional limits**                                                            |
    * |----------------------------------|:------------------:|----------------------------------------------------------------------------------|
    * | Runs per file                    |         20         |                                                                                  |
    * | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            |
    * | Rules per run                    |       25,000       |                                                                                  |
    * | Tool extensions per run          |        100         |                                                                                  |
    * | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. |
    * | Location per result	             |       1,000        | Only 100 locations will be included.                                             |
    * | Tags per rule	                   |         20         | Only 10 tags will be included.                                                   |
    *
    *
    * The `202 Accepted` response includes an `id` value.
    * You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint.
    * For more information, see "[Get information about a SARIF upload](/rest/reference/code-scanning#get-information-about-a-sarif-upload)."
    */
  @JSName("uploadSarif")
  var uploadSarif_Original: `222`
}
object DeleteAnalysis {
  
  inline def apply(
    deleteAnalysis: `209`,
    getAlert: `210`,
    getAnalysis: `211`,
    getCodeqlDatabase: `212`,
    getDefaultSetup: `213`,
    getSarif: `214`,
    listAlertInstances: `215`,
    listAlertsForOrg: `216`,
    listAlertsForRepo: `217`,
    listAlertsInstances: `215`,
    listCodeqlDatabases: `218`,
    listRecentAnalyses: `219`,
    updateAlert: `220`,
    updateDefaultSetup: `221`,
    uploadSarif: `222`
  ): DeleteAnalysis = {
    val __obj = js.Dynamic.literal(deleteAnalysis = deleteAnalysis.asInstanceOf[js.Any], getAlert = getAlert.asInstanceOf[js.Any], getAnalysis = getAnalysis.asInstanceOf[js.Any], getCodeqlDatabase = getCodeqlDatabase.asInstanceOf[js.Any], getDefaultSetup = getDefaultSetup.asInstanceOf[js.Any], getSarif = getSarif.asInstanceOf[js.Any], listAlertInstances = listAlertInstances.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listAlertsInstances = listAlertsInstances.asInstanceOf[js.Any], listCodeqlDatabases = listCodeqlDatabases.asInstanceOf[js.Any], listRecentAnalyses = listRecentAnalyses.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any], updateDefaultSetup = updateDefaultSetup.asInstanceOf[js.Any], uploadSarif = uploadSarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAnalysis] (val x: Self) extends AnyVal {
    
    inline def setDeleteAnalysis(value: `209`): Self = StObject.set(x, "deleteAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetAlert(value: `210`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetAnalysis(value: `211`): Self = StObject.set(x, "getAnalysis", value.asInstanceOf[js.Any])
    
    inline def setGetCodeqlDatabase(value: `212`): Self = StObject.set(x, "getCodeqlDatabase", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultSetup(value: `213`): Self = StObject.set(x, "getDefaultSetup", value.asInstanceOf[js.Any])
    
    inline def setGetSarif(value: `214`): Self = StObject.set(x, "getSarif", value.asInstanceOf[js.Any])
    
    inline def setListAlertInstances(value: `215`): Self = StObject.set(x, "listAlertInstances", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `216`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `217`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListAlertsInstances(value: `215`): Self = StObject.set(x, "listAlertsInstances", value.asInstanceOf[js.Any])
    
    inline def setListCodeqlDatabases(value: `218`): Self = StObject.set(x, "listCodeqlDatabases", value.asInstanceOf[js.Any])
    
    inline def setListRecentAnalyses(value: `219`): Self = StObject.set(x, "listRecentAnalyses", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `220`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
    
    inline def setUpdateDefaultSetup(value: `221`): Self = StObject.set(x, "updateDefaultSetup", value.asInstanceOf[js.Any])
    
    inline def setUploadSarif(value: `222`): Self = StObject.set(x, "uploadSarif", value.asInstanceOf[js.Any])
  }
}
