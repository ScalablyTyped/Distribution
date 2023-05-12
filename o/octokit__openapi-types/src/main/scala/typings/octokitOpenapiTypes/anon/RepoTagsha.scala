package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoTagsha extends StObject {
  
  var owner: String
  
  var repo: String
  
  var tag_sha: String
}
object RepoTagsha {
  
  inline def apply(owner: String, repo: String, tag_sha: String): RepoTagsha = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_sha = tag_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoTagsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoTagsha] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTag_sha(value: String): Self = StObject.set(x, "tag_sha", value.asInstanceOf[js.Any])
  }
}
