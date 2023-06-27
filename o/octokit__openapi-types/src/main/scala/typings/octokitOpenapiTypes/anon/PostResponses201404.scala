package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201404 extends StObject {
  
  /**
    * Create configuration for a just-in-time runner for a repository
    * @description Generates a configuration that can be passed to the runner application at startup.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  var post: Responses201404
}
object PostResponses201404 {
  
  inline def apply(post: Responses201404): PostResponses201404 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses201404] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses201404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
