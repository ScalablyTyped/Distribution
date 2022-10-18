package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberOwnerRepoResponses345 extends StObject {
  
  /** Users with push access can unlock an issue's conversation. */
  var delete: ParametersPathIssuenumberOwnerRepoResponses345
  
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: Responses534
}
object DeleteParametersPathIssuenumberOwnerRepoResponses345 {
  
  inline def apply(delete: ParametersPathIssuenumberOwnerRepoResponses345, put: Responses534): DeleteParametersPathIssuenumberOwnerRepoResponses345 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberOwnerRepoResponses345]
  }
  
  extension [Self <: DeleteParametersPathIssuenumberOwnerRepoResponses345](x: Self) {
    
    inline def setDelete(value: ParametersPathIssuenumberOwnerRepoResponses345): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses534): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
