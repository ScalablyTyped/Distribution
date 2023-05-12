package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberRequestBody extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonTitle] = js.undefined
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object ParametersPathDiscussionnumberNumberRequestBody {
  
  inline def apply(parameters: PathDiscussionnumberNumber, responses: `200ContentApplicationjsonCommentscount`): ParametersPathDiscussionnumberNumberRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
