package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesDeleteMilestoneEndpoint extends StObject {
  
  var milestone_number: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object IssuesDeleteMilestoneEndpoint {
  
  @scala.inline
  def apply(milestone_number: Double, owner: String, repo: String): IssuesDeleteMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class IssuesDeleteMilestoneEndpointMutableBuilder[Self <: IssuesDeleteMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMilestone_number(value: Double): Self = StObject.set(x, "milestone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
