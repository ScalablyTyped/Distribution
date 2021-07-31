package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array of `NotificationMessageDetails` objects are returned by the `NotificationMessages.getAllAsync` method.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait NotificationMessageDetails extends StObject {
  
  /**
    * Specifies actions for the message. Limit: 1 action. This limit doesn't count the "Dismiss" action which is included by default.
    * Only applicable when the type is `InsightMessage`.
    * Specifying this property for an unsupported type or including too many actions throws an error.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @beta
    */
  var actions: js.UndefOr[js.Array[NotificationMessageAction]] = js.undefined
  
  /**
    * A reference to an icon that is defined in the manifest in the `Resources` section. It appears in the infobar area.
    * It is only applicable if the type is `InformationalMessage`. Specifying this parameter for an unsupported type results in an exception.
    *
    * **Note**: At present, the custom icon is displayed in Outlook on Windows only and not on other clients (e.g., Mac, web browser).
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the notification message.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The text of the notification message. Maximum length is 150 characters.
    * If the developer passes in a longer string, an `ArgumentOutOfRange` exception is thrown.
    */
  var message: String
  
  /**
    * Specifies if the message should be persistent. Only applicable when type is `InformationalMessage`.
    * If true, the message remains until removed by this add-in or dismissed by the user.
    * If false, it is removed when the user navigates to a different item.
    * For error notifications, the message persists until the user sees it once.
    * Specifying this parameter for an unsupported type throws an exception.
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the `ItemNotificationMessageType` of message.
    *
    * If type is `ProgressIndicator` or `ErrorMessage`, an icon is automatically supplied
    * and the message is not persistent. Therefore the icon and persistent properties are not valid for these types of messages.
    * Including them will result in an `ArgumentException`.
    *
    * If type is `ProgressIndicator`, the developer should remove or replace the progress indicator when the action is complete.
    */
  var `type`: ItemNotificationMessageType | String
}
object NotificationMessageDetails {
  
  @scala.inline
  def apply(message: String, `type`: ItemNotificationMessageType | String): NotificationMessageDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessageDetails]
  }
  
  @scala.inline
  implicit class NotificationMessageDetailsMutableBuilder[Self <: NotificationMessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[NotificationMessageAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: NotificationMessageAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setType(value: ItemNotificationMessageType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
