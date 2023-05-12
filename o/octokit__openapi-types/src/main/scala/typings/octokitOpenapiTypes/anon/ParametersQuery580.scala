package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery580 extends StObject {
  
  var parameters: Query580
  
  var responses: `400ContentApplicationjsonApplicationscimjson`
}
object ParametersQuery580 {
  
  inline def apply(parameters: Query580, responses: `400ContentApplicationjsonApplicationscimjson`): ParametersQuery580 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery580]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery580] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query580): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400ContentApplicationjsonApplicationscimjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
