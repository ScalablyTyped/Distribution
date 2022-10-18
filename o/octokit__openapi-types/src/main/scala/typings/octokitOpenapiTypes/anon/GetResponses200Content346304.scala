package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content346304 extends StObject {
  
  /** Lists all migrations a user has started. */
  var get: Responses200Content346304
  
  /** Initiates the generation of a user migration archive. */
  var post: Responses201Content347304
}
object GetResponses200Content346304 {
  
  inline def apply(get: Responses200Content346304, post: Responses201Content347304): GetResponses200Content346304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content346304]
  }
  
  extension [Self <: GetResponses200Content346304](x: Self) {
    
    inline def setGet(value: Responses200Content346304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content347304): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
