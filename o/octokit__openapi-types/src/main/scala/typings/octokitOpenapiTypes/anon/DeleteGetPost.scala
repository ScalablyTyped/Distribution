package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPost extends StObject {
  
  /**
    * Remove all custom labels from a self-hosted runner configured in an
    * organization. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: Responses66
  
  /**
    * Lists all labels for a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgRunneridResponses23
  
  /**
    * Add custom labels to a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: Responses404422
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: Responses404422
}
object DeleteGetPost {
  
  inline def apply(
    delete: Responses66,
    get: ParametersPathOrgRunneridResponses23,
    post: Responses404422,
    put: Responses404422
  ): DeleteGetPost = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPost]
  }
  
  extension [Self <: DeleteGetPost](x: Self) {
    
    inline def setDelete(value: Responses66): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOrgRunneridResponses23): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses404422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
