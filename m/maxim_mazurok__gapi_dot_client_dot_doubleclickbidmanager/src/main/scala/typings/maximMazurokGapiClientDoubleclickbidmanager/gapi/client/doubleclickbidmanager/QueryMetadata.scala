package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryMetadata extends StObject {
  
  /** Range of report data. */
  var dataRange: js.UndefOr[String] = js.native
  
  /** Format of the generated report. */
  var format: js.UndefOr[String] = js.native
  
  /** The path to the location in Google Cloud Storage where the latest report is stored. */
  var googleCloudStoragePathForLatestReport: js.UndefOr[String] = js.native
  
  /** The path in Google Drive for the latest report. */
  var googleDrivePathForLatestReport: js.UndefOr[String] = js.native
  
  /** The time when the latest report started to run. */
  var latestReportRunTimeMs: js.UndefOr[String] = js.native
  
  /**
    * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR BRAZILIAN_PORTUGUESE ru RUSSIAN
    * tr TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE An locale string not in the list above will generate reports in English.
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Number of reports that have been generated for the query. */
  var reportCount: js.UndefOr[Double] = js.native
  
  /** Whether the latest report is currently running. */
  var running: js.UndefOr[Boolean] = js.native
  
  /** Whether to send an email notification when a report is ready. Default to false. */
  var sendNotification: js.UndefOr[Boolean] = js.native
  
  /** List of email addresses which are sent email notifications when the report is finished. Separate from sendNotification. */
  var shareEmailAddress: js.UndefOr[js.Array[String]] = js.native
  
  /** Query title. It is used to name the reports generated from this query. */
  var title: js.UndefOr[String] = js.native
}
object QueryMetadata {
  
  @scala.inline
  def apply(): QueryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryMetadata]
  }
  
  @scala.inline
  implicit class QueryMetadataMutableBuilder[Self <: QueryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRange(value: String): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGoogleCloudStoragePathForLatestReport(value: String): Self = StObject.set(x, "googleCloudStoragePathForLatestReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleCloudStoragePathForLatestReportUndefined: Self = StObject.set(x, "googleCloudStoragePathForLatestReport", js.undefined)
    
    @scala.inline
    def setGoogleDrivePathForLatestReport(value: String): Self = StObject.set(x, "googleDrivePathForLatestReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleDrivePathForLatestReportUndefined: Self = StObject.set(x, "googleDrivePathForLatestReport", js.undefined)
    
    @scala.inline
    def setLatestReportRunTimeMs(value: String): Self = StObject.set(x, "latestReportRunTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestReportRunTimeMsUndefined: Self = StObject.set(x, "latestReportRunTimeMs", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setReportCount(value: Double): Self = StObject.set(x, "reportCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCountUndefined: Self = StObject.set(x, "reportCount", js.undefined)
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    @scala.inline
    def setSendNotification(value: Boolean): Self = StObject.set(x, "sendNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationUndefined: Self = StObject.set(x, "sendNotification", js.undefined)
    
    @scala.inline
    def setShareEmailAddress(value: js.Array[String]): Self = StObject.set(x, "shareEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareEmailAddressUndefined: Self = StObject.set(x, "shareEmailAddress", js.undefined)
    
    @scala.inline
    def setShareEmailAddressVarargs(value: String*): Self = StObject.set(x, "shareEmailAddress", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
