package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCacheid extends StObject {
  
  var parameters: PathCacheid
}
object ParametersPathCacheid {
  
  inline def apply(parameters: PathCacheid): ParametersPathCacheid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCacheid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCacheid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCacheid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
