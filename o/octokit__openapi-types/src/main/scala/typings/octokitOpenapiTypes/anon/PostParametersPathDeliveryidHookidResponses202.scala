package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathDeliveryidHookidResponses202 extends StObject {
  
  /** Redeliver a delivery for a webhook configured in an organization. */
  var post: ParametersPathDeliveryidHookidResponses202
}
object PostParametersPathDeliveryidHookidResponses202 {
  
  inline def apply(post: ParametersPathDeliveryidHookidResponses202): PostParametersPathDeliveryidHookidResponses202 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathDeliveryidHookidResponses202]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathDeliveryidHookidResponses202] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathDeliveryidHookidResponses202): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
