package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoResponses403Content36404Content36 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `403Content36404Content36`
}
object ParametersPathIssuenumberOwnerRepoResponses403Content36404Content36 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `403Content36404Content36`): ParametersPathIssuenumberOwnerRepoResponses403Content36404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoResponses403Content36404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepoResponses403Content36404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content36404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
