package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters337 extends StObject {
  
  /**
    * List reactions for an issue
    * @description List the reactions to an [issue](https://docs.github.com/rest/reference/issues).
    */
  var get: Parameters337
  
  /**
    * Create reaction for an issue
    * @description Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP `200` status means that you already added the reaction type to this issue.
    */
  var post: ParametersPathIssuenumberRequestBodyContentApplicationjson139
}
object GetParameters337 {
  
  inline def apply(get: Parameters337, post: ParametersPathIssuenumberRequestBodyContentApplicationjson139): GetParameters337 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters337]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters337] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters337): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathIssuenumberRequestBodyContentApplicationjson139): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
