package typings.officeDashJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityType extends js.Object

/**
  * Specifies an entity's type.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.EntityType")
@js.native
object EntityType extends js.Object {
  /**
    * Specifies that the entity is a postal address.
    */
  @js.native
  sealed trait Address extends EntityType
  
  /**
    * Specifies that the entity is a contact.
    */
  @js.native
  sealed trait Contact extends EntityType
  
  /**
    * Specifies that the entity is an SMTP email address.
    */
  @js.native
  sealed trait EmailAddress extends EntityType
  
  /**
    * Specifies that the entity is a meeting suggestion.
    */
  @js.native
  sealed trait MeetingSuggestion extends EntityType
  
  /**
    * Specifies that the entity is a US phone number.
    */
  @js.native
  sealed trait PhoneNumber extends EntityType
  
  /**
    * Specifies that the entity is a task suggestion.
    */
  @js.native
  sealed trait TaskSuggestion extends EntityType
  
  /**
    * Specifies that the entity is an Internet URL.
    */
  @js.native
  sealed trait Url extends EntityType
  
  /* "address" */ val Address: typings.officeDashJs.Office.MailboxEnums.EntityType.Address with String = js.native
  /* "contact" */ val Contact: typings.officeDashJs.Office.MailboxEnums.EntityType.Contact with String = js.native
  /* "emailAddress" */ val EmailAddress: typings.officeDashJs.Office.MailboxEnums.EntityType.EmailAddress with String = js.native
  /* "meetingSuggestion" */ val MeetingSuggestion: typings.officeDashJs.Office.MailboxEnums.EntityType.MeetingSuggestion with String = js.native
  /* "phoneNumber" */ val PhoneNumber: typings.officeDashJs.Office.MailboxEnums.EntityType.PhoneNumber with String = js.native
  /* "taskSuggestion" */ val TaskSuggestion: typings.officeDashJs.Office.MailboxEnums.EntityType.TaskSuggestion with String = js.native
  /* "url" */ val Url: typings.officeDashJs.Office.MailboxEnums.EntityType.Url with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityType with String] = js.native
}

