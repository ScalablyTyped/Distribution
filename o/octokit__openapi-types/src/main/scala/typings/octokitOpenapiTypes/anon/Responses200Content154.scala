package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content154 extends StObject {
  
  var parameters: PathIssuenumberQueryPage
  
  var responses: `200Content154`
}
object Responses200Content154 {
  
  inline def apply(parameters: PathIssuenumberQueryPage, responses: `200Content154`): Responses200Content154 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content154]
  }
  
  extension [Self <: Responses200Content154](x: Self) {
    
    inline def setParameters(value: PathIssuenumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content154`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
