package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content66 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content66`
}
object Responses200Content66 {
  
  inline def apply(parameters: PathOrg, responses: `200Content66`): Responses200Content66 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content66]
  }
  
  extension [Self <: Responses200Content66](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content66`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
