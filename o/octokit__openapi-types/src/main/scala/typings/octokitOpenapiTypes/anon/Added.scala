package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added extends StObject {
  
  /** @description An array of files added in the commit. */
  var added: js.UndefOr[js.Array[String]] = js.undefined
  
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
  
  /** @description Whether this commit is distinct from any that have been pushed before. */
  var distinct: Boolean
  
  var id: String
  
  /** @description The commit message. */
  var message: String
  
  /** @description An array of files modified by the commit. */
  var modified: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description An array of files removed in the commit. */
  var removed: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Format: date-time
    * @description The ISO 8601 timestamp of the commit.
    */
  var timestamp: String
  
  var tree_id: String
  
  /**
    * Format: uri
    * @description URL that points to the commit API resource.
    */
  var url: String
}
object Added {
  
  inline def apply(
    author: NameUsername,
    committer: NameUsername,
    distinct: Boolean,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String,
    url: String
  ): Added = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[String]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setAddedVarargs(value: String*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setAuthor(value: NameUsername): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: NameUsername): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setModified(value: js.Array[String]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setModifiedVarargs(value: String*): Self = StObject.set(x, "modified", js.Array(value*))
    
    inline def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTree_id(value: String): Self = StObject.set(x, "tree_id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
