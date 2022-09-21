package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryChecknameFilter extends StObject {
  
  var parameters: QueryChecknameFilter
  
  var responses: `200ContentApplicationjsonCheckrunsTotalcount`
}
object ParametersQueryChecknameFilter {
  
  inline def apply(parameters: QueryChecknameFilter, responses: `200ContentApplicationjsonCheckrunsTotalcount`): ParametersQueryChecknameFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryChecknameFilter]
  }
  
  extension [Self <: ParametersQueryChecknameFilter](x: Self) {
    
    inline def setParameters(value: QueryChecknameFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
