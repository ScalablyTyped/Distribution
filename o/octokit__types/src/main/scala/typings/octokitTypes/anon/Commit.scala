package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commit extends StObject {
  
  var author: Gravatarid
  
  var commit: Tree
  
  var committer: Gravatarid
  
  var node_id: String
  
  var parents: js.Array[ShaUrl]
  
  var sha: String
  
  var url: String
}
object Commit {
  
  inline def apply(
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
  
  extension [Self <: Commit](x: Self) {
    
    inline def setAuthor(value: Gravatarid): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: Tree): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: Gravatarid): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[ShaUrl]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: ShaUrl*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
