package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content183 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200Content183`
}
object Responses200Content183 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200Content183`): Responses200Content183 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content183]
  }
  
  extension [Self <: Responses200Content183](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content183`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
