package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery434 extends StObject {
  
  var parameters: Query434
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object ParametersQuery434 {
  
  inline def apply(parameters: Query434, responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): ParametersQuery434 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery434]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery434] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query434): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
