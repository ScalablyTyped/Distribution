package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses84 extends StObject {
  
  /** Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories. */
  var delete: Responses84
  
  /** Check if a user is, publicly or privately, a member of the organization. */
  var get: Responses404Unknown
}
object DeleteResponses84 {
  
  inline def apply(delete: Responses84, get: Responses404Unknown): DeleteResponses84 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses84]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses84] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses84): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
