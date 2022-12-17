package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content60 extends StObject {
  
  /** Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. */
  var post: Responses201Content60
}
object PostResponses201Content60 {
  
  inline def apply(post: Responses201Content60): PostResponses201Content60 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content60]
  }
  
  extension [Self <: PostResponses201Content60](x: Self) {
    
    inline def setPost(value: Responses201Content60): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
