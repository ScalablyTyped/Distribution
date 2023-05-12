package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters248Responses9 extends StObject {
  
  /** Delete a reference */
  var delete: Parameters248Responses9
  
  /** Update a reference */
  var patch: RequestBodyContentApplicationjsonForce
}
object DeleteParameters248Responses9 {
  
  inline def apply(delete: Parameters248Responses9, patch: RequestBodyContentApplicationjsonForce): DeleteParameters248Responses9 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters248Responses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters248Responses9] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters248Responses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonForce): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
