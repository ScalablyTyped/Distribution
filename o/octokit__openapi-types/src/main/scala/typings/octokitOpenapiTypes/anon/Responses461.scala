package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses461 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `461`
}
object Responses461 {
  
  inline def apply(parameters: PathOrgString, responses: `461`): Responses461 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses461]
  }
  
  extension [Self <: Responses461](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `461`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
