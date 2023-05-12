package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTargetuser extends StObject {
  
  var parameters: PathTargetuser
}
object ParametersPathTargetuser {
  
  inline def apply(parameters: PathTargetuser): ParametersPathTargetuser = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTargetuser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTargetuser] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTargetuser): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
