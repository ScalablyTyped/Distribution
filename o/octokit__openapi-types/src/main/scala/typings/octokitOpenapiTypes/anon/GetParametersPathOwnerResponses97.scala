package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses97 extends StObject {
  
  /**
    * List watchers
    * @description Lists the people watching the specified repository.
    */
  var get: ParametersPathOwnerResponses97
}
object GetParametersPathOwnerResponses97 {
  
  inline def apply(get: ParametersPathOwnerResponses97): GetParametersPathOwnerResponses97 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerResponses97] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerResponses97): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
