package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: String
  
  var app: Events
  
  var before: String
  
  var conclusion: String
  
  var head_branch: String
  
  var head_sha: String
  
  var id: Double
  
  var node_id: String
  
  var pull_requests: js.Array[js.Any]
  
  var repository: Allowmergecommit
  
  var status: String
  
  var url: String
}
object After {
  
  inline def apply(
    after: String,
    app: Events,
    before: String,
    conclusion: String,
    head_branch: String,
    head_sha: String,
    id: Double,
    node_id: String,
    pull_requests: js.Array[js.Any],
    repository: Allowmergecommit,
    status: String,
    url: String
  ): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  extension [Self <: After](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setApp(value: Events): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(value: js.Array[js.Any]): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsVarargs(value: js.Any*): Self = StObject.set(x, "pull_requests", js.Array(value :_*))
    
    inline def setRepository(value: Allowmergecommit): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
