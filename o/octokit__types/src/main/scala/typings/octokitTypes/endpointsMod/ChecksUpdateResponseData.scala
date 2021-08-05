package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Annotationsurl
import typings.octokitTypes.anon.Base
import typings.octokitTypes.anon.Events
import typings.octokitTypes.anon.IdNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksUpdateResponseData extends StObject {
  
  var app: Events
  
  var check_suite: IdNumber
  
  var completed_at: String
  
  var conclusion: String
  
  var details_url: String
  
  var external_id: String
  
  var head_sha: String
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var output: Annotationsurl
  
  var pull_requests: js.Array[Base]
  
  var started_at: String
  
  var status: String
  
  var url: String
}
object ChecksUpdateResponseData {
  
  inline def apply(
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
    output: Annotationsurl,
    pull_requests: js.Array[Base],
    started_at: String,
    status: String,
    url: String
  ): ChecksUpdateResponseData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], check_suite = check_suite.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateResponseData]
  }
  
  extension [Self <: ChecksUpdateResponseData](x: Self) {
    
    inline def setApp(value: Events): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite(value: IdNumber): Self = StObject.set(x, "check_suite", value.asInstanceOf[js.Any])
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Annotationsurl): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(value: js.Array[Base]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(value: Base*): Self = StObject.set(x, "pull_requests", js.Array(value :_*))
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
