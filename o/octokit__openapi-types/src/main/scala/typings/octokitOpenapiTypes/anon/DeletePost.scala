package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePost extends StObject {
  
  /** Removes one or more assignees from an issue. */
  var delete: RequestBodyContentApplicationjsonAssigneesArray
  
  /** Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced. */
  var post: RequestBodyContentApplicationjson261
}
object DeletePost {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonAssigneesArray,
    post: RequestBodyContentApplicationjson261
  ): DeletePost = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePost]
  }
  
  extension [Self <: DeletePost](x: Self) {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonAssigneesArray): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjson261): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
