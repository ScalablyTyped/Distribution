package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content613404 extends StObject {
  
  var parameters: Path615
  
  var responses: `200Content613404`
}
object Responses200Content613404 {
  
  inline def apply(parameters: Path615, responses: `200Content613404`): Responses200Content613404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content613404]
  }
  
  extension [Self <: Responses200Content613404](x: Self) {
    
    inline def setParameters(value: Path615): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content613404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
