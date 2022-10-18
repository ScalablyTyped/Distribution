package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberOwnerRepoQuery374 extends StObject {
  
  /** List the reactions to an [issue](https://docs.github.com/rest/reference/issues). */
  var get: ParametersPathIssuenumberOwnerRepoQuery374
  
  /** Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP `200` status means that you already added the reaction type to this issue. */
  var post: ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62
}
object GetParametersPathIssuenumberOwnerRepoQuery374 {
  
  inline def apply(
    get: ParametersPathIssuenumberOwnerRepoQuery374,
    post: ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62
  ): GetParametersPathIssuenumberOwnerRepoQuery374 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberOwnerRepoQuery374]
  }
  
  extension [Self <: GetParametersPathIssuenumberOwnerRepoQuery374](x: Self) {
    
    inline def setGet(value: ParametersPathIssuenumberOwnerRepoQuery374): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
