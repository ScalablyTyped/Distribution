package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumber extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object ParametersPathDiscussionnumber {
  
  inline def apply(parameters: PathDiscussionnumber, responses: `200ContentApplicationjsonCommentscount`): ParametersPathDiscussionnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumber]
  }
  
  extension [Self <: ParametersPathDiscussionnumber](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
