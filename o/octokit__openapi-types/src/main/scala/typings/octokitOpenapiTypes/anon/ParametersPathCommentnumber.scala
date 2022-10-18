package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumber extends StObject {
  
  var parameters: PathCommentnumber
  
  var responses: `200ContentApplicationjsonDiscussionurl`
}
object ParametersPathCommentnumber {
  
  inline def apply(parameters: PathCommentnumber, responses: `200ContentApplicationjsonDiscussionurl`): ParametersPathCommentnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumber]
  }
  
  extension [Self <: ParametersPathCommentnumber](x: Self) {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDiscussionurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
