package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAuthoridOwner extends StObject {
  
  var parameters: PathAuthoridOwner
  
  var requestBody: js.UndefOr[ContentApplicationjson313] = js.undefined
  
  var responses: `200ContentApplicationjsonImporturl`
}
object ParametersPathAuthoridOwner {
  
  inline def apply(parameters: PathAuthoridOwner, responses: `200ContentApplicationjsonImporturl`): ParametersPathAuthoridOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAuthoridOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAuthoridOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAuthoridOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson313): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonImporturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
