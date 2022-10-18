package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath645 extends StObject {
  
  var delete: ParametersPath645
  
  var patch: ParametersPath645
}
object DeleteParametersPath645 {
  
  inline def apply(delete: ParametersPath645, patch: ParametersPath645): DeleteParametersPath645 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath645]
  }
  
  extension [Self <: DeleteParametersPath645](x: Self) {
    
    inline def setDelete(value: ParametersPath645): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath645): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
