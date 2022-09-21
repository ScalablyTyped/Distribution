package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkRecipientsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientsChangedEventArgs extends StObject {
  
  /**
    * Gets an object that indicates change state of recipients fields.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var changedRecipientFields: RecipientsChangedFields
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkRecipientsChanged
}
object RecipientsChangedEventArgs {
  
  inline def apply(changedRecipientFields: RecipientsChangedFields): RecipientsChangedEventArgs = {
    val __obj = js.Dynamic.literal(changedRecipientFields = changedRecipientFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkRecipientsChanged")
    __obj.asInstanceOf[RecipientsChangedEventArgs]
  }
  
  extension [Self <: RecipientsChangedEventArgs](x: Self) {
    
    inline def setChangedRecipientFields(value: RecipientsChangedFields): Self = StObject.set(x, "changedRecipientFields", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkRecipientsChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
