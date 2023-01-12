package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQueryLabelName extends StObject {
  
  var parameters: PathOwnerReleaseidQueryLabelName
  
  var requestBody: `320`
  
  var responses: `201ContentApplicationjsonDownloadcount`
}
object ParametersPathOwnerReleaseidQueryLabelName {
  
  inline def apply(
    parameters: PathOwnerReleaseidQueryLabelName,
    requestBody: `320`,
    responses: `201ContentApplicationjsonDownloadcount`
  ): ParametersPathOwnerReleaseidQueryLabelName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQueryLabelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseidQueryLabelName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseidQueryLabelName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: `320`): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDownloadcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
