package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters160 extends StObject {
  
  /**
    * List project columns
    * @description Lists the project columns in a project.
    */
  var get: Parameters160
  
  /**
    * Create a project column
    * @description Creates a new project column.
    */
  var post: Responses201304401403
}
object GetParameters160 {
  
  inline def apply(get: Parameters160, post: Responses201304401403): GetParameters160 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters160]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters160] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters160): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304401403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
