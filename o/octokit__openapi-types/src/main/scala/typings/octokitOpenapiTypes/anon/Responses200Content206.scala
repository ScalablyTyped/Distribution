package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content206 extends StObject {
  
  var parameters: PathOwnerRefQueryPage
  
  var responses: `200Content206`
}
object Responses200Content206 {
  
  inline def apply(parameters: PathOwnerRefQueryPage, responses: `200Content206`): Responses200Content206 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content206]
  }
  
  extension [Self <: Responses200Content206](x: Self) {
    
    inline def setParameters(value: PathOwnerRefQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content206`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
