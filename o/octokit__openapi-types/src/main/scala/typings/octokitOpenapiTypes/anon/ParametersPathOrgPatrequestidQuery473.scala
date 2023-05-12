package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPatrequestidQuery473 extends StObject {
  
  var parameters: PathOrgPatrequestidQuery473
  
  var responses: `200403404500`
}
object ParametersPathOrgPatrequestidQuery473 {
  
  inline def apply(parameters: PathOrgPatrequestidQuery473, responses: `200403404500`): ParametersPathOrgPatrequestidQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPatrequestidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgPatrequestidQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgPatrequestidQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
