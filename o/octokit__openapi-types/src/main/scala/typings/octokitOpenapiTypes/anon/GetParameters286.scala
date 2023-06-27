package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters286 extends StObject {
  
  /** List forks */
  var get: Parameters286
  
  /**
    * Create a fork
    * @description Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    *
    * **Note**: Although this endpoint works with GitHub Apps, the GitHub App must be installed on the destination account with access to all repositories and on the source account with access to the source repository.
    */
  var post: Responses202400
}
object GetParameters286 {
  
  inline def apply(get: Parameters286, post: Responses202400): GetParameters286 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters286]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters286] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters286): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses202400): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
