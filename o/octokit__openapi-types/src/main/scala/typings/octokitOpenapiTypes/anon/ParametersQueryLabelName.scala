package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryLabelName extends StObject {
  
  var parameters: QueryLabelName
  
  var requestBody: js.UndefOr[ContentApplicationoctetstream] = js.undefined
  
  var responses: `201Content331`
}
object ParametersQueryLabelName {
  
  inline def apply(parameters: QueryLabelName, responses: `201Content331`): ParametersQueryLabelName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryLabelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryLabelName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryLabelName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationoctetstream): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201Content331`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
