package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathOrgResponses201Content22 extends StObject {
  
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
  var post: ParametersPathOrgResponses201Content22
}
object PostParametersPathOrgResponses201Content22 {
  
  inline def apply(post: ParametersPathOrgResponses201Content22): PostParametersPathOrgResponses201Content22 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathOrgResponses201Content22]
  }
  
  extension [Self <: PostParametersPathOrgResponses201Content22](x: Self) {
    
    inline def setPost(value: ParametersPathOrgResponses201Content22): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
