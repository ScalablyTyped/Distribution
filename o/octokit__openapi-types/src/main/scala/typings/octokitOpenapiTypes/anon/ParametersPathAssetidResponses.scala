package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssetidResponses extends StObject {
  
  var parameters: PathAssetid
}
object ParametersPathAssetidResponses {
  
  inline def apply(parameters: PathAssetid): ParametersPathAssetidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssetidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssetidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
