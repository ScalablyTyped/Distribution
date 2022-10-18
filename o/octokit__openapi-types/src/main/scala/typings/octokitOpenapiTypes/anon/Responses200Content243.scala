package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content243 extends StObject {
  
  var parameters: PathKeyString
  
  var responses: `200Content243`
}
object Responses200Content243 {
  
  inline def apply(parameters: PathKeyString, responses: `200Content243`): Responses200Content243 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content243]
  }
  
  extension [Self <: Responses200Content243](x: Self) {
    
    inline def setParameters(value: PathKeyString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content243`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
