package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridResponses extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
}
object ParametersPathOwnerRepoRunneridResponses {
  
  inline def apply(parameters: PathOwnerRepoRunnerid): ParametersPathOwnerRepoRunneridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridResponses]
  }
  
  extension [Self <: ParametersPathOwnerRepoRunneridResponses](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
