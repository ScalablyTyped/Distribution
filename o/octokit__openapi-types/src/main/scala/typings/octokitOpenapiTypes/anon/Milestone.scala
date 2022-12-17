package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_planned
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reopened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Milestone extends StObject {
  
  /** @description Login for the user that this issue should be assigned to. **This field is deprecated.** */
  var assignee: js.UndefOr[String | Null] = js.undefined
  
  /** @description Logins for Users to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this Issue. Send an empty array (`[]`) to clear all assignees from the Issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._ */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description The contents of the issue. */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /** @description Labels to associate with this issue. Pass one or more Labels to _replace_ the set of Labels on this Issue. Send an empty array (`[]`) to clear all Labels from the Issue. _NOTE: Only users with push access can set labels for issues. Labels are silently dropped otherwise._ */
  var labels: js.UndefOr[js.Array[String | Color]] = js.undefined
  
  var milestone: js.UndefOr[String | Double | Null] = js.undefined
  
  /**
    * @description State of the issue. Either `open` or `closed`.
    * @enum {string}
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  /**
    * @description The reason for the current state
    * @example not_planned
    * @enum {string|null}
    */
  var state_reason: js.UndefOr[completed | not_planned | reopened | Null] = js.undefined
  
  /** @description The title of the issue. */
  var title: js.UndefOr[String | Double | Null] = js.undefined
}
object Milestone {
  
  inline def apply(): Milestone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Milestone]
  }
  
  extension [Self <: Milestone](x: Self) {
    
    inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setLabels(value: js.Array[String | Color]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: (String | Color)*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMilestone(value: String | Double): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    inline def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setState_reason(value: completed | not_planned | reopened): Self = StObject.set(x, "state_reason", value.asInstanceOf[js.Any])
    
    inline def setState_reasonNull: Self = StObject.set(x, "state_reason", null)
    
    inline def setState_reasonUndefined: Self = StObject.set(x, "state_reason", js.undefined)
    
    inline def setTitle(value: String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
