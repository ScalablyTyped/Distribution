package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401Content6 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `401Content6`
}
object Responses401Content6 {
  
  inline def apply(parameters: PathThreadid, responses: `401Content6`): Responses401Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401Content6]
  }
  
  extension [Self <: Responses401Content6](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
