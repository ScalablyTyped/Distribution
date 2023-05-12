package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretname extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var responses: `200ContentApplicationjsonNameUpdatedat`
}
object ParametersPathOwnerRepoSecretname {
  
  inline def apply(parameters: PathOwnerRepoSecretname, responses: `200ContentApplicationjsonNameUpdatedat`): ParametersPathOwnerRepoSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoSecretname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameUpdatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
