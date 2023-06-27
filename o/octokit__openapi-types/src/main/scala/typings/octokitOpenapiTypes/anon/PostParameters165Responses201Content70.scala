package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParameters165Responses201Content70 extends StObject {
  
  /**
    * Create a remove token for a repository
    * @description Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour.
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
  var post: Parameters165Responses201Content70
}
object PostParameters165Responses201Content70 {
  
  inline def apply(post: Parameters165Responses201Content70): PostParameters165Responses201Content70 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParameters165Responses201Content70]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParameters165Responses201Content70] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Parameters165Responses201Content70): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
