package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.startup_failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detailsurl extends StObject {
  
  var app: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
  
  var check_suite: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-check-suite'] */ js.Any
  
  /**
    * Format: date-time
    * @example 2018-05-04T01:14:52Z
    */
  var completed_at: String | Null
  
  /**
    * @example neutral
    * @enum {string|null}
    */
  var conclusion: waiting | pending | startup_failure | stale | success | failure | neutral | cancelled | skipped | timed_out | action_required | Null
  
  var deployment: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-simple'] */ js.Any
  ] = js.undefined
  
  /** @example https://example.com */
  var details_url: String
  
  /** @example 42 */
  var external_id: String
  
  /**
    * @description The SHA of the commit that is being checked.
    * @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d
    */
  var head_sha: String
  
  /** @example https://github.com/github/hello-world/runs/4 */
  var html_url: String
  
  /**
    * @description The id of the check.
    * @example 21
    */
  var id: Double
  
  /**
    * @description The name of the check.
    * @example test-coverage
    */
  var name: String
  
  /** @example MDg6Q2hlY2tSdW40 */
  var node_id: String
  
  var output: Annotationsurl
  
  var pull_requests: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['pull-request-minimal'] */ js.Any
  ]
  
  /**
    * Format: date-time
    * @example 2018-05-04T01:14:52Z
    */
  var started_at: String
  
  /**
    * @description The phase of the lifecycle that the check is currently in.
    * @example queued
    * @enum {string}
    */
  var status: queued_ | in_progress | completed | pending
  
  /** @example https://api.github.com/repos/github/hello-world/check-runs/4 */
  var url: String
}
object Detailsurl {
  
  inline def apply(
    app: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any,
    check_suite: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-check-suite'] */ js.Any,
    details_url: String,
    external_id: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    output: Annotationsurl,
    pull_requests: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['pull-request-minimal'] */ js.Any
    ],
    started_at: String,
    status: queued_ | in_progress | completed | pending,
    url: String
  ): Detailsurl = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], check_suite = check_suite.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], completed_at = null, conclusion = null)
    __obj.asInstanceOf[Detailsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detailsurl] (val x: Self) extends AnyVal {
    
    inline def setApp(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
    ): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-check-suite'] */ js.Any
    ): Self = StObject.set(x, "check_suite", value.asInstanceOf[js.Any])
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setConclusion(
      value: waiting | pending | startup_failure | stale | success | failure | neutral | cancelled | skipped | timed_out | action_required
    ): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setDeployment(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-simple'] */ js.Any
    ): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Annotationsurl): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['pull-request-minimal'] */ js.Any
        ]
    ): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['pull-request-minimal'] */ js.Any)*
    ): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: queued_ | in_progress | completed | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
