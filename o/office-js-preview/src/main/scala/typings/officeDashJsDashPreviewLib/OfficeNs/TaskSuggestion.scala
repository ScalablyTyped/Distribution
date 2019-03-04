package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a suggested task identified in an item. Read mode only.
  *
  * The list of tasks suggested in an email message is returned in the taskSuggestions property of the {@link Office.Entities | Entities} object 
  * that is returned when the getEntities or getEntitiesByType method is called on the active item.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait TaskSuggestion extends js.Object {
  /**
    * Gets the users that should be assigned a suggested task.
    */
  var assignees: js.Array[EmailUser]
  /**
    * Gets the text of an item that was identified as a task suggestion.
    */
  var taskString: java.lang.String
}

object TaskSuggestion {
  @scala.inline
  def apply(assignees: js.Array[EmailUser], taskString: java.lang.String): TaskSuggestion = {
    val __obj = js.Dynamic.literal(assignees = assignees, taskString = taskString)
  
    __obj.asInstanceOf[TaskSuggestion]
  }
}

