package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRequiredworkflowidResponses extends StObject {
  
  var parameters: PathRequiredworkflowid
}
object ParametersPathRequiredworkflowidResponses {
  
  inline def apply(parameters: PathRequiredworkflowid): ParametersPathRequiredworkflowidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRequiredworkflowidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRequiredworkflowidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
