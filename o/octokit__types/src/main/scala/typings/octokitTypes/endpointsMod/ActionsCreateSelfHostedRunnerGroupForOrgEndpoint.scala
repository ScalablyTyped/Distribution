package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
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
  implicit class ActionsCreateSelfHostedRunnerGroupForOrgEndpointMutableBuilder[Self <: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    @scala.inline
    def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value :_*))
    
    @scala.inline
    def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    @scala.inline
    def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: selected | all | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
