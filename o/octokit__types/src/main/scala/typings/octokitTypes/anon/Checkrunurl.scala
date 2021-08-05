package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkrunurl extends StObject {
  
  var check_run_url: String
  
  var completed_at: String
  
  var conclusion: String
  
  var head_sha: String
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var run_id: Double
  
  var run_url: String
  
  var started_at: String
  
  var status: String
  
  var steps: js.Array[Completedat]
  
  var url: String
}
object Checkrunurl {
  
  inline def apply(
    check_run_url: String,
    completed_at: String,
    conclusion: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    run_id: Double,
    run_url: String,
    started_at: String,
    status: String,
    steps: js.Array[Completedat],
    url: String
  ): Checkrunurl = {
    val __obj = js.Dynamic.literal(check_run_url = check_run_url.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], run_url = run_url.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkrunurl]
  }
  
  extension [Self <: Checkrunurl](x: Self) {
    
    inline def setCheck_run_url(value: String): Self = StObject.set(x, "check_run_url", value.asInstanceOf[js.Any])
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
    
    inline def setRun_url(value: String): Self = StObject.set(x, "run_url", value.asInstanceOf[js.Any])
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[Completedat]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Completedat*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
