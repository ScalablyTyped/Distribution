package typings.officeJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationType extends js.Object
/**
  * Specifies an appointment location's type.
  * 
  * [Api set: Mailbox 1.8]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
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
}
