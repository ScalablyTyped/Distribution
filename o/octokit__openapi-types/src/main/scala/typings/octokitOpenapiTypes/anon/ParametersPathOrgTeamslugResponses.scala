package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgTeamslugResponses extends StObject {
  
  var parameters: PathOrgTeamslug
}
object ParametersPathOrgTeamslugResponses {
  
  inline def apply(parameters: PathOrgTeamslug): ParametersPathOrgTeamslugResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgTeamslugResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgTeamslugResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
