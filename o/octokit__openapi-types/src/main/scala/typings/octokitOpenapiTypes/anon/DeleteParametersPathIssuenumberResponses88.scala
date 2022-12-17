package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberResponses88 extends StObject {
  
  /** Users with push access can unlock an issue's conversation. */
  var delete: ParametersPathIssuenumberResponses88
  
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: RequestBodyContent269
}
object DeleteParametersPathIssuenumberResponses88 {
  
  inline def apply(delete: ParametersPathIssuenumberResponses88, put: RequestBodyContent269): DeleteParametersPathIssuenumberResponses88 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberResponses88]
  }
  
  extension [Self <: DeleteParametersPathIssuenumberResponses88](x: Self) {
    
    inline def setDelete(value: ParametersPathIssuenumberResponses88): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent269): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
