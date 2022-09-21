package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses92 extends StObject {
  
  /** Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories. */
  var delete: Responses92
  
  /** Check if a user is, publicly or privately, a member of the organization. */
  var get: Responses404Unknown
}
object DeleteResponses92 {
  
  inline def apply(delete: Responses92, get: Responses404Unknown): DeleteResponses92 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses92]
  }
  
  extension [Self <: DeleteResponses92](x: Self) {
    
    inline def setDelete(value: Responses92): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
