package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnerid extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `200ContentApplicationjsonOs`
}
object ParametersPathOrgRunnerid {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `200ContentApplicationjsonOs`): ParametersPathOrgRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
