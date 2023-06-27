package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters165Responses445 extends StObject {
  
  /** Unstar a repository for the authenticated user */
  var delete: Parameters165Responses445
  
  /** Check if a repository is starred by the authenticated user */
  var get: Responses403404Content41
  
  /**
    * Star a repository for the authenticated user
    * @description Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  var put: Parameters165Responses445
}
object DeleteParameters165Responses445 {
  
  inline def apply(delete: Parameters165Responses445, get: Responses403404Content41, put: Parameters165Responses445): DeleteParameters165Responses445 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters165Responses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters165Responses445] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters165Responses445): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses403404Content41): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters165Responses445): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
