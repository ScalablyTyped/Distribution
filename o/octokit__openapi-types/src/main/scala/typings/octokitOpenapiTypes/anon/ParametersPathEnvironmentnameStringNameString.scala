package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringNameString extends StObject {
  
  var parameters: PathEnvironmentnameStringNameString
}
object ParametersPathEnvironmentnameStringNameString {
  
  inline def apply(parameters: PathEnvironmentnameStringNameString): ParametersPathEnvironmentnameStringNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringNameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
