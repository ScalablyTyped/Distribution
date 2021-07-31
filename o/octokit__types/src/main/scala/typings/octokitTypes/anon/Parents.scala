package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parents extends StObject {
  
  var author: Avatarurl
  
  var comments_url: String
  
  var commit: AuthorCommentcount
  
  var committer: Avatarurl
  
  var html_url: String
  
  var parents: js.Array[HtmlurlSha]
  
  var repository: Branchesurl
  
  var score: Double
  
  var sha: String
  
  var url: String
}
object Parents {
  
  @scala.inline
  def apply(
    author: Avatarurl,
    comments_url: String,
    commit: AuthorCommentcount,
    committer: Avatarurl,
    html_url: String,
    parents: js.Array[HtmlurlSha],
    repository: Branchesurl,
    score: Double,
    sha: String,
    url: String
  ): Parents = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parents]
  }
  
  @scala.inline
  implicit class ParentsMutableBuilder[Self <: Parents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: AuthorCommentcount): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Avatarurl): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[HtmlurlSha]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: HtmlurlSha*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
