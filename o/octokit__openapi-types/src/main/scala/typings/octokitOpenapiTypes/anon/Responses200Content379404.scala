package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content379404 extends StObject {
  
  var parameters: Path610
  
  var responses: `200Content379404`
}
object Responses200Content379404 {
  
  inline def apply(parameters: Path610, responses: `200Content379404`): Responses200Content379404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content379404]
  }
  
  extension [Self <: Responses200Content379404](x: Self) {
    
    inline def setParameters(value: Path610): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content379404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
