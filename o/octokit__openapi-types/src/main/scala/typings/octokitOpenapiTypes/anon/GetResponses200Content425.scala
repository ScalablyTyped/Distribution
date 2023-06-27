package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content425 extends StObject {
  
  /**
    * List tag protection states for a repository
    * @description This returns the tag protection states of a repository.
    *
    * This information is only available to repository administrators.
    */
  var get: Responses200Content425
  
  /**
    * Create a tag protection state for a repository
    * @description This creates a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  var post: RequestBodyContentApplicationjsonPattern
}
object GetResponses200Content425 {
  
  inline def apply(get: Responses200Content425, post: RequestBodyContentApplicationjsonPattern): GetResponses200Content425 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content425]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content425] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content425): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonPattern): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
