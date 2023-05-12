package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathTeamslug extends StObject {
  
  /**
    * Remove a security manager team
    * @description Removes the security manager role from a team for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) team from an organization."
    *
    * To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `admin:org` scope.
    *
    * GitHub Apps must have the `administration` organization read-write permission to use this endpoint.
    */
  var delete: ParametersPathTeamslug
  
  /**
    * Add a security manager team
    * @description Adds a team as a security manager for an organization. For more information, see "[Managing security for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) for an organization."
    *
    * To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `write:org` scope.
    *
    * GitHub Apps must have the `administration` organization read-write permission to use this endpoint.
    */
  var put: ParametersPathTeamslug
}
object DeleteParametersPathTeamslug {
  
  inline def apply(delete: ParametersPathTeamslug, put: ParametersPathTeamslug): DeleteParametersPathTeamslug = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathTeamslug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathTeamslug] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathTeamslug): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathTeamslug): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
