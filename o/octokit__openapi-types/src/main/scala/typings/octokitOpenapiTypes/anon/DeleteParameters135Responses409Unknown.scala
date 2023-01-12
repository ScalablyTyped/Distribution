package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters135Responses409Unknown extends StObject {
  
  /** Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository. */
  var delete: Parameters135Responses409Unknown
  
  /** Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response. */
  var get: Parameters135Responses200Content78
  
  /** Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository. */
  var put: Responses200Content79409Unknown
}
object DeleteParameters135Responses409Unknown {
  
  inline def apply(
    delete: Parameters135Responses409Unknown,
    get: Parameters135Responses200Content78,
    put: Responses200Content79409Unknown
  ): DeleteParameters135Responses409Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters135Responses409Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters135Responses409Unknown] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters135Responses409Unknown): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters135Responses200Content78): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content79409Unknown): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
