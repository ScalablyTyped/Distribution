package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryQString extends StObject {
  
  var parameters: QueryQString
  
  var responses: `200ContentApplicationjson595`
}
object ParametersQueryQString {
  
  inline def apply(parameters: QueryQString, responses: `200ContentApplicationjson595`): ParametersQueryQString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryQString]
  }
  
  extension [Self <: ParametersQueryQString](x: Self) {
    
    inline def setParameters(value: QueryQString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson595`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
