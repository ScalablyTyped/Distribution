package typings.officeDashJs.OfficeNs.MailboxEnumsNs

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
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RestVersion")
@js.native
object RestVersion extends js.Object {
  /**
    * Beta.
    */
  @js.native
  sealed trait Beta extends RestVersion
  
  /**
    * Version 1.0.
    */
  @js.native
  sealed trait v1_0 extends RestVersion
  
  /**
    * Version 2.0.
    */
  @js.native
  sealed trait v2_0 extends RestVersion
  
  /* "beta" */ val Beta: typings.officeDashJs.OfficeNs.MailboxEnumsNs.RestVersion.Beta with String = js.native
  /* "v1.0" */ val v1_0: typings.officeDashJs.OfficeNs.MailboxEnumsNs.RestVersion.v1_0 with String = js.native
  /* "v2.0" */ val v2_0: typings.officeDashJs.OfficeNs.MailboxEnumsNs.RestVersion.v2_0 with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RestVersion with String] = js.native
}

