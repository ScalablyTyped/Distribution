package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionKey extends StObject {
  
  var parameters: QueryDirectionKey
  
  var responses: `200ContentApplicationjsonActionscaches`
}
object ParametersQueryDirectionKey {
  
  inline def apply(parameters: QueryDirectionKey, responses: `200ContentApplicationjsonActionscaches`): ParametersQueryDirectionKey = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryDirectionKey] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryDirectionKey): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonActionscaches`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
