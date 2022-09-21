package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InfobarType extends StObject
/**
  * Type of notification allowed by {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType.InfobarClicked}.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  */
@JSGlobal("Office.MailboxEnums.InfobarType")
@js.native
object InfobarType extends StObject {
  
  /**
    * Notification displays an error message.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait Error
    extends StObject
       with InfobarType
  
  /**
    * Notification displays an informational message.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait Informational
    extends StObject
       with InfobarType
  
  /**
    * Notification displays an informational message with actions.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait Insight
    extends StObject
       with InfobarType
  
  /**
    * Notification displays a progress indicator.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait ProgressIndicator
    extends StObject
       with InfobarType
}
