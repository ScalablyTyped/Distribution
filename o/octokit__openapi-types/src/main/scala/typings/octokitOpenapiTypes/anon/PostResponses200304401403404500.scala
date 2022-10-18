package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200304401403404500 extends StObject {
  
  /**
    * Stops a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: Responses200304401403404500
}
object PostResponses200304401403404500 {
  
  inline def apply(post: Responses200304401403404500): PostResponses200304401403404500 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200304401403404500]
  }
  
  extension [Self <: PostResponses200304401403404500](x: Self) {
    
    inline def setPost(value: Responses200304401403404500): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
