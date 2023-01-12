package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content241 extends StObject {
  
  /** Lists webhooks for a repository. `last response` may return null if there have not been any deliveries within 30 days. */
  var get: Responses200Content241
  
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  var post: RequestBodyContent243
}
object GetResponses200Content241 {
  
  inline def apply(get: Responses200Content241, post: RequestBodyContent243): GetResponses200Content241 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content241]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content241] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content241): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent243): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
