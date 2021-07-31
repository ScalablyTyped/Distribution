package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteReleaseEndpoint extends StObject {
  
  var owner: String
  
  var release_id: Double
  
  var repo: String
}
object ReposDeleteReleaseEndpoint {
  
  @scala.inline
  def apply(owner: String, release_id: Double, repo: String): ReposDeleteReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteReleaseEndpointMutableBuilder[Self <: ReposDeleteReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
