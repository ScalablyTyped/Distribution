package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery507 extends StObject {
  
  var parameters: Query507
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object ParametersQuery507 {
  
  inline def apply(parameters: Query507, responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): ParametersQuery507 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery507] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query507): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
