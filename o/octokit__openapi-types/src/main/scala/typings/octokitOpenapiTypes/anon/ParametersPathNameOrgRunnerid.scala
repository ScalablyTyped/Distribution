package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOrgRunnerid extends StObject {
  
  var parameters: PathNameOrgRunnerid
  
  var responses: `422Content395`
}
object ParametersPathNameOrgRunnerid {
  
  inline def apply(parameters: PathNameOrgRunnerid, responses: `422Content395`): ParametersPathNameOrgRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOrgRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameOrgRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
