package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecurrenceType extends StObject
/**
  * Specifies the type of recurrence.
  *
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RecurrenceType")
@js.native
object RecurrenceType extends StObject {
  
  /**
    * Daily.
    */
  @js.native
  sealed trait Daily extends RecurrenceType
  
  /**
    * Monthly.
    */
  @js.native
  sealed trait Monthly extends RecurrenceType
  
  /**
    * Weekday.
    */
  @js.native
  sealed trait Weekday extends RecurrenceType
  
  /**
    * Weekly.
    */
  @js.native
  sealed trait Weekly extends RecurrenceType
  
  /**
    * Yearly.
    */
  @js.native
  sealed trait Yearly extends RecurrenceType
}
