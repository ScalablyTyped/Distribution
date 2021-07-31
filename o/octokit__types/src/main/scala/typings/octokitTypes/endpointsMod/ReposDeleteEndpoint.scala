package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
}
object ReposDeleteEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposDeleteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteEndpointMutableBuilder[Self <: ReposDeleteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
