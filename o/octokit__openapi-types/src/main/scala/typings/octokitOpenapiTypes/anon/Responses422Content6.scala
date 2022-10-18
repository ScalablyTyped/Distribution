package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content6 extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var responses: `422Content6`
}
object Responses422Content6 {
  
  inline def apply(parameters: PathCheckrunidOwner, responses: `422Content6`): Responses422Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content6]
  }
  
  extension [Self <: Responses422Content6](x: Self) {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
