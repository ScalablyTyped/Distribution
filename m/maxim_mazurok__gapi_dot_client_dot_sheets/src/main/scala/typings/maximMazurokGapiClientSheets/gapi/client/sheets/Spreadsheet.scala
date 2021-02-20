package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spreadsheet extends StObject {
  
  /** Output only. A list of data source refresh schedules. */
  var dataSourceSchedules: js.UndefOr[js.Array[DataSourceRefreshSchedule]] = js.native
  
  /** A list of external data sources connected with the spreadsheet. */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.native
  
  /** The developer metadata associated with a spreadsheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  
  /** The named ranges defined in a spreadsheet. */
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.native
  
  /** Overall properties of a spreadsheet. */
  var properties: js.UndefOr[SpreadsheetProperties] = js.native
  
  /** The sheets that are part of a spreadsheet. */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.native
  
  /** The ID of the spreadsheet. This field is read-only. */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /** The url of the spreadsheet. This field is read-only. */
  var spreadsheetUrl: js.UndefOr[String] = js.native
}
object Spreadsheet {
  
  @scala.inline
  def apply(): Spreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spreadsheet]
  }
  
  @scala.inline
  implicit class SpreadsheetMutableBuilder[Self <: Spreadsheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceSchedules(value: js.Array[DataSourceRefreshSchedule]): Self = StObject.set(x, "dataSourceSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceSchedulesUndefined: Self = StObject.set(x, "dataSourceSchedules", js.undefined)
    
    @scala.inline
    def setDataSourceSchedulesVarargs(value: DataSourceRefreshSchedule*): Self = StObject.set(x, "dataSourceSchedules", js.Array(value :_*))
    
    @scala.inline
    def setDataSources(value: js.Array[DataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    @scala.inline
    def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    @scala.inline
    def setNamedRanges(value: js.Array[NamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    @scala.inline
    def setNamedRangesVarargs(value: NamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: SpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSheets(value: js.Array[Sheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setSpreadsheetUrl(value: String): Self = StObject.set(x, "spreadsheetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetUrlUndefined: Self = StObject.set(x, "spreadsheetUrl", js.undefined)
  }
}
