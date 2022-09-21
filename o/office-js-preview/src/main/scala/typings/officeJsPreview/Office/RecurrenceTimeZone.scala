package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the time zone of the recurrence.
  *
  * @remarks
  * [Api set: Mailbox 1.7]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait RecurrenceTimeZone extends StObject {
  
  /**
    * Represents the name of the recurrence time zone.
    */
  var name: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone | String
  
  /**
    * Integer value representing the difference in minutes between the local time zone and UTC at the date that the meeting series began.
    */
  var offset: js.UndefOr[Double] = js.undefined
}
object RecurrenceTimeZone {
  
  inline def apply(name: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone | String): RecurrenceTimeZone = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceTimeZone]
  }
  
  extension [Self <: RecurrenceTimeZone](x: Self) {
    
    inline def setName(value: typings.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
