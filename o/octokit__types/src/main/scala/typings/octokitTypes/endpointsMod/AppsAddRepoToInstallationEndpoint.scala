package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsAddRepoToInstallationEndpoint extends StObject {
  
  var installation_id: Double = js.native
  
  var repository_id: Double = js.native
}
object AppsAddRepoToInstallationEndpoint {
  
  @scala.inline
  def apply(installation_id: Double, repository_id: Double): AppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsAddRepoToInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsAddRepoToInstallationEndpointMutableBuilder[Self <: AppsAddRepoToInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
