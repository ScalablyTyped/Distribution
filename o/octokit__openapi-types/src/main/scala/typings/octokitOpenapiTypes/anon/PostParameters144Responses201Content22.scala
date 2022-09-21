package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParameters144Responses201Content22 extends StObject {
  
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
  var post: Parameters144Responses201Content22
}
object PostParameters144Responses201Content22 {
  
  inline def apply(post: Parameters144Responses201Content22): PostParameters144Responses201Content22 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParameters144Responses201Content22]
  }
  
  extension [Self <: PostParameters144Responses201Content22](x: Self) {
    
    inline def setPost(value: Parameters144Responses201Content22): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
