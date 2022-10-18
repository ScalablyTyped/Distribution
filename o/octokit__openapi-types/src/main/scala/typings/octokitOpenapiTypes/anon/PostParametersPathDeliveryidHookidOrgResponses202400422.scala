package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathDeliveryidHookidOrgResponses202400422 extends StObject {
  
  /** Redeliver a delivery for a webhook configured in an organization. */
  var post: ParametersPathDeliveryidHookidOrgResponses202400422
}
object PostParametersPathDeliveryidHookidOrgResponses202400422 {
  
  inline def apply(post: ParametersPathDeliveryidHookidOrgResponses202400422): PostParametersPathDeliveryidHookidOrgResponses202400422 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathDeliveryidHookidOrgResponses202400422]
  }
  
  extension [Self <: PostParametersPathDeliveryidHookidOrgResponses202400422](x: Self) {
    
    inline def setPost(value: ParametersPathDeliveryidHookidOrgResponses202400422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
