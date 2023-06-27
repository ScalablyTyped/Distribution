package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content330 extends StObject {
  
  /**
    * List labels for a repository
    * @description Lists all labels for a repository.
    */
  var get: Responses200Content330
  
  /**
    * Create a label
    * @description Creates a label for the specified repository with the given name and color. The name and color parameters are required. The color must be a valid [hexadecimal color code](http://www.color-hex.com/).
    */
  var post: RequestBodyContentApplicationjsonColorDescription
}
object GetResponses200Content330 {
  
  inline def apply(get: Responses200Content330, post: RequestBodyContentApplicationjsonColorDescription): GetResponses200Content330 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content330]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content330] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content330): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonColorDescription): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
