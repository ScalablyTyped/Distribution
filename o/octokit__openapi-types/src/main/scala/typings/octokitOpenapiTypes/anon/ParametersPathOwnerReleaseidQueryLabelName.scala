package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQueryLabelName extends StObject {
  
  var parameters: PathOwnerReleaseidQueryLabelName
  
  var requestBody: js.UndefOr[ContentApplicationoctetstream] = js.undefined
  
  var responses: `201ContentApplicationjsonDownloadcount`
}
object ParametersPathOwnerReleaseidQueryLabelName {
  
  inline def apply(parameters: PathOwnerReleaseidQueryLabelName, responses: `201ContentApplicationjsonDownloadcount`): ParametersPathOwnerReleaseidQueryLabelName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQueryLabelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseidQueryLabelName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseidQueryLabelName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationoctetstream): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201ContentApplicationjsonDownloadcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
