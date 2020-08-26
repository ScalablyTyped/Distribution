package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAlert extends js.Object {
  /**
    * Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint. GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * The security `alert_id` is found at the end of the security alert's URL. For example, the security alert ID for `https://github.com/Octo-org/octo-repo/security/code-scanning/88` is `88`.
    */
  @JSName("getAlert")
  var getAlert_Original: `115` = js.native
  /**
    * Lists all open code scanning alerts for the default branch (usually `master`) and protected branches in a repository. You must use an access token with the `security_events` scope to use this endpoint. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  @JSName("listAlertsForRepo")
  var listAlertsForRepo_Original: `116` = js.native
  /**
    * Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint. GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * The security `alert_id` is found at the end of the security alert's URL. For example, the security alert ID for `https://github.com/Octo-org/octo-repo/security/code-scanning/88` is `88`.
    */
  def getAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts/:alert_id']['response'] */ js.Any
  ] = js.native
  def getAlert(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts/:alert_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts/:alert_id']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all open code scanning alerts for the default branch (usually `master`) and protected branches in a repository. You must use an access token with the `security_events` scope to use this endpoint. GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  def listAlertsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts']['response'] */ js.Any
  ] = js.native
  def listAlertsForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/code-scanning/alerts']['response'] */ js.Any
  ] = js.native
}

