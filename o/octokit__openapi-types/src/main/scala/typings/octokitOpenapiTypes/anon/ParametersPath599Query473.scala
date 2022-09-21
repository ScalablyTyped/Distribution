package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599Query473 extends StObject {
  
  var parameters: Path599Query473
  
  var responses: `200Content474422Content421`
}
object ParametersPath599Query473 {
  
  inline def apply(parameters: Path599Query473, responses: `200Content474422Content421`): ParametersPath599Query473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599Query473]
  }
  
  extension [Self <: ParametersPath599Query473](x: Self) {
    
    inline def setParameters(value: Path599Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content474422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
