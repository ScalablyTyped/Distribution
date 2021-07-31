package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /** All calculated columns in the data source. */
  var calculatedColumns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
  
  /** The spreadsheet-scoped unique ID that identifies the data source. Example: 1080547365. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Sheet connected with the data source. The field cannot be changed once set. When creating a data source, an associated DATA_SOURCE sheet is also created, if the field
    * is not specified, the ID of the created sheet will be randomly generated.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /** The DataSourceSpec for the data source connected with this spreadsheet. */
  var spec: js.UndefOr[DataSourceSpec] = js.undefined
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculatedColumns(value: js.Array[DataSourceColumn]): Self = StObject.set(x, "calculatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedColumnsUndefined: Self = StObject.set(x, "calculatedColumns", js.undefined)
    
    @scala.inline
    def setCalculatedColumnsVarargs(value: DataSourceColumn*): Self = StObject.set(x, "calculatedColumns", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    @scala.inline
    def setSpec(value: DataSourceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
