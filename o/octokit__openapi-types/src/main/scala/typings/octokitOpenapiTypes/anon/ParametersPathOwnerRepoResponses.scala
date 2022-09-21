package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses extends StObject {
  
  var parameters: PathOwnerRepo
}
object ParametersPathOwnerRepoResponses {
  
  inline def apply(parameters: PathOwnerRepo): ParametersPathOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
