package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageSort extends StObject {
  
  var get: ParametersQueryPerpageSort
  
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api).
    */
  var post: RequestBodyContent229
}
object GetParametersQueryPerpageSort {
  
  inline def apply(get: ParametersQueryPerpageSort, post: RequestBodyContent229): GetParametersQueryPerpageSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPerpageSort] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPerpageSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent229): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
