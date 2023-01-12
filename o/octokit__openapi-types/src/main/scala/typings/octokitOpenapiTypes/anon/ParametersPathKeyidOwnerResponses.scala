package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidOwnerResponses extends StObject {
  
  var parameters: PathKeyidOwner
}
object ParametersPathKeyidOwnerResponses {
  
  inline def apply(parameters: PathKeyidOwner): ParametersPathKeyidOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidOwnerResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathKeyidOwnerResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathKeyidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
