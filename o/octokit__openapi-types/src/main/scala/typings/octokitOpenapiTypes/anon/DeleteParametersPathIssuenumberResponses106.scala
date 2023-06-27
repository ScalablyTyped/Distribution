package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathIssuenumberResponses106 extends StObject {
  
  /**
    * Unlock an issue
    * @description Users with push access can unlock an issue's conversation.
    */
  var delete: ParametersPathIssuenumberResponses106
  
  /**
    * Lock an issue
    * @description Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: Responses403404410422
}
object DeleteParametersPathIssuenumberResponses106 {
  
  inline def apply(delete: ParametersPathIssuenumberResponses106, put: Responses403404410422): DeleteParametersPathIssuenumberResponses106 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathIssuenumberResponses106]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathIssuenumberResponses106] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathIssuenumberResponses106): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses403404410422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
