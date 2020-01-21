package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkRecipientsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientsChangedEventArgs extends js.Object {
  /** 
    * Gets an object that indicates change state of recipients fields. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var changedRecipientsFields: RecipientsChangedFields
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkRecipientsChanged
}

object RecipientsChangedEventArgs {
  @scala.inline
  def apply(changedRecipientsFields: RecipientsChangedFields, `type`: olkRecipientsChanged): RecipientsChangedEventArgs = {
    val __obj = js.Dynamic.literal(changedRecipientsFields = changedRecipientsFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEventArgs]
  }
}

