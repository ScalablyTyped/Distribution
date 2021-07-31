package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var author: Email
  
  var committer: Email
  
  var id: String
  
  var message: String
  
  var timestamp: String
  
  var tree_id: String
}
object Author {
  
  @scala.inline
  def apply(author: Email, committer: Email, id: String, message: String, timestamp: String, tree_id: String): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorMutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Email): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Email): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree_id(value: String): Self = StObject.set(x, "tree_id", value.asInstanceOf[js.Any])
  }
}
