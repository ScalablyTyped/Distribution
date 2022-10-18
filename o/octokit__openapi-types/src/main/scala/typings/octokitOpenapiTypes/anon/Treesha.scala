package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Treesha extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
  
  var tree_sha: String
}
object Treesha {
  
  inline def apply(owner: String, repo: String, tree_sha: String): Treesha = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Treesha]
  }
  
  extension [Self <: Treesha](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTree_sha(value: String): Self = StObject.set(x, "tree_sha", value.asInstanceOf[js.Any])
  }
}
