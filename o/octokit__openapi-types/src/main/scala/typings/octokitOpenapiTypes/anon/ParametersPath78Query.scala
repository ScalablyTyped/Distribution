package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath78Query extends StObject {
  
  var parameters: Path78Query
  
  var responses: `200ContentApplicationjsonRepositoriesTotalcount`
}
object ParametersPath78Query {
  
  inline def apply(parameters: Path78Query, responses: `200ContentApplicationjsonRepositoriesTotalcount`): ParametersPath78Query = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath78Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath78Query] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path78Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
