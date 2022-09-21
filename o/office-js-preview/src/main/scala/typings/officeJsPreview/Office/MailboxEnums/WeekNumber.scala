package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekNumber extends StObject
/**
  * Specifies the week of the month.
  *
  * @remarks
  * [Api set: Mailbox 1.7]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.WeekNumber")
@js.native
object WeekNumber extends StObject {
  
  /**
    * First week of the month.
    */
  @js.native
  sealed trait First
    extends StObject
       with WeekNumber
  
  /**
    * Fourth week of the month.
    */
  @js.native
  sealed trait Fourth
    extends StObject
       with WeekNumber
  
  /**
    * Last week of the month.
    */
  @js.native
  sealed trait Last
    extends StObject
       with WeekNumber
  
  /**
    * Second week of the month.
    */
  @js.native
  sealed trait Second
    extends StObject
       with WeekNumber
  
  /**
    * Third week of the month.
    */
  @js.native
  sealed trait Third
    extends StObject
       with WeekNumber
}
