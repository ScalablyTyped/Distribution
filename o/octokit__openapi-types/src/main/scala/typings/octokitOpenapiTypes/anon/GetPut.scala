package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPut extends StObject {
  
  /** Unstar a gist */
  var delete: Responses304403404
  
  /** Check if a gist is starred */
  var get: Responses404ContentApplicationjsonRecord
  
  /**
    * Star a gist
    * @description Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: Responses304403404
}
object GetPut {
  
  inline def apply(delete: Responses304403404, get: Responses404ContentApplicationjsonRecord, put: Responses304403404): GetPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPut] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses304403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses404ContentApplicationjsonRecord): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses304403404): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
