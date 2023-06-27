package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses404409422 extends StObject {
  
  /**
    * Delete a GitHub Pages site
    * @description Deletes a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages).
    *
    * To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administration:write` and `pages:write` permissions.
    */
  var delete: Responses404409422
  
  /**
    * Get a GitHub Pages site
    * @description Gets information about a GitHub Pages site.
    *
    * A token with the `repo` scope is required. GitHub Apps must have the `pages:read` permission.
    */
  var get: Responses200Content357
  
  /**
    * Create a GitHub Pages site
    * @description Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)."
    *
    * To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administration:write` and `pages:write` permissions.
    */
  var post: RequestBodyContent358
  
  /**
    * Update information about a GitHub Pages site
    * @description Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages).
    *
    * To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administration:write` and `pages:write` permissions.
    */
  var put: RequestBodyContentApplicationjsonBuildtype
}
object DeleteResponses404409422 {
  
  inline def apply(
    delete: Responses404409422,
    get: Responses200Content357,
    post: RequestBodyContent358,
    put: RequestBodyContentApplicationjsonBuildtype
  ): DeleteResponses404409422 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses404409422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses404409422] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses404409422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content357): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent358): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonBuildtype): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
