package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityType extends js.Object

/**
  * Specifies an entity's type.
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityType with String] = js.native
  /* "address" */ @js.native
  object Address extends TopLevel[Address with String]
  
  /* "contact" */ @js.native
  object Contact extends TopLevel[Contact with String]
  
  /* "emailAddress" */ @js.native
  object EmailAddress extends TopLevel[EmailAddress with String]
  
  /* "meetingSuggestion" */ @js.native
  object MeetingSuggestion extends TopLevel[MeetingSuggestion with String]
  
  /* "phoneNumber" */ @js.native
  object PhoneNumber extends TopLevel[PhoneNumber with String]
  
  /* "taskSuggestion" */ @js.native
  object TaskSuggestion extends TopLevel[TaskSuggestion with String]
  
  /* "url" */ @js.native
  object Url extends TopLevel[Url with String]
  
}

