package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200240 extends StObject {
  
  var parameters: PathCommitsha
  
  var responses: `200240`
}
object Responses200240 {
  
  inline def apply(parameters: PathCommitsha, responses: `200240`): Responses200240 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200240]
  }
  
  extension [Self <: Responses200240](x: Self) {
    
    inline def setParameters(value: PathCommitsha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200240`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
