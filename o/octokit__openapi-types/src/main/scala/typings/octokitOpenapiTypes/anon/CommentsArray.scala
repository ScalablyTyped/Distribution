package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsArray extends StObject {
  
  var comments: js.Array[Originalposition]
  
  var node_id: String
}
object CommentsArray {
  
  inline def apply(comments: js.Array[Originalposition], node_id: String): CommentsArray = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentsArray] (val x: Self) extends AnyVal {
    
    inline def setComments(value: js.Array[Originalposition]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsVarargs(value: Originalposition*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
