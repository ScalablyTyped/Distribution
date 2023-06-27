package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.ItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of a message that's currently selected in Outlook.
  *
  * @remarks
  * [Api set: Mailbox 1.13]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write mailbox**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose, Message Read
  */
trait SelectedItemDetails extends StObject {
  
  /**
    * The identifier of the message conversation that contains the message that's currently selected.
    *
    * @beta
    */
  var conversationId: String
  
  /**
    * Returns `true` if the message that's currently selected contains an attachment.
    *
    * @beta
    */
  var hasAttachment: Boolean
  
  /**
    * The internet message identifier of the message that's currently selected.
    *
    * @beta
    */
  var internetMessageId: String
  
  /**
    * The Exchange Web Services (EWS) item identifier of the message that's currently selected.
    */
  var itemId: String
  
  /**
    * The Outlook mode (`Read` or `Compose`) of the message that's currently selected.
    */
  var itemMode: String
  
  /**
    * The type of the item that's currently selected. `Message` is the only supported type at this time.
    */
  var itemType: ItemType | String
  
  /**
    * The description that appears in the subject field of the message that's currently selected.
    */
  var subject: String
}
object SelectedItemDetails {
  
  inline def apply(
    conversationId: String,
    hasAttachment: Boolean,
    internetMessageId: String,
    itemId: String,
    itemMode: String,
    itemType: ItemType | String,
    subject: String
  ): SelectedItemDetails = {
    val __obj = js.Dynamic.literal(conversationId = conversationId.asInstanceOf[js.Any], hasAttachment = hasAttachment.asInstanceOf[js.Any], internetMessageId = internetMessageId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemMode = itemMode.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItemDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItemDetails] (val x: Self) extends AnyVal {
    
    inline def setConversationId(value: String): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setHasAttachment(value: Boolean): Self = StObject.set(x, "hasAttachment", value.asInstanceOf[js.Any])
    
    inline def setInternetMessageId(value: String): Self = StObject.set(x, "internetMessageId", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemMode(value: String): Self = StObject.set(x, "itemMode", value.asInstanceOf[js.Any])
    
    inline def setItemType(value: ItemType | String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
