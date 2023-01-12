package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOutdated extends StObject {
  
  var parameters: QueryOutdated
  
  var responses: `200Headers`
}
object ParametersQueryOutdated {
  
  inline def apply(parameters: QueryOutdated, responses: `200Headers`): ParametersQueryOutdated = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOutdated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryOutdated] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryOutdated): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
