package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content21 extends StObject {
  
  /**
    * Returns a token that you can pass to the `config` script to remove a self-hosted runner from an enterprise. The token expires after one hour.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from an enterprise, replace `TOKEN` with the remove token provided by this
    * endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  var post: Responses201Content21
}
object PostResponses201Content21 {
  
  inline def apply(post: Responses201Content21): PostResponses201Content21 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content21]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses201Content21] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses201Content21): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
