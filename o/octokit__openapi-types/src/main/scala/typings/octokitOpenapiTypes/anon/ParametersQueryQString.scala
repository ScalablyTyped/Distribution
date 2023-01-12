package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryQString extends StObject {
  
  var parameters: QueryQString
  
  var responses: `200ContentApplicationjson573`
}
object ParametersQueryQString {
  
  inline def apply(parameters: QueryQString, responses: `200ContentApplicationjson573`): ParametersQueryQString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryQString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryQString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryQString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson573`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
