package typings.officeDashJsDashPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationType extends js.Object

/**
  * Specifies an appointment location's type.
  * 
  * [Api set: Mailbox 1.8]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.LocationType")
@js.native
object LocationType extends js.Object {
  /**
    * A custom location.
    */
  @js.native
  sealed trait Custom extends LocationType
  
  /**
    * A conference room or similar resource.
    */
  @js.native
  sealed trait Room extends LocationType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LocationType with String] = js.native
  /* "custom" */ @js.native
  object Custom extends TopLevel[Custom with String]
  
  /* "room" */ @js.native
  object Room extends TopLevel[Room with String]
  
}

