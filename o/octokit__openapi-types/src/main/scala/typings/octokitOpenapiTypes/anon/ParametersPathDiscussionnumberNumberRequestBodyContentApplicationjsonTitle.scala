package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonTitle extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var requestBody: ContentApplicationjsonTitle
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonTitle {
  
  inline def apply(
    parameters: PathDiscussionnumberNumber,
    requestBody: ContentApplicationjsonTitle,
    responses: `200ContentApplicationjsonCommentscount`
  ): ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonTitle = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonTitle] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
