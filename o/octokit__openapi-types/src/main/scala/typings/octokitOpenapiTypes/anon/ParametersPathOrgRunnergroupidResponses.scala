package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupidResponses extends StObject {
  
  var parameters: PathOrgRunnergroupid
}
object ParametersPathOrgRunnergroupidResponses {
  
  inline def apply(parameters: PathOrgRunnergroupid): ParametersPathOrgRunnergroupidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupidResponses]
  }
  
  extension [Self <: ParametersPathOrgRunnergroupidResponses](x: Self) {
    
    inline def setParameters(value: PathOrgRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
