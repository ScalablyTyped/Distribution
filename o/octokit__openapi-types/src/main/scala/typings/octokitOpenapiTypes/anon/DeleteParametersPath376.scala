package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath376 extends StObject {
  
  var delete: ParametersPath376
  
  var patch: ParametersPath376
}
object DeleteParametersPath376 {
  
  inline def apply(delete: ParametersPath376, patch: ParametersPath376): DeleteParametersPath376 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath376]
  }
  
  extension [Self <: DeleteParametersPath376](x: Self) {
    
    inline def setDelete(value: ParametersPath376): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath376): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
