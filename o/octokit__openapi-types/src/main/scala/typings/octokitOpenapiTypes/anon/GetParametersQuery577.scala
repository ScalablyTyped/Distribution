package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery577 extends StObject {
  
  /** List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases). */
  var get: ParametersQuery577
  
  /** Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a `Status: 200 OK` means that you already added the reaction type to this release. */
  var post: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180
}
object GetParametersQuery577 {
  
  inline def apply(get: ParametersQuery577, post: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180): GetParametersQuery577 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery577]
  }
  
  extension [Self <: GetParametersQuery577](x: Self) {
    
    inline def setGet(value: ParametersQuery577): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
