package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content188 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200Content188`
}
object Responses200Content188 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200Content188`): Responses200Content188 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content188]
  }
  
  extension [Self <: Responses200Content188](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content188`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
