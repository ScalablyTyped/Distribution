package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsRemoveSelectedRepoFromOrgSecretEndpoint extends js.Object {
  
  @JSName("org")
  var org_ : String = js.native
  
  var repository_id: Double = js.native
  
  var secret_name: String = js.native
}
object ActionsRemoveSelectedRepoFromOrgSecretEndpoint {
  
  @scala.inline
  def apply(org_ : String, repository_id: Double, secret_name: String): ActionsRemoveSelectedRepoFromOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsRemoveSelectedRepoFromOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsRemoveSelectedRepoFromOrgSecretEndpointOps[Self <: ActionsRemoveSelectedRepoFromOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = this.set("repository_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = this.set("secret_name", value.asInstanceOf[js.Any])
  }
}
