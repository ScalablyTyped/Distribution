package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200301404 extends StObject {
  
  var parameters: `144`
  
  var responses: `200301404`
}
object Responses200301404 {
  
  inline def apply(parameters: `144`, responses: `200301404`): Responses200301404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200301404]
  }
  
  extension [Self <: Responses200301404](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
