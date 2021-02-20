package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkRecipientsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientsChangedEventArgs extends StObject {
  
  /**
    * Gets an object that indicates change state of recipients fields.
    *
    * [Api set: Mailbox 1.7]
    */
  var changedRecipientFields: RecipientsChangedFields = js.native
  
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    *
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkRecipientsChanged = js.native
}
object RecipientsChangedEventArgs {
  
  @scala.inline
  def apply(changedRecipientFields: RecipientsChangedFields, `type`: olkRecipientsChanged): RecipientsChangedEventArgs = {
    val __obj = js.Dynamic.literal(changedRecipientFields = changedRecipientFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEventArgs]
  }
  
  @scala.inline
  implicit class RecipientsChangedEventArgsMutableBuilder[Self <: RecipientsChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedRecipientFields(value: RecipientsChangedFields): Self = StObject.set(x, "changedRecipientFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: olkRecipientsChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
