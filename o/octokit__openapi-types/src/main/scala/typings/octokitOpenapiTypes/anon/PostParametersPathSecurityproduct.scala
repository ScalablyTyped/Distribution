package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathSecurityproduct extends StObject {
  
  /**
    * Enables or disables the specified security feature for all repositories in an organization.
    *
    * To use this endpoint, you must be an organization owner or be member of a team with the security manager role.
    * A token with the 'write:org' scope is also required.
    *
    * GitHub Apps must have the `organization_administration:write` permission to use this endpoint.
    *
    * For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  var post: ParametersPathSecurityproduct
}
object PostParametersPathSecurityproduct {
  
  inline def apply(post: ParametersPathSecurityproduct): PostParametersPathSecurityproduct = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathSecurityproduct]
  }
  
  extension [Self <: PostParametersPathSecurityproduct](x: Self) {
    
    inline def setPost(value: ParametersPathSecurityproduct): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
