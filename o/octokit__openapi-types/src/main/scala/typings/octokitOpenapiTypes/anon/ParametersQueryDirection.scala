package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirection extends StObject {
  
  var parameters: QueryDirection
  
  var responses: `404503`
}
object ParametersQueryDirection {
  
  inline def apply(parameters: QueryDirection, responses: `404503`): ParametersQueryDirection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirection]
  }
  
  extension [Self <: ParametersQueryDirection](x: Self) {
    
    inline def setParameters(value: QueryDirection): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
