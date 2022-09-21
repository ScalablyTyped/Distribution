package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryMetadata extends StObject {
  
  /** Range of report data. All reports will be based on the same time zone as used by the advertiser. */
  var dataRange: js.UndefOr[DataRange] = js.undefined
  
  /** Format of the generated report. */
  var format: js.UndefOr[String] = js.undefined
  
  /** Whether to send an email notification when a report is ready. Defaults to false. */
  var sendNotification: js.UndefOr[Boolean] = js.undefined
  
  /** List of email addresses which are sent email notifications when the report is finished. Separate from send_notification. */
  var shareEmailAddress: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Query title. It is used to name the reports generated from this query. */
  var title: js.UndefOr[String] = js.undefined
}
object QueryMetadata {
  
  inline def apply(): QueryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryMetadata]
  }
  
  extension [Self <: QueryMetadata](x: Self) {
    
    inline def setDataRange(value: DataRange): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setSendNotification(value: Boolean): Self = StObject.set(x, "sendNotification", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationUndefined: Self = StObject.set(x, "sendNotification", js.undefined)
    
    inline def setShareEmailAddress(value: js.Array[String]): Self = StObject.set(x, "shareEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setShareEmailAddressUndefined: Self = StObject.set(x, "shareEmailAddress", js.undefined)
    
    inline def setShareEmailAddressVarargs(value: String*): Self = StObject.set(x, "shareEmailAddress", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
