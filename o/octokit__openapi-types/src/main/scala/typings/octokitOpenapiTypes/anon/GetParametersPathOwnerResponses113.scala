package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses113 extends StObject {
  
  /**
    * List watchers
    * @description Lists the people watching the specified repository.
    */
  var get: ParametersPathOwnerResponses113
}
object GetParametersPathOwnerResponses113 {
  
  inline def apply(get: ParametersPathOwnerResponses113): GetParametersPathOwnerResponses113 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerResponses113] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerResponses113): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
