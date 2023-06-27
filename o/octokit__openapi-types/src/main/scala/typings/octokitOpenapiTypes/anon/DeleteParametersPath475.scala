package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath475 extends StObject {
  
  /** Decline a repository invitation */
  var delete: ParametersPath475
  
  /** Accept a repository invitation */
  var patch: ParametersPath475
}
object DeleteParametersPath475 {
  
  inline def apply(delete: ParametersPath475, patch: ParametersPath475): DeleteParametersPath475 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath475]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath475] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath475): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath475): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
