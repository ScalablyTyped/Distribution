package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters349 extends StObject {
  
  /**
    * List milestones
    * @description Lists milestones for a repository.
    */
  var get: Parameters349
  
  /**
    * Create a milestone
    * @description Creates a milestone.
    */
  var post: RequestBodyContentApplicationjsonDueon
}
object GetParameters349 {
  
  inline def apply(get: Parameters349, post: RequestBodyContentApplicationjsonDueon): GetParameters349 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters349]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters349] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters349): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonDueon): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
