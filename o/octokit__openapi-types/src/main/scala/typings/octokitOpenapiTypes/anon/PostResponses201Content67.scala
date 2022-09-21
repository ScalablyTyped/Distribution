package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content67 extends StObject {
  
  /** Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. */
  var post: Responses201Content67
}
object PostResponses201Content67 {
  
  inline def apply(post: Responses201Content67): PostResponses201Content67 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content67]
  }
  
  extension [Self <: PostResponses201Content67](x: Self) {
    
    inline def setPost(value: Responses201Content67): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
