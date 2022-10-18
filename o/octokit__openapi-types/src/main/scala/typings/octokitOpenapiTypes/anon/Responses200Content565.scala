package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content565 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var responses: `200Content565`
}
object Responses200Content565 {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `200Content565`): Responses200Content565 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content565]
  }
  
  extension [Self <: Responses200Content565](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content565`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
