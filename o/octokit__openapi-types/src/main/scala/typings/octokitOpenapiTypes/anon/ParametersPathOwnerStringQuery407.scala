package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery407 extends StObject {
  
  var parameters: PathOwnerStringQuery407
  
  var responses: `200ContentApplicationjsonCodespacesTotalcount`
}
object ParametersPathOwnerStringQuery407 {
  
  inline def apply(parameters: PathOwnerStringQuery407, responses: `200ContentApplicationjsonCodespacesTotalcount`): ParametersPathOwnerStringQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery407]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery407](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCodespacesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
