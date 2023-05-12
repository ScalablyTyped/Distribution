package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses129 extends StObject {
  
  /** List repository teams */
  var get: ParametersPathOwnerResponses129
}
object GetParametersPathOwnerResponses129 {
  
  inline def apply(get: ParametersPathOwnerResponses129): GetParametersPathOwnerResponses129 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses129]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerResponses129] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerResponses129): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
