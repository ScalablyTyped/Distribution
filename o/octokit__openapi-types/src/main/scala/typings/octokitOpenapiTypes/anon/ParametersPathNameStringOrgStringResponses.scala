package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgStringResponses extends StObject {
  
  var parameters: PathNameStringOrgString
}
object ParametersPathNameStringOrgStringResponses {
  
  inline def apply(parameters: PathNameStringOrgString): ParametersPathNameStringOrgStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgStringResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgStringResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
