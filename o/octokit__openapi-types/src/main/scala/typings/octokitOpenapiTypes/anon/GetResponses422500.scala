package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses422500 extends StObject {
  
  /**
    * List fine-grained personal access tokens with access to organization resources
    * @description Lists approved fine-grained personal access tokens owned by organization members that can access organization resources. Only GitHub Apps can call this API,
    * using the `organization_personal_access_tokens: read` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var get: Responses422500
  
  /**
    * Update the access to organization resources via fine-grained personal access tokens
    * @description Updates the access organization members have to organization resources via fine-grained personal access tokens. Limited to revoking a token's existing access. Only GitHub Apps can call this API,
    * using the `organization_personal_access_tokens: write` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var post: RequestBodyContentApplicationjsonPatids
}
object GetResponses422500 {
  
  inline def apply(get: Responses422500, post: RequestBodyContentApplicationjsonPatids): GetResponses422500 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses422500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses422500] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses422500): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonPatids): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
