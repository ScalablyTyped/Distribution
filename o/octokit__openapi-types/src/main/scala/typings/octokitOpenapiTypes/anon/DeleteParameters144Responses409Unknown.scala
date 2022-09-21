package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters144Responses409Unknown extends StObject {
  
  /** Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository. */
  var delete: Parameters144Responses409Unknown
  
  /** Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response. */
  var get: Parameters144Responses200Content86
  
  /** Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository. */
  var put: Responses200409
}
object DeleteParameters144Responses409Unknown {
  
  inline def apply(
    delete: Parameters144Responses409Unknown,
    get: Parameters144Responses200Content86,
    put: Responses200409
  ): DeleteParameters144Responses409Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters144Responses409Unknown]
  }
  
  extension [Self <: DeleteParameters144Responses409Unknown](x: Self) {
    
    inline def setDelete(value: Parameters144Responses409Unknown): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters144Responses200Content86): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200409): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
