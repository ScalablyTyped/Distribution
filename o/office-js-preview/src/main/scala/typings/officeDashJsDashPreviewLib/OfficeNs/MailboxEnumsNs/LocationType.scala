package typings
package officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs

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
  sealed trait Custom
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.LocationType
  
  /**
    * A conference room or similar resource.
    */
  @js.native
  sealed trait Room
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.LocationType
  
  /* "custom" */ val Custom: Custom with java.lang.String = js.native
  /* "room" */ val Room: Room with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.LocationType with java.lang.String
  ] = js.native
}

