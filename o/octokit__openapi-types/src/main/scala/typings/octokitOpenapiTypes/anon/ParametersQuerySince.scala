package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySince extends StObject {
  
  var parameters: QuerySince
  
  var responses: `200Content45`
}
object ParametersQuerySince {
  
  inline def apply(parameters: QuerySince, responses: `200Content45`): ParametersQuerySince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content45`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
