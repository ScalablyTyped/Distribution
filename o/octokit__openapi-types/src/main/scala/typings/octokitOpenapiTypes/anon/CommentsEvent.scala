package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsEvent extends StObject {
  
  var comments: js.UndefOr[js.Array[Inreplytoid]] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
}
object CommentsEvent {
  
  inline def apply(): CommentsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsEvent]
  }
  
  extension [Self <: CommentsEvent](x: Self) {
    
    inline def setComments(value: js.Array[Inreplytoid]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: Inreplytoid*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
  }
}
