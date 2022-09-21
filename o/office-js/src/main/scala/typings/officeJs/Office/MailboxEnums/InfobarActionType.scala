package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InfobarActionType extends StObject
/**
  * Action types supported by {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType.InfobarClicked}.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  */
@JSGlobal("Office.MailboxEnums.InfobarActionType")
@js.native
object InfobarActionType extends StObject {
  
  /**
    * Dismiss action was selected.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait Dismiss
    extends StObject
       with InfobarActionType
}
