package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParameters135Responses201Content21 extends StObject {
  
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
  var post: Parameters135Responses201Content21
}
object PostParameters135Responses201Content21 {
  
  inline def apply(post: Parameters135Responses201Content21): PostParameters135Responses201Content21 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParameters135Responses201Content21]
  }
  
  extension [Self <: PostParameters135Responses201Content21](x: Self) {
    
    inline def setPost(value: Parameters135Responses201Content21): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
