package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An array of NotificationMessageDetails objects are returned by the NotificationMessages.getAllAsync method.
     *
     * [Api set: Mailbox 1.3]
     *
     * @remarks
     * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
     *
     * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
     */

trait NotificationMessageDetails extends js.Object {
  /**
           * A reference to an icon that is defined in the manifest in the Resources section. It appears in the infobar area. 
           * It is only applicable if the type is InformationalMessage. Specifying this parameter for an unsupported type results in an exception.
           */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The identifier for the notification message.
           */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The text of the notification message. Maximum length is 150 characters. 
           * If the developer passes in a longer string, an ArgumentOutOfRange exception is thrown.
           */
  var message: java.lang.String
  /**
           * Only applicable when type is InformationalMessage. If true, the message remains until removed by this add-in or dismissed by the user. 
           * If false, it is removed when the user navigates to a different item. 
           * For error notifications, the message persists until the user sees it once. 
           * Specifying this parameter for an unsupported type throws an exception.
           */
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Specifies the ItemNotificationMessageType of message. If type is ProgressIndicator or ErrorMessage, an icon is automatically supplied and 
           * the message is not persistent. Therefore the icon and persistent properties are not valid for these types of messages. 
           * Including them will result in an ArgumentException. 
           * If type is ProgressIndicator, the developer should remove or replace the progress indicator when the action is complete.
           */
  var `type`: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.ItemNotificationMessageType
}

