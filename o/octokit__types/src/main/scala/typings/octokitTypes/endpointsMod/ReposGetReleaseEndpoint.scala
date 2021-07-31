package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetReleaseEndpoint extends StObject {
  
  var owner: String
  
  var release_id: Double
  
  var repo: String
}
object ReposGetReleaseEndpoint {
  
  @scala.inline
  def apply(owner: String, release_id: Double, repo: String): ReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetReleaseEndpointMutableBuilder[Self <: ReposGetReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
