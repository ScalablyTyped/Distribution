package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumber extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object ParametersPathDiscussionnumberNumber {
  
  inline def apply(parameters: PathDiscussionnumberNumber, responses: `200ContentApplicationjsonCommentscount`): ParametersPathDiscussionnumberNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumber]
  }
  
  extension [Self <: ParametersPathDiscussionnumberNumber](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
