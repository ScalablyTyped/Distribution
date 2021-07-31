package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetTopPathsEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
}
object ReposGetTopPathsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposGetTopPathsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetTopPathsEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetTopPathsEndpointMutableBuilder[Self <: ReposGetTopPathsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
