package typings.officeDashJsDashPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Office.MailboxEnums.RestVersion.Beta
import typings.officeDashJsDashPreview.Office.MailboxEnums.RestVersion.v1_0
import typings.officeDashJsDashPreview.Office.MailboxEnums.RestVersion.v2_0
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RestVersion with String] = js.native
  /* "beta" */ @js.native
  object Beta extends TopLevel[Beta with String]
  
  /* "v1.0" */ @js.native
  object v1_0 extends TopLevel[v1_0 with String]
  
  /* "v2.0" */ @js.native
  object v2_0 extends TopLevel[v2_0 with String]
  
}

