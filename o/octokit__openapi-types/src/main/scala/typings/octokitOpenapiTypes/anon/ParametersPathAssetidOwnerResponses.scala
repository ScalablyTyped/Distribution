package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssetidOwnerResponses extends StObject {
  
  var parameters: PathAssetidOwner
}
object ParametersPathAssetidOwnerResponses {
  
  inline def apply(parameters: PathAssetidOwner): ParametersPathAssetidOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssetidOwnerResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssetidOwnerResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssetidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
