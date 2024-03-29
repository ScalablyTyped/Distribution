package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content70 extends StObject {
  
  /**
    * Create a remove token for an organization
    * @description Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this
    * endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  var post: Responses201Content70
}
object PostResponses201Content70 {
  
  inline def apply(post: Responses201Content70): PostResponses201Content70 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content70]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses201Content70] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses201Content70): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
