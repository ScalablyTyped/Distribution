package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath259 extends StObject {
  
  var parameters: Path259
  
  var responses: `200Content260`
}
object ParametersPath259 {
  
  inline def apply(parameters: Path259, responses: `200Content260`): ParametersPath259 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath259]
  }
  
  extension [Self <: ParametersPath259](x: Self) {
    
    inline def setParameters(value: Path259): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content260`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
