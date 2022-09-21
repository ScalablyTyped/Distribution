package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content454HeadersLink extends StObject {
  
  var parameters: Query447
  
  var responses: `200Content454HeadersLink`
}
object Responses200Content454HeadersLink {
  
  inline def apply(parameters: Query447, responses: `200Content454HeadersLink`): Responses200Content454HeadersLink = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content454HeadersLink]
  }
  
  extension [Self <: Responses200Content454HeadersLink](x: Self) {
    
    inline def setParameters(value: Query447): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content454HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
