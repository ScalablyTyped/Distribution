package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryQ extends StObject {
  
  var parameters: QueryQ
  
  var responses: `200ContentApplicationjsonItems`
}
object ParametersQueryQ {
  
  inline def apply(parameters: QueryQ, responses: `200ContentApplicationjsonItems`): ParametersQueryQ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryQ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryQ] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryQ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonItems`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
