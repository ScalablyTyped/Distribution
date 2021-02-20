package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.ActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of the action for a notification message.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * @beta
  */
@js.native
trait NotificationMessageAction extends StObject {
  
  /**
    * The text of the action link.
    */
  var actionText: String = js.native
  
  /**
    * The type of action to be performed.
    * `ActionType.ShowTaskPane` is the only supported action.
    */
  var actionType: String | ActionType = js.native
  
  /**
    * The button defined in the manifest based on the item type.
    */
  var commandId: String = js.native
  
  /**
    * Any JSON data the button needs to pass on.
    */
  var contextData: js.Any = js.native
}
object NotificationMessageAction {
  
  @scala.inline
  def apply(actionText: String, actionType: String | ActionType, commandId: String, contextData: js.Any): NotificationMessageAction = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], actionType = actionType.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], contextData = contextData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessageAction]
  }
  
  @scala.inline
  implicit class NotificationMessageActionMutableBuilder[Self <: NotificationMessageAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: String | ActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextData(value: js.Any): Self = StObject.set(x, "contextData", value.asInstanceOf[js.Any])
  }
}
