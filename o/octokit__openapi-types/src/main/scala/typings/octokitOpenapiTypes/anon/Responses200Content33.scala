package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content33 extends StObject {
  
  var parameters: PathEnterprise
  
  var responses: `200Content33`
}
object Responses200Content33 {
  
  inline def apply(parameters: PathEnterprise, responses: `200Content33`): Responses200Content33 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content33]
  }
  
  extension [Self <: Responses200Content33](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content33`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
