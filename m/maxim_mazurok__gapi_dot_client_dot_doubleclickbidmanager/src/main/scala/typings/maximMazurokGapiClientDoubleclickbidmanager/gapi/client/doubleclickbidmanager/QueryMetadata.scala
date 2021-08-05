package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryMetadata extends StObject {
  
  /** Range of report data. */
  var dataRange: js.UndefOr[String] = js.undefined
  
  /** Format of the generated report. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The path to the location in Google Cloud Storage where the latest report is stored. */
  var googleCloudStoragePathForLatestReport: js.UndefOr[String] = js.undefined
  
  /** The path in Google Drive for the latest report. */
  var googleDrivePathForLatestReport: js.UndefOr[String] = js.undefined
  
  /** The time when the latest report started to run. */
  var latestReportRunTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR BRAZILIAN_PORTUGUESE ru RUSSIAN
    * tr TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE An locale string not in the list above will generate reports in English.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /** Number of reports that have been generated for the query. */
  var reportCount: js.UndefOr[Double] = js.undefined
  
  /** Whether the latest report is currently running. */
  var running: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to send an email notification when a report is ready. Default to false. */
  var sendNotification: js.UndefOr[Boolean] = js.undefined
  
  /** List of email addresses which are sent email notifications when the report is finished. Separate from sendNotification. */
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
    
    inline def setDataRange(value: String): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGoogleCloudStoragePathForLatestReport(value: String): Self = StObject.set(x, "googleCloudStoragePathForLatestReport", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudStoragePathForLatestReportUndefined: Self = StObject.set(x, "googleCloudStoragePathForLatestReport", js.undefined)
    
    inline def setGoogleDrivePathForLatestReport(value: String): Self = StObject.set(x, "googleDrivePathForLatestReport", value.asInstanceOf[js.Any])
    
    inline def setGoogleDrivePathForLatestReportUndefined: Self = StObject.set(x, "googleDrivePathForLatestReport", js.undefined)
    
    inline def setLatestReportRunTimeMs(value: String): Self = StObject.set(x, "latestReportRunTimeMs", value.asInstanceOf[js.Any])
    
    inline def setLatestReportRunTimeMsUndefined: Self = StObject.set(x, "latestReportRunTimeMs", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setReportCount(value: Double): Self = StObject.set(x, "reportCount", value.asInstanceOf[js.Any])
    
    inline def setReportCountUndefined: Self = StObject.set(x, "reportCount", js.undefined)
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    inline def setSendNotification(value: Boolean): Self = StObject.set(x, "sendNotification", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationUndefined: Self = StObject.set(x, "sendNotification", js.undefined)
    
    inline def setShareEmailAddress(value: js.Array[String]): Self = StObject.set(x, "shareEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setShareEmailAddressUndefined: Self = StObject.set(x, "shareEmailAddress", js.undefined)
    
    inline def setShareEmailAddressVarargs(value: String*): Self = StObject.set(x, "shareEmailAddress", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
