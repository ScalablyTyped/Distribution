package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content590 extends StObject {
  
  /**
    * This returns the tag protection states of a repository.
    *
    * This information is only available to repository administrators.
    */
  var get: Responses200Content590
  
  /**
    * This creates a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  var post: Responses201Content591
}
object GetResponses200Content590 {
  
  inline def apply(get: Responses200Content590, post: Responses201Content591): GetResponses200Content590 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content590]
  }
  
  extension [Self <: GetResponses200Content590](x: Self) {
    
    inline def setGet(value: Responses200Content590): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content591): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
