package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters197 extends StObject {
  
  /**
    * List all autolinks of a repository
    * @description This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: Parameters197
  
  /**
    * Create an autolink reference for a repository
    * @description Users with admin access to the repository can create an autolink.
    */
  var post: RequestBodyContentApplicationjsonIsalphanumeric
}
object GetParameters197 {
  
  inline def apply(get: Parameters197, post: RequestBodyContentApplicationjsonIsalphanumeric): GetParameters197 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters197]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters197] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters197): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
