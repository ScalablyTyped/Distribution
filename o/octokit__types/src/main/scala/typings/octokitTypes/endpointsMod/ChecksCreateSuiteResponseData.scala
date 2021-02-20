package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksCreateSuiteResponseData extends StObject {
  
  var after: String = js.native
  
  var app: Events = js.native
  
  var before: String = js.native
  
  var conclusion: String = js.native
  
  var head_branch: String = js.native
  
  var head_sha: String = js.native
  
  var id: Double = js.native
  
  var node_id: String = js.native
  
  var pull_requests: js.Array[_] = js.native
  
  var repository: Allowmergecommit = js.native
  
  var status: String = js.native
  
  var url: String = js.native
}
object ChecksCreateSuiteResponseData {
  
  @scala.inline
  def apply(
    after: String,
    app: Events,
    before: String,
    conclusion: String,
    head_branch: String,
    head_sha: String,
    id: Double,
    node_id: String,
    pull_requests: js.Array[_],
    repository: Allowmergecommit,
    status: String,
    url: String
  ): ChecksCreateSuiteResponseData = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateSuiteResponseData]
  }
  
  @scala.inline
  implicit class ChecksCreateSuiteResponseDataMutableBuilder[Self <: ChecksCreateSuiteResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: Events): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requests(value: js.Array[_]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requestsVarargs(value: js.Any*): Self = StObject.set(x, "pull_requests", js.Array(value :_*))
    
    @scala.inline
    def setRepository(value: Allowmergecommit): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
