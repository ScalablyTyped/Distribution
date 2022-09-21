package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content619 extends StObject {
  
  var parameters: Path599Query426
  
  var responses: `200Content619`
}
object Responses200Content619 {
  
  inline def apply(parameters: Path599Query426, responses: `200Content619`): Responses200Content619 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content619]
  }
  
  extension [Self <: Responses200Content619](x: Self) {
    
    inline def setParameters(value: Path599Query426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content619`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
