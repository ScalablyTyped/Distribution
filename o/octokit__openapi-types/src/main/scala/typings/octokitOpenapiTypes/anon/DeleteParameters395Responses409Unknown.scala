package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters395Responses409Unknown extends StObject {
  
  /** Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository. */
  var delete: Parameters395Responses409Unknown
  
  /** Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response. */
  var get: Parameters395Responses200Content336
  
  /** Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository. */
  var put: Responses200Content337409Unknown
}
object DeleteParameters395Responses409Unknown {
  
  inline def apply(
    delete: Parameters395Responses409Unknown,
    get: Parameters395Responses200Content336,
    put: Responses200Content337409Unknown
  ): DeleteParameters395Responses409Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters395Responses409Unknown]
  }
  
  extension [Self <: DeleteParameters395Responses409Unknown](x: Self) {
    
    inline def setDelete(value: Parameters395Responses409Unknown): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters395Responses200Content336): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content337409Unknown): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
