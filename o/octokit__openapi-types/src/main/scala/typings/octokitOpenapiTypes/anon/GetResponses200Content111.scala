package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content111 extends StObject {
  
  /**
    * Lists teams that are security managers for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `read:org` scope.
    *
    * GitHub Apps must have the `administration` organization read permission to use this endpoint.
    */
  var get: Responses200Content111
}
object GetResponses200Content111 {
  
  inline def apply(get: Responses200Content111): GetResponses200Content111 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content111]
  }
  
  extension [Self <: GetResponses200Content111](x: Self) {
    
    inline def setGet(value: Responses200Content111): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
