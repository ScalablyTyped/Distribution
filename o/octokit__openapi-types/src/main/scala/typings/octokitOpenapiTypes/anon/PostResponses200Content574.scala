package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200Content574 extends StObject {
  
  /** Generate a name and body describing a [release](https://docs.github.com/rest/reference/repos#releases). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release. */
  var post: Responses200Content574
}
object PostResponses200Content574 {
  
  inline def apply(post: Responses200Content574): PostResponses200Content574 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200Content574]
  }
  
  extension [Self <: PostResponses200Content574](x: Self) {
    
    inline def setPost(value: Responses200Content574): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
