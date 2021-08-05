package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesCreateMilestoneEndpoint extends StObject {
  
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  var repo: String
  
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  /**
    * The title of the milestone.
    */
  var title: String
}
object IssuesCreateMilestoneEndpoint {
  
  inline def apply(owner: String, repo: String, title: String): IssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateMilestoneEndpoint]
  }
  
  extension [Self <: IssuesCreateMilestoneEndpoint](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
