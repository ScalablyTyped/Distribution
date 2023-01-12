package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQueryClientipRef extends StObject {
  
  var parameters: PathOwnerStringQueryClientipRef
  
  var responses: `200ContentApplicationjsonDefaults`
}
object ParametersPathOwnerStringQueryClientipRef {
  
  inline def apply(parameters: PathOwnerStringQueryClientipRef, responses: `200ContentApplicationjsonDefaults`): ParametersPathOwnerStringQueryClientipRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQueryClientipRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQueryClientipRef] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQueryClientipRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDefaults`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
