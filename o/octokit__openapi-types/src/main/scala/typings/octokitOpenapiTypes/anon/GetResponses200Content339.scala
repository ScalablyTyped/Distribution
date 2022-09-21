package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content339 extends StObject {
  
  /**
    * This returns the tag protection states of a repository.
    *
    * This information is only available to repository administrators.
    */
  var get: Responses200Content339
  
  /**
    * This creates a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  var post: RequestBodyContentApplicationjsonPattern
}
object GetResponses200Content339 {
  
  inline def apply(get: Responses200Content339, post: RequestBodyContentApplicationjsonPattern): GetResponses200Content339 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content339]
  }
  
  extension [Self <: GetResponses200Content339](x: Self) {
    
    inline def setGet(value: Responses200Content339): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonPattern): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
