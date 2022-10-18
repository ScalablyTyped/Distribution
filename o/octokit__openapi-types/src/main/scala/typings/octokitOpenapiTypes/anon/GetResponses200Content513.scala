package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content513 extends StObject {
  
  /** Lists webhooks for a repository. `last response` may return null if there have not been any deliveries within 30 days. */
  var get: Responses200Content513
  
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can
    * share the same `config` as long as those webhooks do not have any `events` that overlap.
    */
  var post: RequestBodyContent515
}
object GetResponses200Content513 {
  
  inline def apply(get: Responses200Content513, post: RequestBodyContent515): GetResponses200Content513 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content513]
  }
  
  extension [Self <: GetResponses200Content513](x: Self) {
    
    inline def setGet(value: Responses200Content513): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent515): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
