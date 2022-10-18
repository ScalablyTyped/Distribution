package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathDeliveryidHookidOwnerRepoResponses202400422 extends StObject {
  
  /** Redeliver a webhook delivery for a webhook configured in a repository. */
  var post: ParametersPathDeliveryidHookidOwnerRepoResponses202400422
}
object PostParametersPathDeliveryidHookidOwnerRepoResponses202400422 {
  
  inline def apply(post: ParametersPathDeliveryidHookidOwnerRepoResponses202400422): PostParametersPathDeliveryidHookidOwnerRepoResponses202400422 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathDeliveryidHookidOwnerRepoResponses202400422]
  }
  
  extension [Self <: PostParametersPathDeliveryidHookidOwnerRepoResponses202400422](x: Self) {
    
    inline def setPost(value: ParametersPathDeliveryidHookidOwnerRepoResponses202400422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
