package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content193 extends StObject {
  
  var parameters: `144`
  
  var responses: `200Content193`
}
object Responses200Content193 {
  
  inline def apply(parameters: `144`, responses: `200Content193`): Responses200Content193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content193]
  }
  
  extension [Self <: Responses200Content193](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content193`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
