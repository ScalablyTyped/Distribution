package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsAddRepoToInstallationEndpoint extends js.Object {
  
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
  implicit class AppsAddRepoToInstallationEndpointOps[Self <: AppsAddRepoToInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstallation_id(value: Double): Self = this.set("installation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = this.set("repository_id", value.asInstanceOf[js.Any])
  }
}
