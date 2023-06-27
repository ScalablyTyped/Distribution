package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters55Responses200Content104 extends StObject {
  
  /**
    * Get an organization membership for the authenticated user
    * @description If the authenticated user is an active or pending member of the organization, this endpoint will return the user's membership. If the authenticated user is not affiliated with the organization, a `404` is returned. This endpoint will return a `403` if the request is made by a GitHub App that is blocked by the organization.
    */
  var get: Parameters55Responses200Content104
  
  /**
    * Update an organization membership for the authenticated user
    * @description Converts the authenticated user to an active member of the organization, if that user has a pending invitation from the organization.
    */
  var patch: RequestBodyContentApplicationjson468
}
object GetParameters55Responses200Content104 {
  
  inline def apply(get: Parameters55Responses200Content104, patch: RequestBodyContentApplicationjson468): GetParameters55Responses200Content104 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters55Responses200Content104]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters55Responses200Content104] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters55Responses200Content104): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson468): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
