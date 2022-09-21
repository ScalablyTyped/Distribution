package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCountExcludedAttributes extends StObject {
  
  var parameters: QueryCountExcludedAttributes
  
  var responses: `200ContentApplicationjsonItemsPerPage`
}
object ParametersQueryCountExcludedAttributes {
  
  inline def apply(parameters: QueryCountExcludedAttributes, responses: `200ContentApplicationjsonItemsPerPage`): ParametersQueryCountExcludedAttributes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCountExcludedAttributes]
  }
  
  extension [Self <: ParametersQueryCountExcludedAttributes](x: Self) {
    
    inline def setParameters(value: QueryCountExcludedAttributes): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonItemsPerPage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
