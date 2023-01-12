package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPlanid extends StObject {
  
  var parameters: PathPlanid
  
  var responses: `200401404`
}
object ParametersPathPlanid {
  
  inline def apply(parameters: PathPlanid, responses: `200401404`): ParametersPathPlanid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPlanid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPlanid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPlanid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
