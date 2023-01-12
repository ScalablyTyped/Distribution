package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoResponses403Content48404Content48 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `403Content48404Content48`
}
object ParametersPathIssuenumberOwnerRepoResponses403Content48404Content48 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `403Content48404Content48`): ParametersPathIssuenumberOwnerRepoResponses403Content48404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoResponses403Content48404Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepoResponses403Content48404Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content48404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
