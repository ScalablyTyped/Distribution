package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath388 extends StObject {
  
  var delete: ParametersPath388
  
  var patch: ParametersPath388
}
object DeleteParametersPath388 {
  
  inline def apply(delete: ParametersPath388, patch: ParametersPath388): DeleteParametersPath388 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath388]
  }
  
  extension [Self <: DeleteParametersPath388](x: Self) {
    
    inline def setDelete(value: ParametersPath388): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath388): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
