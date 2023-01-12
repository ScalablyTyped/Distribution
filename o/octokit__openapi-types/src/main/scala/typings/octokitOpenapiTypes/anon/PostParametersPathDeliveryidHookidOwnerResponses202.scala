package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathDeliveryidHookidOwnerResponses202 extends StObject {
  
  /** Redeliver a webhook delivery for a webhook configured in a repository. */
  var post: ParametersPathDeliveryidHookidOwnerResponses202
}
object PostParametersPathDeliveryidHookidOwnerResponses202 {
  
  inline def apply(post: ParametersPathDeliveryidHookidOwnerResponses202): PostParametersPathDeliveryidHookidOwnerResponses202 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathDeliveryidHookidOwnerResponses202]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathDeliveryidHookidOwnerResponses202] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathDeliveryidHookidOwnerResponses202): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
