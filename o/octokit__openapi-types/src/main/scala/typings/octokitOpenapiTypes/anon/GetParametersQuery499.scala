package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery499 extends StObject {
  
  var get: ParametersQuery499
  
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    */
  var post: Responses202400403
}
object GetParametersQuery499 {
  
  inline def apply(get: ParametersQuery499, post: Responses202400403): GetParametersQuery499 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery499]
  }
  
  extension [Self <: GetParametersQuery499](x: Self) {
    
    inline def setGet(value: ParametersQuery499): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses202400403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
