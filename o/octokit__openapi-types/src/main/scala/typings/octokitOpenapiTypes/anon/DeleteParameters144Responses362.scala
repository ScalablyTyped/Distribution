package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters144Responses362 extends StObject {
  
  var delete: Parameters144Responses362
  
  var get: Responses403404Content55
  
  /** Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)." */
  var put: Parameters144Responses362
}
object DeleteParameters144Responses362 {
  
  inline def apply(delete: Parameters144Responses362, get: Responses403404Content55, put: Parameters144Responses362): DeleteParameters144Responses362 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters144Responses362]
  }
  
  extension [Self <: DeleteParameters144Responses362](x: Self) {
    
    inline def setDelete(value: Parameters144Responses362): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses403404Content55): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters144Responses362): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
