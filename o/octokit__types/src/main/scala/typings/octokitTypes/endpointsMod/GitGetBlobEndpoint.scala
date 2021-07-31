package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitGetBlobEndpoint extends StObject {
  
  var file_sha: String
  
  var owner: String
  
  var repo: String
}
object GitGetBlobEndpoint {
  
  @scala.inline
  def apply(file_sha: String, owner: String, repo: String): GitGetBlobEndpoint = {
    val __obj = js.Dynamic.literal(file_sha = file_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetBlobEndpoint]
  }
  
  @scala.inline
  implicit class GitGetBlobEndpointMutableBuilder[Self <: GitGetBlobEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile_sha(value: String): Self = StObject.set(x, "file_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
