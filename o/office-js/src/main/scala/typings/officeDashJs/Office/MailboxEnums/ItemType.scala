package typings.officeDashJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

/**
  * Specifies an item's type.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemType")
@js.native
object ItemType extends js.Object {
  /**
    * An appointment item.
    */
  @js.native
  sealed trait Appointment extends ItemType
  
  /**
    * An email, meeting request, meeting response, or meeting cancellation.
    */
  @js.native
  sealed trait Message extends ItemType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ItemType with String] = js.native
  /* "appointment" */ @js.native
  object Appointment
    extends TopLevel[typings.officeDashJs.Office.MailboxEnums.ItemType.Appointment with String]
  
  /* "message" */ @js.native
  object Message
    extends TopLevel[typings.officeDashJs.Office.MailboxEnums.ItemType.Message with String]
  
}

