package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content21 extends StObject {
  
  var parameters: PathEnterprise
  
  var responses: `200Content21`
}
object Responses200Content21 {
  
  inline def apply(parameters: PathEnterprise, responses: `200Content21`): Responses200Content21 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content21]
  }
  
  extension [Self <: Responses200Content21](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content21`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
