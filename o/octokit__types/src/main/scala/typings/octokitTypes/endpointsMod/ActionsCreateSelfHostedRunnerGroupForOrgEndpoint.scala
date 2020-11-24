package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateSelfHostedRunnerGroupForOrgEndpoint extends js.Object {
  
  /**
    * Name of the runner group.
    */
  var name: String = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * List of runner IDs to add to the runner group.
    */
  var runners: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * List of repository IDs that can access the runner group.
    */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to private repositories. Can be one of: `all`, `selected`, or `private`.
    */
  var visibility: js.UndefOr[selected | all | `private`] = js.native
}
object ActionsCreateSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(name: String, org_ : String): ActionsCreateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateSelfHostedRunnerGroupForOrgEndpointOps[Self <: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnersVarargs(value: Double*): Self = this.set("runners", js.Array(value :_*))
    
    @scala.inline
    def setRunners(value: js.Array[Double]): Self = this.set("runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunners: Self = this.set("runners", js.undefined)
    
    @scala.inline
    def setSelected_repository_idsVarargs(value: Double*): Self = this.set("selected_repository_ids", js.Array(value :_*))
    
    @scala.inline
    def setSelected_repository_ids(value: js.Array[Double]): Self = this.set("selected_repository_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected_repository_ids: Self = this.set("selected_repository_ids", js.undefined)
    
    @scala.inline
    def setVisibility(value: selected | all | `private`): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
