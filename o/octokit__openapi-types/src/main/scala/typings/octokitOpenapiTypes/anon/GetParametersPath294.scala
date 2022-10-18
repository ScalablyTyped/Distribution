package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath294 extends StObject {
  
  var get: ParametersPath294
  
  var patch: Responses205304403
}
object GetParametersPath294 {
  
  inline def apply(get: ParametersPath294, patch: Responses205304403): GetParametersPath294 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath294]
  }
  
  extension [Self <: GetParametersPath294](x: Self) {
    
    inline def setGet(value: ParametersPath294): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses205304403): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
