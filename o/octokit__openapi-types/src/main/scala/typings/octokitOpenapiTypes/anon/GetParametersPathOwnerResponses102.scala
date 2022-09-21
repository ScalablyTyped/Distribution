package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerResponses102 extends StObject {
  
  /** Lists the people watching the specified repository. */
  var get: ParametersPathOwnerResponses102
}
object GetParametersPathOwnerResponses102 {
  
  inline def apply(get: ParametersPathOwnerResponses102): GetParametersPathOwnerResponses102 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerResponses102]
  }
  
  extension [Self <: GetParametersPathOwnerResponses102](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerResponses102): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
