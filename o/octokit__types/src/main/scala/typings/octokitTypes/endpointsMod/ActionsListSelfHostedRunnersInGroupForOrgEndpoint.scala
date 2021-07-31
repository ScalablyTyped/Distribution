package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
}
object ActionsListSelfHostedRunnersInGroupForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_group_id: Double): ActionsListSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListSelfHostedRunnersInGroupForOrgEndpointMutableBuilder[Self <: ActionsListSelfHostedRunnersInGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}
