package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParameters418RequestBodyContent79 extends StObject {
  
  /** Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. */
  var post: Parameters418RequestBodyContent79
}
object PostParameters418RequestBodyContent79 {
  
  inline def apply(post: Parameters418RequestBodyContent79): PostParameters418RequestBodyContent79 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParameters418RequestBodyContent79]
  }
  
  extension [Self <: PostParameters418RequestBodyContent79](x: Self) {
    
    inline def setPost(value: Parameters418RequestBodyContent79): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
