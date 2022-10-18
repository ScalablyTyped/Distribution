package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorCommitter extends StObject {
  
  /** @description Identifying information for the git-user */
  var author: DateEmailName
  
  /** @description Identifying information for the git-user */
  var committer: DateEmailName
  
  /** Format: uri */
  var html_url: String
  
  /**
    * @description Message describing the purpose of the commit
    * @example Fix #42
    */
  var message: String
  
  var node_id: String
  
  var parents: js.Array[HtmlurlString]
  
  /**
    * @description SHA for the commit
    * @example 7638417db6d59f3c431d3e1f261cc637155684cd
    */
  var sha: String
  
  var tree: Sha
  
  /** Format: uri */
  var url: String
  
  var verification: Verified
}
object AuthorCommitter {
  
  inline def apply(
    author: DateEmailName,
    committer: DateEmailName,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[HtmlurlString],
    sha: String,
    tree: Sha,
    url: String,
    verification: Verified
  ): AuthorCommitter = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorCommitter]
  }
  
  extension [Self <: AuthorCommitter](x: Self) {
    
    inline def setAuthor(value: DateEmailName): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: DateEmailName): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[HtmlurlString]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: HtmlurlString*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setTree(value: Sha): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Verified): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
