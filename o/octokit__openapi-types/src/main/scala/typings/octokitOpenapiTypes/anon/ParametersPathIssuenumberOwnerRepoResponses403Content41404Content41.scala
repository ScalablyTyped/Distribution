package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoResponses403Content41404Content41 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `403Content41404Content41`
}
object ParametersPathIssuenumberOwnerRepoResponses403Content41404Content41 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `403Content41404Content41`): ParametersPathIssuenumberOwnerRepoResponses403Content41404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoResponses403Content41404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepoResponses403Content41404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content41404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
