package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content508HeadersLocation extends StObject {
  
  /** Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches. */
  var post: Responses201Content508HeadersLocation
}
object PostResponses201Content508HeadersLocation {
  
  inline def apply(post: Responses201Content508HeadersLocation): PostResponses201Content508HeadersLocation = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content508HeadersLocation]
  }
  
  extension [Self <: PostResponses201Content508HeadersLocation](x: Self) {
    
    inline def setPost(value: Responses201Content508HeadersLocation): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
