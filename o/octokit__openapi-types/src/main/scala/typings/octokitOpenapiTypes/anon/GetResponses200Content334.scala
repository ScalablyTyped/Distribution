package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content334 extends StObject {
  
  /**
    * This returns the tag protection states of a repository.
    *
    * This information is only available to repository administrators.
    */
  var get: Responses200Content334
  
  /**
    * This creates a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  var post: RequestBodyContentApplicationjsonPattern
}
object GetResponses200Content334 {
  
  inline def apply(get: Responses200Content334, post: RequestBodyContentApplicationjsonPattern): GetResponses200Content334 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content334]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content334] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content334): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonPattern): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
