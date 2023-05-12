package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRequiredworkflowidResponses extends StObject {
  
  var parameters: PathOrgRequiredworkflowid
}
object ParametersPathOrgRequiredworkflowidResponses {
  
  inline def apply(parameters: PathOrgRequiredworkflowid): ParametersPathOrgRequiredworkflowidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRequiredworkflowidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRequiredworkflowidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
