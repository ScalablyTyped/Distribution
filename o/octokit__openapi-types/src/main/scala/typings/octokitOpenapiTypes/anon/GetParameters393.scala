package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters393 extends StObject {
  
  /**
    * Get all repository rulesets
    * @description Get all the rulesets for a repository.
    */
  var get: Parameters393
  
  /**
    * Create a repository ruleset
    * @description Create a ruleset for a repository.
    */
  var post: RequestBodyContentApplicationjsonBypassmode
}
object GetParameters393 {
  
  inline def apply(get: Parameters393, post: RequestBodyContentApplicationjsonBypassmode): GetParameters393 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters393]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters393] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters393): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBypassmode): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
