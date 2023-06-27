package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters165Responses200Content94 extends StObject {
  
  /**
    * Remove interaction restrictions for a repository
    * @description Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.
    */
  var delete: Parameters165Responses
  
  /**
    * Get interaction restrictions for a repository
    * @description Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  var get: Parameters165Responses200Content94
  
  /**
    * Set interaction restrictions for a repository
    * @description Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.
    */
  var put: Responses316
}
object GetParameters165Responses200Content94 {
  
  inline def apply(delete: Parameters165Responses, get: Parameters165Responses200Content94, put: Responses316): GetParameters165Responses200Content94 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters165Responses200Content94]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters165Responses200Content94] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters165Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters165Responses200Content94): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses316): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
