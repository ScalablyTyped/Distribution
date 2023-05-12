package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPatrequestid extends StObject {
  
  /**
    * Review a request to access organization resources with a fine-grained personal access token
    * @description Approves or denies a pending request to access organization resources via a fine-grained personal access token. Only GitHub Apps can call this API,
    * using the `organization_personal_access_token_requests: write` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var post: ParametersPathPatrequestid
}
object PostParametersPathPatrequestid {
  
  inline def apply(post: ParametersPathPatrequestid): PostParametersPathPatrequestid = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathPatrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathPatrequestid] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathPatrequestid): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
