package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters292Responses11 extends StObject {
  
  /** Delete a reference */
  var delete: Parameters292Responses11
  
  /** Update a reference */
  var patch: RequestBodyContentApplicationjsonForce
}
object DeleteParameters292Responses11 {
  
  inline def apply(delete: Parameters292Responses11, patch: RequestBodyContentApplicationjsonForce): DeleteParameters292Responses11 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters292Responses11]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters292Responses11] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters292Responses11): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonForce): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
