package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content156 extends StObject {
  
  var parameters: PathWorkflowid
  
  var responses: `200Content156`
}
object Responses200Content156 {
  
  inline def apply(parameters: PathWorkflowid, responses: `200Content156`): Responses200Content156 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content156]
  }
  
  extension [Self <: Responses200Content156](x: Self) {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content156`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
