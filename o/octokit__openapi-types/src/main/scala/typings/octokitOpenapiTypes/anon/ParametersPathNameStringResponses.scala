package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringResponses extends StObject {
  
  var parameters: PathNameString
}
object ParametersPathNameStringResponses {
  
  inline def apply(parameters: PathNameString): ParametersPathNameStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
