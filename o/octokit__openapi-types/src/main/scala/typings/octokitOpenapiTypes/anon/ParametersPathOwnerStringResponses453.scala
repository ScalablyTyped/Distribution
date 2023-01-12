package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses453 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `453`
}
object ParametersPathOwnerStringResponses453 {
  
  inline def apply(parameters: PathOwnerString, responses: `453`): ParametersPathOwnerStringResponses453 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses453]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringResponses453] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `453`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
