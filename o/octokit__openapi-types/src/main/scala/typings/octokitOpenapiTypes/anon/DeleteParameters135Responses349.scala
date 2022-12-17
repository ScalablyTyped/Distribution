package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters135Responses349 extends StObject {
  
  var delete: Parameters135Responses349
  
  var get: Responses403404Content48
  
  /** Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)." */
  var put: Parameters135Responses349
}
object DeleteParameters135Responses349 {
  
  inline def apply(delete: Parameters135Responses349, get: Responses403404Content48, put: Parameters135Responses349): DeleteParameters135Responses349 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters135Responses349]
  }
  
  extension [Self <: DeleteParameters135Responses349](x: Self) {
    
    inline def setDelete(value: Parameters135Responses349): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses403404Content48): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters135Responses349): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
