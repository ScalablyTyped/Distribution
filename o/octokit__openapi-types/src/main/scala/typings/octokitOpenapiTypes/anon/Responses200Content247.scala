package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content247 extends StObject {
  
  var parameters: `303`
  
  var responses: `200Content247`
}
object Responses200Content247 {
  
  inline def apply(parameters: `303`, responses: `200Content247`): Responses200Content247 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content247]
  }
  
  extension [Self <: Responses200Content247](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content247`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
