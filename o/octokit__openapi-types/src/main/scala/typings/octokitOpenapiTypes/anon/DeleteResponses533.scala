package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses533 extends StObject {
  
  var delete: Responses533
  
  var get: Responses200Content531
  
  var post: Responses301404410422
  
  /** Removes any previous labels and sets the new labels for an issue. */
  var put: Responses301404410422
}
object DeleteResponses533 {
  
  inline def apply(
    delete: Responses533,
    get: Responses200Content531,
    post: Responses301404410422,
    put: Responses301404410422
  ): DeleteResponses533 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses533]
  }
  
  extension [Self <: DeleteResponses533](x: Self) {
    
    inline def setDelete(value: Responses533): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content531): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses301404410422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses301404410422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
