package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Annotationscount
import typings.octokitTypes.anon.Base
import typings.octokitTypes.anon.Events
import typings.octokitTypes.anon.IdNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksCreateResponseData extends StObject {
  
  var app: Events = js.native
  
  var check_suite: IdNumber = js.native
  
  var completed_at: String = js.native
  
  var conclusion: String = js.native
  
  var details_url: String = js.native
  
  var external_id: String = js.native
  
  var head_sha: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var output: Annotationscount = js.native
  
  var pull_requests: js.Array[Base] = js.native
  
  var started_at: String = js.native
  
  var status: String = js.native
  
  var url: String = js.native
}
object ChecksCreateResponseData {
  
  @scala.inline
  def apply(
    app: Events,
    check_suite: IdNumber,
    completed_at: String,
    conclusion: String,
    details_url: String,
    external_id: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    output: Annotationscount,
    pull_requests: js.Array[Base],
    started_at: String,
    status: String,
    url: String
  ): ChecksCreateResponseData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], check_suite = check_suite.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateResponseData]
  }
  
  @scala.inline
  implicit class ChecksCreateResponseDataMutableBuilder[Self <: ChecksCreateResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: Events): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck_suite(value: IdNumber): Self = StObject.set(x, "check_suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Annotationscount): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requests(value: js.Array[Base]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requestsVarargs(value: Base*): Self = StObject.set(x, "pull_requests", js.Array(value :_*))
    
    @scala.inline
    def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
