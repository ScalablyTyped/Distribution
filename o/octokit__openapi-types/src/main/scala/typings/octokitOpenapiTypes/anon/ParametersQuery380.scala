package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery380 extends StObject {
  
  var parameters: Query380
  
  var responses: `200Content69HeadersLink`
}
object ParametersQuery380 {
  
  inline def apply(parameters: Query380, responses: `200Content69HeadersLink`): ParametersQuery380 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery380]
  }
  
  extension [Self <: ParametersQuery380](x: Self) {
    
    inline def setParameters(value: Query380): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content69HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
