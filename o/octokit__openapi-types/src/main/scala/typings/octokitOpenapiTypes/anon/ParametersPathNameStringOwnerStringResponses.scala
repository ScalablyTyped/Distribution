package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOwnerStringResponses extends StObject {
  
  var parameters: PathNameStringOwnerString
}
object ParametersPathNameStringOwnerStringResponses {
  
  inline def apply(parameters: PathNameStringOwnerString): ParametersPathNameStringOwnerStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOwnerStringResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOwnerStringResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
