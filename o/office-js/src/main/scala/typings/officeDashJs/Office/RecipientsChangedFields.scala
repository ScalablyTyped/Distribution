package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents `RecipientsChangedEventArgs.changedRecipientsFields` object. 
  * 
  * [Api set: Mailbox 1.7] 
  */ 
trait RecipientsChangedFields extends js.Object {
  /** 
    * Gets if optional attendees were changed. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var optionalAttendees: Boolean
  /** 
    * Gets if required attendees were changed. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var requiredAttendees: Boolean
  /** 
    * Gets if resources were changed. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var resources: Boolean
}

object RecipientsChangedFields {
  @scala.inline
  def apply(optionalAttendees: Boolean, requiredAttendees: Boolean, resources: Boolean): RecipientsChangedFields = {
    val __obj = js.Dynamic.literal(optionalAttendees = optionalAttendees, requiredAttendees = requiredAttendees, resources = resources)
  
    __obj.asInstanceOf[RecipientsChangedFields]
  }
}

