package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses261 extends StObject {
  
  var parameters: Path259
  
  var responses: `261`
}
object Responses261 {
  
  inline def apply(parameters: Path259, responses: `261`): Responses261 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses261]
  }
  
  extension [Self <: Responses261](x: Self) {
    
    inline def setParameters(value: Path259): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `261`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
