package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters390 extends StObject {
  
  /**
    * List reactions for a release
    * @description List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  var get: Parameters390
  
  /**
    * Create reaction for a release
    * @description Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a `Status: 200 OK` means that you already added the reaction type to this release.
    */
  var post: RequestBodyContentApplicationjson391
}
object GetParameters390 {
  
  inline def apply(get: Parameters390, post: RequestBodyContentApplicationjson391): GetParameters390 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters390]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters390] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters390): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjson391): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
