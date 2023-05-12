package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOwnerString extends StObject {
  
  var parameters: PathNameStringOwnerString
  
  var responses: `200ContentApplicationjsonUpdatedatValue`
}
object ParametersPathNameStringOwnerString {
  
  inline def apply(parameters: PathNameStringOwnerString, responses: `200ContentApplicationjsonUpdatedatValue`): ParametersPathNameStringOwnerString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOwnerString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOwnerString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonUpdatedatValue`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
