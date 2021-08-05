package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentsurl extends StObject {
  
  var author: Avatarurl
  
  var comments_url: String
  
  var commit: Commentcount
  
  var committer: Avatarurl
  
  var html_url: String
  
  var node_id: String
  
  var parents: js.Array[Sha]
  
  var sha: String
  
  var url: String
}
object Commentsurl {
  
  inline def apply(
    author: Avatarurl,
    comments_url: String,
    commit: Commentcount,
    committer: Avatarurl,
    html_url: String,
    node_id: String,
    parents: js.Array[Sha],
    sha: String,
    url: String
  ): Commentsurl = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentsurl]
  }
  
  extension [Self <: Commentsurl](x: Self) {
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: Commentcount): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: Avatarurl): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[Sha]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: Sha*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
