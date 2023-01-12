package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidOwnerRepoResponses extends StObject {
  
  var parameters: PathKeyidOwnerRepo
}
object ParametersPathKeyidOwnerRepoResponses {
  
  inline def apply(parameters: PathKeyidOwnerRepo): ParametersPathKeyidOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidOwnerRepoResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathKeyidOwnerRepoResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathKeyidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
