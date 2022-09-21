package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  var author: Avatarurl | Null
  
  /** Format: uri */
  var comments_url: String
  
  var commit: AuthorCommentcount
  
  var committer: DateEmail | Null
  
  /** Format: uri */
  var html_url: String
  
  var node_id: String
  
  var parents: js.Array[HtmlurlShaUrl]
  
  var repository: Branchesurl
  
  var score: Double
  
  var sha: String
  
  var text_matches: js.UndefOr[js.Array[Fragment]] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Score {
  
  inline def apply(
    comments_url: String,
    commit: AuthorCommentcount,
    html_url: String,
    node_id: String,
    parents: js.Array[HtmlurlShaUrl],
    repository: Branchesurl,
    score: Double,
    sha: String,
    url: String
  ): Score = {
    val __obj = js.Dynamic.literal(comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null, committer = null)
    __obj.asInstanceOf[Score]
  }
  
  extension [Self <: Score](x: Self) {
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: AuthorCommentcount): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: DateEmail): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterNull: Self = StObject.set(x, "committer", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[HtmlurlShaUrl]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: HtmlurlShaUrl*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setText_matches(value: js.Array[Fragment]): Self = StObject.set(x, "text_matches", value.asInstanceOf[js.Any])
    
    inline def setText_matchesUndefined: Self = StObject.set(x, "text_matches", js.undefined)
    
    inline def setText_matchesVarargs(value: Fragment*): Self = StObject.set(x, "text_matches", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
