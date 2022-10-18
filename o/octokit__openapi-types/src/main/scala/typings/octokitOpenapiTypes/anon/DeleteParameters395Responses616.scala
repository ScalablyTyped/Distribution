package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters395Responses616 extends StObject {
  
  var delete: Parameters395Responses616
  
  var get: Responses403404Content6
  
  /** Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)." */
  var put: Parameters395Responses616
}
object DeleteParameters395Responses616 {
  
  inline def apply(delete: Parameters395Responses616, get: Responses403404Content6, put: Parameters395Responses616): DeleteParameters395Responses616 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters395Responses616]
  }
  
  extension [Self <: DeleteParameters395Responses616](x: Self) {
    
    inline def setDelete(value: Parameters395Responses616): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses403404Content6): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters395Responses616): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
