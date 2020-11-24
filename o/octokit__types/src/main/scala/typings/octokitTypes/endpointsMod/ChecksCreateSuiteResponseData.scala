package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksCreateSuiteResponseData extends js.Object {
  
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
  implicit class ChecksCreateSuiteResponseDataOps[Self <: ChecksCreateSuiteResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: Events): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusion(value: String): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_branch(value: String): Self = this.set("head_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_sha(value: String): Self = this.set("head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requestsVarargs(value: js.Any*): Self = this.set("pull_requests", js.Array(value :_*))
    
    @scala.inline
    def setPull_requests(value: js.Array[_]): Self = this.set("pull_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Allowmergecommit): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
