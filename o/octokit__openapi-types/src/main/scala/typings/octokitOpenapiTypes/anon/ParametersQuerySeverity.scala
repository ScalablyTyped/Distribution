package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySeverity extends StObject {
  
  var parameters: QuerySeverity
  
  var responses: `404503`
}
object ParametersQuerySeverity {
  
  inline def apply(parameters: QuerySeverity, responses: `404503`): ParametersQuerySeverity = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySeverity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySeverity] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySeverity): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
