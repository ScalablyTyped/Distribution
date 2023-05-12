package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonBranchString extends StObject {
  
  /**
    * Sync a fork branch with the upstream repository
    * @description Sync a branch of a forked repository to keep it up-to-date with the upstream repository.
    */
  var post: RequestBodyContentApplicationjsonBranchString
}
object PostRequestBodyContentApplicationjsonBranchString {
  
  inline def apply(post: RequestBodyContentApplicationjsonBranchString): PostRequestBodyContentApplicationjsonBranchString = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonBranchString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonBranchString] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonBranchString): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
