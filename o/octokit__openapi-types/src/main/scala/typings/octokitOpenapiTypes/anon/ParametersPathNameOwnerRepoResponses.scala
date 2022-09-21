package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOwnerRepoResponses extends StObject {
  
  var parameters: PathNameOwnerRepo
}
object ParametersPathNameOwnerRepoResponses {
  
  inline def apply(parameters: PathNameOwnerRepo): ParametersPathNameOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOwnerRepoResponses]
  }
  
  extension [Self <: ParametersPathNameOwnerRepoResponses](x: Self) {
    
    inline def setParameters(value: PathNameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
