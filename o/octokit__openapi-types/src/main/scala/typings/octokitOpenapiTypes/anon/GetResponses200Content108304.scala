package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content108304 extends StObject {
  
  /**
    * List user migrations
    * @description Lists all migrations a user has started.
    */
  var get: Responses200Content108304
  
  /**
    * Start a user migration
    * @description Initiates the generation of a user migration archive.
    */
  var post: RequestBodyContentApplicationjsonExcludegitdata
}
object GetResponses200Content108304 {
  
  inline def apply(get: Responses200Content108304, post: RequestBodyContentApplicationjsonExcludegitdata): GetResponses200Content108304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content108304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content108304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content108304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonExcludegitdata): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
