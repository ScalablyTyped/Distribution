package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content91 extends StObject {
  
  /** List organization webhooks */
  var get: Responses200Content91
  
  /**
    * Create an organization webhook
    * @description Here's how you can create a hook that posts payloads in JSON format:
    */
  var post: RequestBodyContentApplicationjsonActive
}
object GetResponses200Content91 {
  
  inline def apply(get: Responses200Content91, post: RequestBodyContentApplicationjsonActive): GetResponses200Content91 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content91]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content91] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content91): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonActive): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
