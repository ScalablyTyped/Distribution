package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitGetTagEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  var tag_sha: String
}
object GitGetTagEndpoint {
  
  inline def apply(owner: String, repo: String, tag_sha: String): GitGetTagEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_sha = tag_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTagEndpoint]
  }
  
  extension [Self <: GitGetTagEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTag_sha(value: String): Self = StObject.set(x, "tag_sha", value.asInstanceOf[js.Any])
  }
}
