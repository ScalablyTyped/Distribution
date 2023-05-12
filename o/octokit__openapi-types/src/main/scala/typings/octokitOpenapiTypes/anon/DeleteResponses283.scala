package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses283 extends StObject {
  
  /** Remove all labels from an issue */
  var delete: Responses283
  
  /** List labels for an issue */
  var get: Responses301404410
  
  /** Add labels to an issue */
  var post: Responses200301404410
  
  /**
    * Set labels for an issue
    * @description Removes any previous labels and sets the new labels for an issue.
    */
  var put: Responses200301404410
}
object DeleteResponses283 {
  
  inline def apply(
    delete: Responses283,
    get: Responses301404410,
    post: Responses200301404410,
    put: Responses200301404410
  ): DeleteResponses283 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses283]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses283] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses283): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses301404410): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200301404410): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200301404410): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
