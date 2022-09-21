package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDisplaynamePage extends StObject {
  
  var parameters: QueryDisplaynamePage
  
  var responses: `200ContentApplicationjson399`
}
object ParametersQueryDisplaynamePage {
  
  inline def apply(parameters: QueryDisplaynamePage, responses: `200ContentApplicationjson399`): ParametersQueryDisplaynamePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDisplaynamePage]
  }
  
  extension [Self <: ParametersQueryDisplaynamePage](x: Self) {
    
    inline def setParameters(value: QueryDisplaynamePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson399`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
