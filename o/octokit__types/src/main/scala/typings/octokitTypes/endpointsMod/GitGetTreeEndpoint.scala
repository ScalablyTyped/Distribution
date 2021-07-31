package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitGetTreeEndpoint extends StObject {
  
  var owner: String
  
  /**
    * Setting this parameter to any value returns the objects or subtrees referenced by the tree specified in `:tree_sha`. For example, setting `recursive` to any of the following will enable returning objects or subtrees: `0`, `1`, `"true"`, and `"false"`. Omit this parameter to prevent recursively returning objects or subtrees.
    */
  var recursive: js.UndefOr[String] = js.undefined
  
  var repo: String
  
  var tree_sha: String
}
object GitGetTreeEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, tree_sha: String): GitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeEndpoint]
  }
  
  @scala.inline
  implicit class GitGetTreeEndpointMutableBuilder[Self <: GitGetTreeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: String): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree_sha(value: String): Self = StObject.set(x, "tree_sha", value.asInstanceOf[js.Any])
  }
}
