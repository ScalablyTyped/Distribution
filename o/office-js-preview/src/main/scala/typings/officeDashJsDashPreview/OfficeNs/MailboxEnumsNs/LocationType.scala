package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationType extends js.Object

/**
  * Specifies an appointment location's type.
  * 
  * [Api set: Mailbox Preview]
  * 
  * @remarks
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
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
  
  /* "custom" */ val Custom: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.LocationType.Custom with String = js.native
  /* "room" */ val Room: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.LocationType.Room with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LocationType with String] = js.native
}

