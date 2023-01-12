package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryS extends StObject {
  
  var parameters: QueryS
  
  var responses: `200ContentApplicationoctocatstream`
}
object ParametersQueryS {
  
  inline def apply(parameters: QueryS, responses: `200ContentApplicationoctocatstream`): ParametersQueryS = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryS] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryS): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationoctocatstream`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
