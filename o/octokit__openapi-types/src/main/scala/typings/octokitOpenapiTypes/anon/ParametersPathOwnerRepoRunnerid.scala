package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunnerid extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var responses: `200ContentApplicationjsonOs`
}
object ParametersPathOwnerRepoRunnerid {
  
  inline def apply(parameters: PathOwnerRepoRunnerid, responses: `200ContentApplicationjsonOs`): ParametersPathOwnerRepoRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRunnerid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
