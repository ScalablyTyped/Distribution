package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsGetRepoInstallationEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object AppsGetRepoInstallationEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): AppsGetRepoInstallationEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetRepoInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetRepoInstallationEndpointMutableBuilder[Self <: AppsGetRepoInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
