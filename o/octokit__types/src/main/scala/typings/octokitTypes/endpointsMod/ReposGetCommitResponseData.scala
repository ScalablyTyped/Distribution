package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Changes
import typings.octokitTypes.anon.Commentcount
import typings.octokitTypes.anon.Deletions
import typings.octokitTypes.anon.Sha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetCommitResponseData extends StObject {
  
  var author: Avatarurl
  
  var comments_url: String
  
  var commit: Commentcount
  
  var committer: Avatarurl
  
  var files: js.Array[Changes]
  
  var html_url: String
  
  var node_id: String
  
  var parents: js.Array[Sha]
  
  var sha: String
  
  var stats: Deletions
  
  var url: String
}
object ReposGetCommitResponseData {
  
  @scala.inline
  def apply(
    author: Avatarurl,
    comments_url: String,
    commit: Commentcount,
    committer: Avatarurl,
    files: js.Array[Changes],
    html_url: String,
    node_id: String,
    parents: js.Array[Sha],
    sha: String,
    stats: Deletions,
    url: String
  ): ReposGetCommitResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitResponseData]
  }
  
  @scala.inline
  implicit class ReposGetCommitResponseDataMutableBuilder[Self <: ReposGetCommitResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: Commentcount): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Avatarurl): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: js.Array[Changes]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: Changes*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[Sha]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: Sha*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Deletions): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
