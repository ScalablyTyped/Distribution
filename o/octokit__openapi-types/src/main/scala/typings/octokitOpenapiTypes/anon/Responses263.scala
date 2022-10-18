package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses263 extends StObject {
  
  var parameters: Path259
  
  var responses: `263`
}
object Responses263 {
  
  inline def apply(parameters: Path259, responses: `263`): Responses263 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses263]
  }
  
  extension [Self <: Responses263](x: Self) {
    
    inline def setParameters(value: Path259): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `263`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
