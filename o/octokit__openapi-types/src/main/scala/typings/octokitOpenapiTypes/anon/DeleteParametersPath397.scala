package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath397 extends StObject {
  
  /** Decline a repository invitation */
  var delete: ParametersPath397
  
  /** Accept a repository invitation */
  var patch: ParametersPath397
}
object DeleteParametersPath397 {
  
  inline def apply(delete: ParametersPath397, patch: ParametersPath397): DeleteParametersPath397 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath397]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath397] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath397): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath397): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
