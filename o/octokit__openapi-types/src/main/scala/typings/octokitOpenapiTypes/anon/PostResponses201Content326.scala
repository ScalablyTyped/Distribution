package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content326 extends StObject {
  
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
  var post: Responses201Content326
}
object PostResponses201Content326 {
  
  inline def apply(post: Responses201Content326): PostResponses201Content326 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content326]
  }
  
  extension [Self <: PostResponses201Content326](x: Self) {
    
    inline def setPost(value: Responses201Content326): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
