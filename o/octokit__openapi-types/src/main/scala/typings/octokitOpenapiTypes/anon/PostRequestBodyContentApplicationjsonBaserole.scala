package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonBaserole extends StObject {
  
  /**
    * **Note**: This operation is in beta and is subject to change.
    *
    * Creates a custom repository role that can be used by all repositories owned by the organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information on custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  var post: RequestBodyContentApplicationjsonBaserole
}
object PostRequestBodyContentApplicationjsonBaserole {
  
  inline def apply(post: RequestBodyContentApplicationjsonBaserole): PostRequestBodyContentApplicationjsonBaserole = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonBaserole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonBaserole] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonBaserole): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
