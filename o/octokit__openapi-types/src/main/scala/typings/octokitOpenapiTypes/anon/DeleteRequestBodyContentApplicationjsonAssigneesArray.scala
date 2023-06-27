package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonAssigneesArray extends StObject {
  
  /**
    * Remove assignees from an issue
    * @description Removes one or more assignees from an issue.
    */
  var delete: RequestBodyContentApplicationjsonAssigneesArray
  
  /**
    * Add assignees to an issue
    * @description Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    */
  var post: Responses201326
}
object DeleteRequestBodyContentApplicationjsonAssigneesArray {
  
  inline def apply(delete: RequestBodyContentApplicationjsonAssigneesArray, post: Responses201326): DeleteRequestBodyContentApplicationjsonAssigneesArray = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonAssigneesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRequestBodyContentApplicationjsonAssigneesArray] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonAssigneesArray): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201326): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
