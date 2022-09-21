package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content82 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content82`
}
object Responses200Content82 {
  
  inline def apply(parameters: PathOrg, responses: `200Content82`): Responses200Content82 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content82]
  }
  
  extension [Self <: Responses200Content82](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content82`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
