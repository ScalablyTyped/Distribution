package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checksuite extends StObject {
  
  var app: Clientsecret | Null
  
  var check_suite: IdNumber | Null
  
  /**
    * Format: date-time
    * @example 2018-05-04T01:14:52Z
    */
  var completed_at: String | Null
  
  /**
    * @example neutral
    * @enum {string|null}
    */
  var conclusion: success | failure | neutral | cancelled | skipped | timed_out | action_required | Null
  
  var deployment: js.UndefOr[Performedviagithubapp] = js.undefined
  
  /** @example https://example.com */
  var details_url: String | Null
  
  /** @example 42 */
  var external_id: String | Null
  
  /**
    * @description The SHA of the commit that is being checked.
    * @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d
    */
  var head_sha: String
  
  /** @example https://github.com/github/hello-world/runs/4 */
  var html_url: String | Null
  
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
  
  var output: Annotationscount
  
  var pull_requests: js.Array[Base]
  
  /**
    * Format: date-time
    * @example 2018-05-04T01:14:52Z
    */
  var started_at: String | Null
  
  /**
    * @description The phase of the lifecycle that the check is currently in.
    * @example queued
    * @enum {string}
    */
  var status: queued_ | in_progress | completed
  
  /** @example https://api.github.com/repos/github/hello-world/check-runs/4 */
  var url: String
}
object Checksuite {
  
  inline def apply(
    head_sha: String,
    id: Double,
    name: String,
    node_id: String,
    output: Annotationscount,
    pull_requests: js.Array[Base],
    status: queued_ | in_progress | completed,
    url: String
  ): Checksuite = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], app = null, check_suite = null, completed_at = null, conclusion = null, details_url = null, external_id = null, html_url = null, started_at = null)
    __obj.asInstanceOf[Checksuite]
  }
  
  extension [Self <: Checksuite](x: Self) {
    
    inline def setApp(value: Clientsecret): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppNull: Self = StObject.set(x, "app", null)
    
    inline def setCheck_suite(value: IdNumber): Self = StObject.set(x, "check_suite", value.asInstanceOf[js.Any])
    
    inline def setCheck_suiteNull: Self = StObject.set(x, "check_suite", null)
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setConclusion(value: success | failure | neutral | cancelled | skipped | timed_out | action_required): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setDeployment(value: Performedviagithubapp): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    inline def setDetails_urlNull: Self = StObject.set(x, "details_url", null)
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Annotationscount): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(value: js.Array[Base]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(value: Base*): Self = StObject.set(x, "pull_requests", js.Array(value*))
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStarted_atNull: Self = StObject.set(x, "started_at", null)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
