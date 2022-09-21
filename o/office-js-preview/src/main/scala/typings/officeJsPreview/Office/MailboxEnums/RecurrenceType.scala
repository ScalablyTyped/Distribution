package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecurrenceType extends StObject
/**
  * Specifies the type of recurrence.
  *
  * @remarks
  * [Api set: Mailbox 1.7]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RecurrenceType")
@js.native
object RecurrenceType extends StObject {
  
  /**
    * Daily.
    */
  @js.native
  sealed trait Daily
    extends StObject
       with RecurrenceType
  
  /**
    * Monthly.
    */
  @js.native
  sealed trait Monthly
    extends StObject
       with RecurrenceType
  
  /**
    * Weekday.
    */
  @js.native
  sealed trait Weekday
    extends StObject
       with RecurrenceType
  
  /**
    * Weekly.
    */
  @js.native
  sealed trait Weekly
    extends StObject
       with RecurrenceType
  
  /**
    * Yearly.
    */
  @js.native
  sealed trait Yearly
    extends StObject
       with RecurrenceType
}
