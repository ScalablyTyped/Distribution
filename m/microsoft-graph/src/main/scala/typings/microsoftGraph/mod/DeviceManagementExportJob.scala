package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementExportJob
  extends StObject
     with Entity {
  
  // Time that the exported report expires
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  // Filters applied on the report
  var filter: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Format of the exported report. Possible values are: csv, json.
  var format: js.UndefOr[DeviceManagementReportFileFormat] = js.undefined
  
  /**
    * Configures how the requested export job is localized. Possible values are: localizedValuesAsAdditionalColumn,
    * replaceLocalizableValues.
    */
  var localizationType: js.UndefOr[DeviceManagementExportJobLocalizationType] = js.undefined
  
  // Name of the report
  var reportName: js.UndefOr[String] = js.undefined
  
  // Time that the exported report was requested
  var requestDateTime: js.UndefOr[String] = js.undefined
  
  // Columns selected from the report
  var select: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or
    * CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to
    * the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a
    * CachedReportConfiguration id.
    */
  var snapshotId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Status of the export job. Possible values are: unknown, notStarted, inProgress, completed, failed.
  var status: js.UndefOr[DeviceManagementReportStatus] = js.undefined
  
  // Temporary location of the exported report
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceManagementExportJob {
  
  inline def apply(): DeviceManagementExportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementExportJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceManagementExportJob] (val x: Self) extends AnyVal {
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setFilter(value: NullableOption[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFormat(value: DeviceManagementReportFileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocalizationType(value: DeviceManagementExportJobLocalizationType): Self = StObject.set(x, "localizationType", value.asInstanceOf[js.Any])
    
    inline def setLocalizationTypeUndefined: Self = StObject.set(x, "localizationType", js.undefined)
    
    inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    
    inline def setRequestDateTime(value: String): Self = StObject.set(x, "requestDateTime", value.asInstanceOf[js.Any])
    
    inline def setRequestDateTimeUndefined: Self = StObject.set(x, "requestDateTime", js.undefined)
    
    inline def setSelect(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectNull: Self = StObject.set(x, "select", null)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value*))
    
    inline def setSnapshotId(value: NullableOption[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdNull: Self = StObject.set(x, "snapshotId", null)
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    inline def setStatus(value: DeviceManagementReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
