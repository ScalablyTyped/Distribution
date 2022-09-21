package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberOrgResponses extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberOrg
}
object ParametersPathCommentnumberDiscussionnumberOrgResponses {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberOrg): ParametersPathCommentnumberDiscussionnumberOrgResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberOrgResponses]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberOrgResponses](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
