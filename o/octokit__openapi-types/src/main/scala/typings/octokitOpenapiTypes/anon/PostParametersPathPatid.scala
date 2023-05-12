package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPatid extends StObject {
  
  /**
    * Update the access a fine-grained personal access token has to organization resources
    * @description Updates the access an organization member has to organization resources via a fine-grained personal access token. Limited to revoking the token's existing access. Limited to revoking a token's existing access. Only GitHub Apps can call this API,
    * using the `organization_personal_access_tokens: write` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var post: ParametersPathPatid
}
object PostParametersPathPatid {
  
  inline def apply(post: ParametersPathPatid): PostParametersPathPatid = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathPatid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathPatid] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathPatid): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
