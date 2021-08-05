package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesUpdateMilestoneEndpoint extends StObject {
  
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.undefined
  
  var milestone_number: Double
  
  var owner: String
  
  var repo: String
  
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  /**
    * The title of the milestone.
    */
  var title: js.UndefOr[String] = js.undefined
}
object IssuesUpdateMilestoneEndpoint {
  
  inline def apply(milestone_number: Double, owner: String, repo: String): IssuesUpdateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateMilestoneEndpoint]
  }
  
  extension [Self <: IssuesUpdateMilestoneEndpoint](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
    
    inline def setMilestone_number(value: Double): Self = StObject.set(x, "milestone_number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
