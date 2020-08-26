package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkRecipientsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientsChangedEventArgs extends js.Object {
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
  implicit class RecipientsChangedEventArgsOps[Self <: RecipientsChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangedRecipientFields(value: RecipientsChangedFields): Self = this.set("changedRecipientFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: olkRecipientsChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

