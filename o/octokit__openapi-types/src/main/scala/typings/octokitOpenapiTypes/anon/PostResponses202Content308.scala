package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses202Content308 extends StObject {
  
  /** Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. */
  var post: Responses202Content308
}
object PostResponses202Content308 {
  
  inline def apply(post: Responses202Content308): PostResponses202Content308 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses202Content308]
  }
  
  extension [Self <: PostResponses202Content308](x: Self) {
    
    inline def setPost(value: Responses202Content308): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
