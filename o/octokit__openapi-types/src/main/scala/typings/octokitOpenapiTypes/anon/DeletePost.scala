package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePost extends StObject {
  
  /**
    * Removes users from Codespaces billing for an organization
    * @description Codespaces for the specified users will no longer be billed to the organization.
    * To use this endpoint, the billing settings for the organization must be set to `selected_members`. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: RequestBodyContentApplicationjsonSelectedusernamesArray
  
  /**
    * Add users to Codespaces billing for an organization
    * @description Codespaces for the specified users will be billed to the organization.
    * To use this endpoint, the billing settings for the organization must be set to `selected_members`. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonSelectedusernamesArray
}
object DeletePost {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonSelectedusernamesArray,
    post: RequestBodyContentApplicationjsonSelectedusernamesArray
  ): DeletePost = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePost] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonSelectedusernamesArray): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonSelectedusernamesArray): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
