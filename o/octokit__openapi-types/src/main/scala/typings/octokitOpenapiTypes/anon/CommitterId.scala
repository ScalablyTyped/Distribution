package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitterId extends StObject {
  
  var author: js.UndefOr[`313`] = js.undefined
  
  var committer: js.UndefOr[`313`] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[String] = js.undefined
  
  var tree_id: js.UndefOr[String] = js.undefined
}
object CommitterId {
  
  inline def apply(): CommitterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitterId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitterId] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: `313`): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCommitter(value: `313`): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTree_id(value: String): Self = StObject.set(x, "tree_id", value.asInstanceOf[js.Any])
    
    inline def setTree_idUndefined: Self = StObject.set(x, "tree_id", js.undefined)
  }
}
