package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoTeamidResponses extends StObject {
  
  var parameters: PathOwnerRepoTeamid
}
object ParametersPathOwnerRepoTeamidResponses {
  
  inline def apply(parameters: PathOwnerRepoTeamid): ParametersPathOwnerRepoTeamidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoTeamidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoTeamidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
