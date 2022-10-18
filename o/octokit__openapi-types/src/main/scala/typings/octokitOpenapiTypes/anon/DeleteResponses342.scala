package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses342 extends StObject {
  
  /** Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories. */
  var delete: Responses342
  
  /** Check if a user is, publicly or privately, a member of the organization. */
  var get: ParametersPath325Responses404Unknown
}
object DeleteResponses342 {
  
  inline def apply(delete: Responses342, get: ParametersPath325Responses404Unknown): DeleteResponses342 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses342]
  }
  
  extension [Self <: DeleteResponses342](x: Self) {
    
    inline def setDelete(value: Responses342): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath325Responses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
