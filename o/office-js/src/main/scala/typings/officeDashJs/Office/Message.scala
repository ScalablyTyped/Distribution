package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subclass of {@link Office.Item | Item} for messages.
  * 
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
  * You should treat this as a mode of Office.context.mailbox.item. Refer to the
  * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/requirement-set-1.8/office.context.mailbox.item | Object Model} page for more information.
  */
@js.native
trait Message extends Item {
  /**
    * Gets an identifier for the email conversation that contains a particular message.
    *
    * You can get an integer for this property if your mail app is activated in read forms or responses in compose forms. 
    * If subsequently the user changes the subject of the reply message, upon sending the reply, the conversation ID for that message will 
    * change and that value you obtained earlier will no longer apply.
    *
    * You get null for this property for a new item in a compose form. 
    * If the user sets a subject and saves the item, the conversationId property will return a value.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var conversationId: String = js.native
}

