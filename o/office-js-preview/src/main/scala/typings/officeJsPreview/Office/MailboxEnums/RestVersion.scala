package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RestVersion extends StObject
/**
  * Specifies the version of the REST API that corresponds to a REST-formatted item ID.
  *
  * @remarks
  * [Api set: Mailbox 1.3]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RestVersion")
@js.native
object RestVersion extends StObject {
  
  /**
    * Beta.
    */
  @js.native
  sealed trait Beta
    extends StObject
       with RestVersion
  
  /**
    * Version 1.0.
    */
  @js.native
  sealed trait v1_0
    extends StObject
       with RestVersion
  
  /**
    * Version 2.0.
    */
  @js.native
  sealed trait v2_0
    extends StObject
       with RestVersion
}
