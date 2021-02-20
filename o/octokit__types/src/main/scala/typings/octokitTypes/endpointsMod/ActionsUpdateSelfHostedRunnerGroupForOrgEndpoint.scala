package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
  /**
    * Name of the runner group.
    */
  var name: js.UndefOr[String] = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double = js.native
  
  /**
    * Visibility of a runner group. You can select all repositories, select individual repositories, or all private repositories. Can be one of: `all`, `selected`, or `private`.
    */
  var visibility: js.UndefOr[selected | all | `private`] = js.native
}
object ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_group_id: Double): ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsUpdateSelfHostedRunnerGroupForOrgEndpointMutableBuilder[Self <: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: selected | all | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
