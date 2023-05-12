package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsNodeid extends StObject {
  
  var comments: js.Array[Originalstartline]
  
  var node_id: String
}
object CommentsNodeid {
  
  inline def apply(comments: js.Array[Originalstartline], node_id: String): CommentsNodeid = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsNodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentsNodeid] (val x: Self) extends AnyVal {
    
    inline def setComments(value: js.Array[Originalstartline]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsVarargs(value: Originalstartline*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
