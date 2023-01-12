package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.ActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of the action for a notification message.
  *
  * **Important**: In modern Outlook on the web, the `NotificationMessageAction` object is available in Compose mode only.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait NotificationMessageAction extends StObject {
  
  /**
    * The text of the action link.
    */
  var actionText: String
  
  /**
    * The type of action to be performed.
    * `ActionType.ShowTaskPane` is the only supported action.
    */
  var actionType: String | ActionType
  
  /**
    * The button defined in the manifest based on the item type.
    */
  var commandId: String
  
  /**
    * Any JSON data the action button needs to pass on.
    * This data can be retrieved by calling `item.getInitializationContextAsync`.
    */
  var contextData: Any
}
object NotificationMessageAction {
  
  inline def apply(actionText: String, actionType: String | ActionType, commandId: String, contextData: Any): NotificationMessageAction = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], actionType = actionType.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], contextData = contextData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessageAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationMessageAction] (val x: Self) extends AnyVal {
    
    inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: String | ActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setContextData(value: Any): Self = StObject.set(x, "contextData", value.asInstanceOf[js.Any])
  }
}
