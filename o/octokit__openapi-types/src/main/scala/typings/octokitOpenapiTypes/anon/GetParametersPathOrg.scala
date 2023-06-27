package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrg extends StObject {
  
  /**
    * List requests to access organization resources with fine-grained personal access tokens
    * @description Lists requests from organization members to access organization resources with a fine-grained personal access token. Only GitHub Apps can call this API,
    * using the `organization_personal_access_token_requests: read` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var get: ParametersPathOrg
  
  /**
    * Review requests to access organization resources with fine-grained personal access tokens
    * @description Approves or denies multiple pending requests to access organization resources via a fine-grained personal access token. Only GitHub Apps can call this API,
    * using the `organization_personal_access_token_requests: write` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var post: Parameters55
}
object GetParametersPathOrg {
  
  inline def apply(get: ParametersPathOrg, post: Parameters55): GetParametersPathOrg = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrg] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrg): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Parameters55): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
