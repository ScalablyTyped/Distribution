package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses23 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `23`
}
object ParametersPathOwnerRepoResponses23 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `23`): ParametersPathOwnerRepoResponses23 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses23]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoResponses23] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `23`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
