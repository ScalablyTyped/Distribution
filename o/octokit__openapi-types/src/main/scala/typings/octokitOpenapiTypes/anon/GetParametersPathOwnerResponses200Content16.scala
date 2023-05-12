package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses200Content16 extends StObject {
  
  /**
    * List repository events
    * @description **Note**: This API is not built to serve real-time use cases. Depending on the time of day, event latency can be anywhere from 30s to 6h.
    */
  var get: ParametersPathOwnerResponses200Content16
}
object GetParametersPathOwnerResponses200Content16 {
  
  inline def apply(get: ParametersPathOwnerResponses200Content16): GetParametersPathOwnerResponses200Content16 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses200Content16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerResponses200Content16] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerResponses200Content16): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
