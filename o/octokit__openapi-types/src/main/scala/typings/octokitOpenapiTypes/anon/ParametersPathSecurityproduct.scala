package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecurityproduct extends StObject {
  
  var parameters: PathSecurityproduct
}
object ParametersPathSecurityproduct {
  
  inline def apply(parameters: PathSecurityproduct): ParametersPathSecurityproduct = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecurityproduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSecurityproduct] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecurityproduct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
