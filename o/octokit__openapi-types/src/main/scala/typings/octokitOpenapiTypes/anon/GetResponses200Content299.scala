package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content299 extends StObject {
  
  /**
    * List repository webhooks
    * @description Lists webhooks for a repository. `last response` may return null if there have not been any deliveries within 30 days.
    */
  var get: Responses200Content299
  
  /**
    * Create a repository webhook
    * @description Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  var post: Responses201Content303
}
object GetResponses200Content299 {
  
  inline def apply(get: Responses200Content299, post: Responses201Content303): GetResponses200Content299 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content299]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content299] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content299): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content303): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
