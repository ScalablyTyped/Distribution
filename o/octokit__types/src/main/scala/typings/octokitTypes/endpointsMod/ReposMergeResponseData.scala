package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.ShaUrl
import typings.octokitTypes.anon.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposMergeResponseData extends StObject {
  
  var author: Avatarurl
  
  var comments_url: String
  
  var commit: Verification
  
  var committer: Avatarurl
  
  var html_url: String
  
  var node_id: String
  
  var parents: js.Array[ShaUrl]
  
  var sha: String
  
  var url: String
}
object ReposMergeResponseData {
  
  inline def apply(
    author: Avatarurl,
    comments_url: String,
    commit: Verification,
    committer: Avatarurl,
    html_url: String,
    node_id: String,
    parents: js.Array[ShaUrl],
    sha: String,
    url: String
  ): ReposMergeResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeResponseData]
  }
  
  extension [Self <: ReposMergeResponseData](x: Self) {
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: Verification): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: Avatarurl): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[ShaUrl]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: ShaUrl*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
