package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryLabelNameString extends StObject {
  
  var parameters: QueryLabelNameString
  
  var requestBody: `179`
  
  var responses: `201ContentApplicationjsonDownloadcount`
}
object ParametersQueryLabelNameString {
  
  inline def apply(
    parameters: QueryLabelNameString,
    requestBody: `179`,
    responses: `201ContentApplicationjsonDownloadcount`
  ): ParametersQueryLabelNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryLabelNameString]
  }
  
  extension [Self <: ParametersQueryLabelNameString](x: Self) {
    
    inline def setParameters(value: QueryLabelNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: `179`): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDownloadcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
