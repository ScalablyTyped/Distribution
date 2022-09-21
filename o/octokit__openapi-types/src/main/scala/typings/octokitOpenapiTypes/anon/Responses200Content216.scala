package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content216 extends StObject {
  
  var parameters: PathOwnerRefQueryPage
  
  var responses: `200Content216`
}
object Responses200Content216 {
  
  inline def apply(parameters: PathOwnerRefQueryPage, responses: `200Content216`): Responses200Content216 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content216]
  }
  
  extension [Self <: Responses200Content216](x: Self) {
    
    inline def setParameters(value: PathOwnerRefQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content216`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
