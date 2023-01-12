package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses268 extends StObject {
  
  var delete: Responses268
  
  var get: Responses301404410
  
  var post: RequestBodyContent267
  
  /** Removes any previous labels and sets the new labels for an issue. */
  var put: RequestBodyContent267
}
object DeleteResponses268 {
  
  inline def apply(
    delete: Responses268,
    get: Responses301404410,
    post: RequestBodyContent267,
    put: RequestBodyContent267
  ): DeleteResponses268 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses268]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses268] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses268): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses301404410): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent267): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent267): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
