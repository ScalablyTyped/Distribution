package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePermission extends StObject {
  
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    * Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  var get: ParametersQueryPagePermission
}
object GetParametersQueryPagePermission {
  
  inline def apply(get: ParametersQueryPagePermission): GetParametersQueryPagePermission = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePermission]
  }
  
  extension [Self <: GetParametersQueryPagePermission](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePermission): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
