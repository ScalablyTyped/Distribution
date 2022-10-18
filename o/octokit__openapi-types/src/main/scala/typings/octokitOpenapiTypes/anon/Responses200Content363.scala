package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content363 extends StObject {
  
  var parameters: `303`
  
  var responses: `200Content363`
}
object Responses200Content363 {
  
  inline def apply(parameters: `303`, responses: `200Content363`): Responses200Content363 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content363]
  }
  
  extension [Self <: Responses200Content363](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content363`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
