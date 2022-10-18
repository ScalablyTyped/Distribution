package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParameters395Responses201Content258 extends StObject {
  
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from a repository, replace TOKEN with the remove token provided by this endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  var post: Parameters395Responses201Content258
}
object PostParameters395Responses201Content258 {
  
  inline def apply(post: Parameters395Responses201Content258): PostParameters395Responses201Content258 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParameters395Responses201Content258]
  }
  
  extension [Self <: PostParameters395Responses201Content258](x: Self) {
    
    inline def setPost(value: Parameters395Responses201Content258): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
