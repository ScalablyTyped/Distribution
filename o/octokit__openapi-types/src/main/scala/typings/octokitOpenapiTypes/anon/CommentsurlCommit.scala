package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsurlCommit extends StObject {
  
  /** User */
  var author: Reposurl | Null
  
  /** Format: uri */
  var comments_url: String
  
  var commit: CommentcountCommitter
  
  /** User */
  var committer: Reposurl | Null
  
  /** Format: uri */
  var html_url: String
  
  var node_id: String
  
  var parents: js.Array[HtmlurlStringShaString]
  
  var sha: String
  
  /** Format: uri */
  var url: String
}
object CommentsurlCommit {
  
  inline def apply(
    comments_url: String,
    commit: CommentcountCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[HtmlurlStringShaString],
    sha: String,
    url: String
  ): CommentsurlCommit = {
    val __obj = js.Dynamic.literal(comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null, committer = null)
    __obj.asInstanceOf[CommentsurlCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentsurlCommit] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Reposurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: CommentcountCommitter): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: Reposurl): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterNull: Self = StObject.set(x, "committer", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[HtmlurlStringShaString]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: HtmlurlStringShaString*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
