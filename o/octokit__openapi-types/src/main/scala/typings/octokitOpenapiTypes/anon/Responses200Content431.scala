package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content431 extends StObject {
  
  var parameters: PathRepoWorkflowid
  
  var responses: `200Content431`
}
object Responses200Content431 {
  
  inline def apply(parameters: PathRepoWorkflowid, responses: `200Content431`): Responses200Content431 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content431]
  }
  
  extension [Self <: Responses200Content431](x: Self) {
    
    inline def setParameters(value: PathRepoWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content431`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
