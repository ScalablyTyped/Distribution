package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses94 extends StObject {
  
  /** Lists the people watching the specified repository. */
  var get: ParametersPathOwnerResponses94
}
object GetParametersPathOwnerResponses94 {
  
  inline def apply(get: ParametersPathOwnerResponses94): GetParametersPathOwnerResponses94 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses94]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerResponses94] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerResponses94): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
