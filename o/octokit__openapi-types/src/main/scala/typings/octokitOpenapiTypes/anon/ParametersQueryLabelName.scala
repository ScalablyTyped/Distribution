package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryLabelName extends StObject {
  
  var parameters: QueryLabelName
  
  var requestBody: `325`
  
  var responses: `201Content321`
}
object ParametersQueryLabelName {
  
  inline def apply(parameters: QueryLabelName, requestBody: `325`, responses: `201Content321`): ParametersQueryLabelName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryLabelName]
  }
  
  extension [Self <: ParametersQueryLabelName](x: Self) {
    
    inline def setParameters(value: QueryLabelName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: `325`): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content321`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
