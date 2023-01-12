package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParameters57Responses201Content21 extends StObject {
  
  /**
    * Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour.
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
  var post: Parameters57Responses201Content21
}
object PostParameters57Responses201Content21 {
  
  inline def apply(post: Parameters57Responses201Content21): PostParameters57Responses201Content21 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParameters57Responses201Content21]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParameters57Responses201Content21] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Parameters57Responses201Content21): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
