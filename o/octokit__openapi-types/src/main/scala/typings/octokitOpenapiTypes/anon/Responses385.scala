package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses385 extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `385`
}
object Responses385 {
  
  inline def apply(parameters: Path348QueryPage, responses: `385`): Responses385 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses385]
  }
  
  extension [Self <: Responses385](x: Self) {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `385`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
