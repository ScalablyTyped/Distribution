package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content129 extends StObject {
  
  /**
    * List security manager teams
    * @description Lists teams that are security managers for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `read:org` scope.
    *
    * GitHub Apps must have the `administration` organization read permission to use this endpoint.
    */
  var get: Responses200Content129
}
object GetResponses200Content129 {
  
  inline def apply(get: Responses200Content129): GetResponses200Content129 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content129]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content129] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content129): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
