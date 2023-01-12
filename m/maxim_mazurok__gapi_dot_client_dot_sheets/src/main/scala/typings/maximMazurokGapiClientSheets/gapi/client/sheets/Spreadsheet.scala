package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spreadsheet extends StObject {
  
  /** Output only. A list of data source refresh schedules. */
  var dataSourceSchedules: js.UndefOr[js.Array[DataSourceRefreshSchedule]] = js.undefined
  
  /** A list of external data sources connected with the spreadsheet. */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.undefined
  
  /** The developer metadata associated with a spreadsheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  
  /** The named ranges defined in a spreadsheet. */
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
  
  /** Overall properties of a spreadsheet. */
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
  
  /** The sheets that are part of a spreadsheet. */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
  
  /** The ID of the spreadsheet. This field is read-only. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /** The url of the spreadsheet. This field is read-only. */
  var spreadsheetUrl: js.UndefOr[String] = js.undefined
}
object Spreadsheet {
  
  inline def apply(): Spreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spreadsheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spreadsheet] (val x: Self) extends AnyVal {
    
    inline def setDataSourceSchedules(value: js.Array[DataSourceRefreshSchedule]): Self = StObject.set(x, "dataSourceSchedules", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSchedulesUndefined: Self = StObject.set(x, "dataSourceSchedules", js.undefined)
    
    inline def setDataSourceSchedulesVarargs(value: DataSourceRefreshSchedule*): Self = StObject.set(x, "dataSourceSchedules", js.Array(value*))
    
    inline def setDataSources(value: js.Array[DataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value*))
    
    inline def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value*))
    
    inline def setNamedRanges(value: js.Array[NamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    inline def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    inline def setNamedRangesVarargs(value: NamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value*))
    
    inline def setProperties(value: SpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSheets(value: js.Array[Sheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    inline def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "sheets", js.Array(value*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setSpreadsheetUrl(value: String): Self = StObject.set(x, "spreadsheetUrl", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetUrlUndefined: Self = StObject.set(x, "spreadsheetUrl", js.undefined)
  }
}
