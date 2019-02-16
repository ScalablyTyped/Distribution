package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RestVersion extends js.Object

/**
  * Specifies the version of the REST API that corresponds to a REST-formatted item ID.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  */
@JSGlobal("Office.MailboxEnums.RestVersion")
@js.native
object RestVersion extends js.Object {
  /**
    * Beta.
    */
  @js.native
  sealed trait Beta
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RestVersion
  
  /**
    * Version 1.0.
    */
  @js.native
  sealed trait v1_0
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RestVersion
  
  /**
    * Version 2.0.
    */
  @js.native
  sealed trait v2_0
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RestVersion
  
  /* "beta" */ val Beta: Beta with java.lang.String = js.native
  /* "v1.0" */ val v1_0: v1_0 with java.lang.String = js.native
  /* "v2.0" */ val v2_0: v2_0 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.RestVersion with java.lang.String] = js.native
}

