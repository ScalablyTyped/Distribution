package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commit extends StObject {
  
  var author: Gravatarid = js.native
  
  var commit: Tree = js.native
  
  var committer: Gravatarid = js.native
  
  var node_id: String = js.native
  
  var parents: js.Array[ShaUrl] = js.native
  
  var sha: String = js.native
  
  var url: String = js.native
}
object Commit {
  
  @scala.inline
  def apply(
    author: Gravatarid,
    commit: Tree,
    committer: Gravatarid,
    node_id: String,
    parents: js.Array[ShaUrl],
    sha: String,
    url: String
  ): Commit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  
  @scala.inline
  implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Gravatarid): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: Tree): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: Gravatarid): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[ShaUrl]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: ShaUrl*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
