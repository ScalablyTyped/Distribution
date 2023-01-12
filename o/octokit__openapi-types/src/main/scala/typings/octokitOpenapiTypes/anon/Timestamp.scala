package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  var author: EmailString | Null
  
  var committer: EmailString | Null
  
  var id: String
  
  var message: String
  
  /** Format: date-time */
  var timestamp: String
  
  var tree_id: String
}
object Timestamp {
  
  inline def apply(id: String, message: String, timestamp: String, tree_id: String): Timestamp = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any], author = null, committer = null)
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: EmailString): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setCommitter(value: EmailString): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterNull: Self = StObject.set(x, "committer", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTree_id(value: String): Self = StObject.set(x, "tree_id", value.asInstanceOf[js.Any])
  }
}
