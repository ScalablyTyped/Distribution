package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses147 extends StObject {
  
  var delete: Responses147
  
  var get: Responses200Content270
  
  var post: RequestBodyContent274
  
  /** Removes any previous labels and sets the new labels for an issue. */
  var put: RequestBodyContent274
}
object DeleteResponses147 {
  
  inline def apply(
    delete: Responses147,
    get: Responses200Content270,
    post: RequestBodyContent274,
    put: RequestBodyContent274
  ): DeleteResponses147 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses147]
  }
  
  extension [Self <: DeleteResponses147](x: Self) {
    
    inline def setDelete(value: Responses147): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content270): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent274): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent274): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
