package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Treeid extends StObject {
  
  /**
    * Committer
    * @description Metaproperties for Git author/committer information.
    */
  var author: NameUsername
  
  /**
    * Committer
    * @description Metaproperties for Git author/committer information.
    */
  var committer: NameUsername
  
  var id: String
  
  var message: String
  
  var timestamp: String
  
  var tree_id: String
}
object Treeid {
  
  inline def apply(
    author: NameUsername,
    committer: NameUsername,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String
  ): Treeid = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Treeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Treeid] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: NameUsername): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: NameUsername): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTree_id(value: String): Self = StObject.set(x, "tree_id", value.asInstanceOf[js.Any])
  }
}
