package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathEnablement extends StObject {
  
  /**
    * Enable or disable a security feature for an organization
    * @description Enables or disables the specified security feature for all eligible repositories in an organization.
    *
    * To use this endpoint, you must be an organization owner or be member of a team with the security manager role.
    * A token with the 'write:org' scope is also required.
    *
    * GitHub Apps must have the `organization_administration:write` permission to use this endpoint.
    *
    * For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  var post: ParametersPathEnablement
}
object PostParametersPathEnablement {
  
  inline def apply(post: ParametersPathEnablement): PostParametersPathEnablement = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathEnablement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathEnablement] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathEnablement): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
