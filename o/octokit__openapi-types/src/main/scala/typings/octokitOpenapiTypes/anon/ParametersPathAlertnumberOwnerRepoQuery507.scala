package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwnerRepoQuery507 extends StObject {
  
  var parameters: PathAlertnumberOwnerRepoQuery507
  
  var responses: `200Content627`
}
object ParametersPathAlertnumberOwnerRepoQuery507 {
  
  inline def apply(parameters: PathAlertnumberOwnerRepoQuery507, responses: `200Content627`): ParametersPathAlertnumberOwnerRepoQuery507 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwnerRepoQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumberOwnerRepoQuery507] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwnerRepoQuery507): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content627`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
