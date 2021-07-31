package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetLatestReleaseEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
}
object ReposGetLatestReleaseEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposGetLatestReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetLatestReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetLatestReleaseEndpointMutableBuilder[Self <: ReposGetLatestReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
