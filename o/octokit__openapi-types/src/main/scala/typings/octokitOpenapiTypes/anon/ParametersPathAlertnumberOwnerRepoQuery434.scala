package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwnerRepoQuery434 extends StObject {
  
  var parameters: PathAlertnumberOwnerRepoQuery434
  
  var responses: `200Content557`
}
object ParametersPathAlertnumberOwnerRepoQuery434 {
  
  inline def apply(parameters: PathAlertnumberOwnerRepoQuery434, responses: `200Content557`): ParametersPathAlertnumberOwnerRepoQuery434 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwnerRepoQuery434]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumberOwnerRepoQuery434] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwnerRepoQuery434): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content557`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
